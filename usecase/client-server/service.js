/**
 * This file is part of the SUNFISH project (http://www.sunfishproject.eu/).
 * 
 * Copyright 2017 Cybernetica AS
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
     * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
const express = require('express');
const fs = require("fs");
const sqlite3 = require("sqlite3").verbose();
const bodyParser = require('body-parser');
const jwt = require('jsonwebtoken');
const crypto = require('crypto');
const bcrypt = require('bcrypt');
const soap = require('soap');
const moment = require('moment-timezone');

var sm = require('./sm_client.js');
var sm_client = new sm();

var clientDir = __dirname + "/public/";

if (process.argv.length === 3) {
    try {
        var config = JSON.parse(fs.readFileSync(process.argv[2]));
    } catch (err) {
        console.log(err);
        process.exit(1);
    }
} else {
    console.log("Please provide a configuration file");
    process.exit(1);
}

// openssl genrsa -out private.key 4096
var privateKey = fs.readFileSync(__dirname + '/private.key');
// openssl rsa -in private.key -pubout -out public.key
var publicKey = fs.readFileSync(__dirname + '/public.key');


/*------------------------------------*\
  CREATE A DATABASE
\*------------------------------------*/

var db_file = __dirname + "/database/database-" + config.rocuid + ".db";
var exists = fs.existsSync(db_file);
var db = new sqlite3.Database(db_file);
var DBaddDoc = require(__dirname + "/database/add_doc");
var DBaddSearch = require(__dirname + "/database/add_search");
var DBaddReview = require(__dirname + "/database/add_review");

if (!exists) {
    var createdb = require(__dirname + "/database/create");
    createdb(db);
}

var render404 = function(response) {
    response.status(404).render(clientDir + "404.ejs");
}

/*
   EXPRESS APPLICATION MIDDLEWARE
*/
var app = express();
app.set('view engine', 'ejs');
app.use('/', express.static(clientDir));

// for parsing application/json
app.use(bodyParser.urlencoded({
    extended: true
}));
app.use(bodyParser.json());
app.use(bodyParser.raw({type: function(){return true;}, limit: '5mb'}));

var rocu_service = {
    SunfishUC3RocuService: {
        UC3RocuEndpoint: {
            postSearchResult: function(args) {
                console.log("Got postSearchResult")
                console.log(args)

                // var len = args.encryptedResult.length;
                // var buf = Buffer.alloc(len * 4);
                // for (var i = 0; i < len; i++) {
                //     buf.writeUInt32BE(args.encryptedResult.get(i), i*4);
                // }

                console.log("Decrypting...");
                const decipher = crypto.createDecipheriv('aes-128-ecb', new Buffer(config.password, 'hex'), '');
                decipher.setAutoPadding(false);

                try {
                    var decrypted = decipher.update(args.encryptedResult, 'hex', 'hex');
                    decrypted += decipher.final('hex');
                    console.log("Decrypted: ", decrypted);

                    // Iterate over matched documents:
                    var documents = [];
                    var decBytes = new Buffer(decrypted, 'hex');
                    for (var i = 0; i < decBytes.length/16; i++) {
                        var ownerId = decBytes.readUInt32BE(i*16);
                        if (ownerId == config.rocuid) {
                            var docid = decBytes.readUInt32BE(i*16+4);
                            var autoApprove = decBytes.readUInt32BE(i*16+8);
                            console.log("Matched document ID =", docid, " (auto approve =", autoApprove, ")");

                            // Approval flag has different mapping in db:
                            dbAutoApprove = -1; // needs approval by default
                            if (autoApprove == 1) dbAutoApprove = 0;

                            documents.push([docid, dbAutoApprove]);
                        } else {
                            console.log("Ignoring document match, owner ID =", ownerId);
                        }
                    }

                    // Notify searcher of automatically apporved results:
                    for (var i = 0; i < documents.length; ++i) {
                        if (documents[i][1] == 0) {
                            console.log("Automatically approving search for ROCU ID = " + args.rocuId
                                + ", search ID = " + args.searchId 
                                + ", file ID = " + documents[i][0]);
                            var fileid = documents[i][0];
                            approveSearchResult(args.rocuId, args.searchId, documents[i][0],
                                function (err, result) {
                                    if (err) {
                                        // As a fallback, mark that document to be manually approved
                                        // This should never happen
                                        console.log("Automatic approval of document ID = " + fileid + " failed");
                                    } else {
                                        console.log("Successfully autoapproved document ID = " + fileid);
                                    }
                                }
                            );
                        }
                    }

                    // Add matched documents to database:
                    if (documents.length > 0) {
                        console.log("Adding", documents.length, "documents to review database...");
                        try {
                            db.serialize(function () {
                                var stmt = db.prepare("INSERT INTO Reviews (id, searchid, rocuid, username, clearance, hits, keyword) VALUES (?, ?, ?, ?, ?, ?, ?);");
                                stmt.run(null, args.searchId, args.rocuId, args.searchUsername, args.searchClearance, documents.length, args.keyword);

                                db.get("SELECT last_insert_rowid() AS id;", [], function(err, row){
                                    if (typeof row !== 'undefined') {
                                        stmt = db.prepare("INSERT INTO ReviewFiles VALUES (?, ?, ?, ?);");
                                        for (var i = 0; i < documents.length; ++i)
                                            stmt.run(row.id, documents[i][0], documents[i][1], null);
                                    }
                                });
                            }); 
                        } catch (dbe) {
                            console.log("Error. Could not add review documents to db.");
                            console.log(dbe);
                        }
                    }
                } catch (err) {
                    console.log("Recieved a message not meant for me, cannot decrypt");
                }

                // Have to finish with SOAP result:
                return {success: 1};
            },
            searchResultListing: function(args) {
                console.log("Got searchResultListing");
                console.log(args);
                try {
                    var stmt = db.prepare("INSERT INTO SearchFiles VALUES (?, ?, ?);");
                    stmt.run(args.searchId, args.rocuId, args.filename, function (err) {
                        if (err) {
                            console.log("Error. Updating SearchFiles database failed.");
                            console.log(err);
                            return {success: 0};
                        }
                        db.run("UPDATE Searches SET hits = hits + 1 WHERE id = ?;", 
                            [args.searchId], function (err) {
                                if (err) {
                                    console.log("Error. Updating Search database failed.");
                                    console.log(err);
                                    return {success: 0};
                                } else {
                                    console.log("Successfully updated Search database");
                                    return {success: 1};
                                }
                            }
                        );
                    });
                } catch (err) {
                    console.log("Error. Updating Search database failed.");
                    console.log(err);
                }

                return {success: 0};
            }
        }
    }
};

function clearanceToString(cl_lvl) {
    if (cl_lvl == 1) return 'CTC';
    else if (cl_lvl == 2) return 'SC';
    else if (cl_lvl == 3) return 'CV';
    return 'undefined';
}

function confidentialityToString(co_lvl) {
    if (co_lvl == 1) return 'Official';
    else if (co_lvl == 2) return 'Official Sensitive';
    else if (co_lvl == 3) return 'Secret';
    else if (co_lvl == 4) return 'Top Secret';
    return 'undefined';
}

function approveSearchResult (rocuid, searchid, fileid, callback) {
    try {
        // Get filename
        db.get("SELECT filename FROM Documents WHERE id = ?;", [fileid], function (err, row) {
            var filename = '<undisclosed filename>';
            if (row !== 'undefined') filename = row.filename;

            var url = config.rocus[rocuid].endpoint;
            soap.createClient(url + "?wsdl", function(err, client) {
                if (err) {
                    console.log(err);
                    callback(err, null);
                    return;
                } else {
                    console.log(url);
                    console.log(client.describe());
                    client.on('request', function (envelope) {
                        console.log('Client request event');
                        console.log(envelope);
                    });
                    client.setEndpoint(url);
                    var args = {
                        rocuId: config.rocuid,
                        searchId: searchid,
                        filename: filename
                    };
                    client.searchResultListing(args, function(err, result, raw, soapHeader) {
                        if (err) {
                            console.log(err);
                            callback(err, null);
                            return;
                        }
                        console.log(result);
                        callback(null, result);
                    });
                }
            });

        });

    } catch (err) {
        console.log(err);
        callback(err, null);
    }
}

/*------------------------------------*\
  AUTHENTICATION
\*------------------------------------*/

// Verify if a person is already logged in
app.post('/auth', function(req, res) {
    var token = req.body.jwt;
    try {
        var decoded = jwt.verify(token, publicKey);
        res.status(200).send('Success');
    } catch (err) {
        console.log(err);
        res.status(401).send('Failure');
    }
});

// Login
app.post('/auth/login', function(req, res) {
    db.serialize(function() {
        console.log("Logging in as " + req.body.username);
        db.get("SELECT password, clearance, name FROM Users where username = ?;",
        [req.body.username],
        function(err, row) {
            if (typeof row !== 'undefined') {
                bcrypt.compare(req.body.password, row.password, function(err, isCorrect) {
                    if (isCorrect) {
                        console.log("Login successful");
                        var token = jwt.sign(req.body.username, privateKey, {algorithm: 'RS256'});
                        var data = {
                            token: token,
                            username: req.body.username,
                            name: row.name,
                            clearance: clearanceToString(row.clearance)
                        };
                        res.status(200).send(data);
                    } else {
                        console.log("Error. Wrong password");
                        res.status(401).send('Failure');
                    }
                })
            } else {
                console.log("Error. No such user exists");
                res.status(401).send('Failure');
            }
        });
    });
});


/*------------------------------------*\
  POST REQUESTS
\*------------------------------------*/

// Add documents
app.post('/list/send', function(req, res) {
    // console.log(JSON.stringify(req.body));
    var token = req.body.jwt;
    try {
        // returns the username associated with the token
        var decoded = jwt.verify(token, publicKey);
        db.serialize(function() {
            db.get("SELECT id FROM Users WHERE username = ?;", [decoded], function(err, row) {
                if (typeof row !== 'undefined') {
                    req.body.user = row.id;  // unique id of the user
                    DBaddDoc(db, req.body, function(docid) {
                        var params = {
                            docid: docid,  // unique id of the document
                            owner: config.rocuid,  // id of this rocu
                            keywords: req.body.keywords,
                            confidentiality: req.body.confidentiality,
                            covered: req.body.covered
                        };

                        sm_client.addDocuments(params, function(err, data) {
                            if (!err) {
                                res.status(200).send("Added");
                            }
                        });
                    });
                }
            });
        });
        
    } catch (err) {
        res.status(401).send("Failure");
    }
});

// Search for a keyword
app.post('/search/send', function(req, res) {
    var token = req.body.jwt;
    try {
        // returns the username associated with the token
        var decoded = jwt.verify(token, publicKey);
        db.serialize(function() {
            db.get("SELECT id, name, clearance FROM Users WHERE username = ?;", [decoded], function(err, row)
            {
                var searchParams = {
                    username: row.name,
                    clearance: row.clearance
                }
                DBaddSearch(db, req.body.keyword, row.id, function(searchid) {
                    searchParams.id = searchid;
                    sm_client.search(req.body.keyword, config, searchParams, function(err, data) {
                        if (!err) {
                            res.status(200).end();
                        } else {
                            console.log(err);
                        }
                    });
                });
            });
        });
    } catch (err) {
        console.log(err);
        res.status(401).send("Failure");
    }
});

// Approve a file search
app.post('/review/send', function(req, res) {
    console.log("Approving search for review ID = " + req.body.reviewid
        + ", ROCU ID = " + req.body.rocuid
        + ", search ID = " + req.body.searchid 
        + ", file ID = " + req.body.fileid);
    approveSearchResult(req.body.rocuid, req.body.searchid, req.body.fileid,
        function (err, result) {
            if (err) {
                res.status(400).send('Failure');
                return;
            }
            console.log("Marking review ID = " + req.body.reviewid
                + ", file ID = " + req.body.fileid + " as APPROVED");

            // Get active user ID
            var token = req.body.jwt;
            try {
                // returns the username associated with that token
                var decoded = jwt.verify(token, publicKey);
                db.get("SELECT id FROM Users WHERE username = ?;", [decoded], function(err, row)
                {
                    if (typeof row !== 'undefined') {
                        console.log("User ID = " + row.id);
                        db.run("UPDATE ReviewFiles SET approval = 1, approver = ?"
                                + " WHERE reviewid = ? AND fileid = ?;", 
                            [row.id, req.body.reviewid, req.body.fileid],
                            function (err) {
                                console.log("Update statement callback");
                                if (err) {
                                    console.log("Error updating review database.");
                                    console.log(err);
                                    res.status(400).send("Failure");
                                } else {
                                    res.status(200).end();
                                }
                            }
                        );
                    }
                });
            } catch (err) {
                console.log(err);
                res.status(400).send("Failure");
            }
        }
    );
});


/*------------------------------------*\
  GET REQUESTS
\*------------------------------------*/

// Rest get request for the users uploaded documents
app.get('/rest/list/', function(req, res) {
    var token = req.headers.jwt;
    try {
        // returns the username associated with that token
        var decoded = jwt.verify(token, publicKey);
        db.serialize(function() {
            db.get("SELECT id FROM Users WHERE username = ?;", [decoded], function(err, row)
            {
                if (typeof row !== 'undefined') {
                    var userid = row.id;
                    db.all("SELECT filename, keywords, covered, confidentiality FROM Documents WHERE owner = ?", [userid], function(err, rows)
                    {
                        if (typeof rows !== 'undefined') {
                            for (var i = 0; i < rows.length; ++i) {
                                rows[i].confidentiality = confidentialityToString(rows[i].confidentiality);
                            }
                            res.status(200).send({list: rows}); 
                        } else {
                            res.status(200).send({list: []}); 
                        }
                    });
                }
            });
        });
    } catch (err) {
        console.log(err);
        res.status(401).send("Failure");
    }
});

// Rest get request for the users previous searches
app.get('/rest/search/', function(req, res) {
    var token = req.headers.jwt;
    try {
        // returns the username associated with that token
        var decoded = jwt.verify(token, publicKey);
        db.serialize(function() {
            db.get("SELECT id FROM Users WHERE username = ?;", [decoded], function(err, row)
            {
                if (typeof row !== 'undefined') {
                    var userid = row.id;
                    db.all("SELECT id, keyword, hits, date, rocuid, filename FROM Searches "
                        + " LEFT JOIN SearchFiles ON SearchFiles.searchid = Searches.id"
                        + " WHERE Searches.userid = ? ORDER BY date DESC;", [userid], function(err, rows)
                    {
                        if (typeof row !== 'undefined') {
                            console.log(rows);

                            for (var i = 0; i < rows.length; ++i) {
                                if (rows[i].rocuid)
                                    rows[i].rocuname = config.rocus[rows[i].rocuid].name;
                                var date = moment.tz(rows[i].date, "UTC").local();
                                rows[i].date = date.format("llll");
                                rows[i].htime = date.fromNow();
                            }
                            res.status(200).send({list: rows}); 
                        } else {
                            res.status(200).send({list: []}); 
                        }
                    });
                }
            });
        });
    } catch (err) {
        res.status(401).send("Failure");
    }
});

app.get('/rest/review/', function(req, res) {
    var token = req.headers.jwt;
    try {
        db.all("SELECT Reviews.*, Documents.filename, ReviewFiles.approval, ReviewFiles.fileid, Users.name as approver"
            + " FROM Reviews LEFT JOIN ReviewFiles ON Reviews.id = ReviewFiles.reviewid"
            + " LEFT JOIN Documents ON Documents.id = ReviewFiles.fileid"
            + " LEFT JOIN Users ON Users.id = ReviewFiles.approver"
            + " ORDER BY Reviews.date DESC;", function (err, rows) {
            if (typeof rows !== 'undefined') {
                console.log(rows);

                for (var i = 0; i < rows.length; ++i) {
                    rows[i].rocuname = config.rocus[rows[i].rocuid].name;
                    rows[i].clearance = clearanceToString(rows[i].clearance);
                    var date = moment.tz(rows[i].date, "UTC").local();
                    rows[i].date = date.format("llll");
                    rows[i].htime = date.fromNow();
                }

                res.status(200).send({list: rows});
            } else {
                res.status(200).send({list: []});
            }
        });
    } catch (err) {
        console.log("Error. Database query failed.");
        console.log(err);
        res.status(401).send("Failure");
    }
});


/*------------------------------------*\
  HTTP SERVER
\*------------------------------------*/

// handles page get requests
var servePage = function(nav, req, res) {
    var path = clientDir + nav + '/index.ejs';
    var data = {active: nav, rocuname: config.rocus[config.rocuid].name};

    try {
        var file = fs.lstatSync(path);

        if (file.isFile()) {
            res.render(path, data);
        }
    } catch (err) {
        console.log(err);
        // if such a page doesn't exist in the public directory
        // return a 404 page
        render404(res);
    }
}

app.get('/list', function(req, res) {
    servePage('list', req, res);
});

app.get('/search', function(req, res) {
    servePage('search', req, res);
});

app.get('/review', function(req, res) {
    servePage('review', req, res);
});

app.get('/login', function(req, res) {
    servePage('login', req, res);
});

app.listen(config.httpport, function () {
    console.log('Running on http://localhost:' + config.httpport);
    
    var xml = fs.readFileSync(__dirname + '/rocu-service.wsdl', 'utf8');
    var soapServer = soap.listen(app, '/wsdl', rocu_service, xml);

    // SOAP debug log
    soapServer.log = function(type, data) {
      prefix = '--';
      if (type == 'received') prefix = '->';
      if (type == 'replied') prefix = '<-';
      console.log(prefix + ' ' + data);
    }
});