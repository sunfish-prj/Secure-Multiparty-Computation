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
const bcrypt = require('bcrypt');

module.exports = function(db) {
    db.serialize(function() {
        db.run("CREATE TABLE Users (" +
            "id               INTEGER       PRIMARY KEY  AUTOINCREMENT, " +
            "name             VARCHAR(50)                NOT NULL, " +
            "username         VARCHAR(50)                NOT NULL, " +
            "password         VARCHAR                    NOT NULL," +
            "clearance        INTEGER                    NOT NULL" +
        ");");

        db.run("CREATE TABLE Documents (" +
            "id               INTEGER       PRIMARY KEY  AUTOINCREMENT, " +
            "owner            INTEGER                    NOT NULL, " +
            "keywords         VARCHAR(100)               NOT NULL," +
            "filename         VARCHAR(100)               NOT NULL," +
            "confidentiality  INTEGER                    NOT NULL," +
            "covered          INTEGER                    NOT NULL" +
        ");");

        // If hits equals 0, it means that the search has not been approved
        db.run("CREATE TABLE Searches (" +
            "id               INTEGER       PRIMARY KEY  AUTOINCREMENT, " +
            "userid           INTEGER                    NOT NULL, " +
            "hits             INTEGER                    NOT NULL, " +
            "keyword          VARCHAR(100)               NOT NULL," +
            "date             TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP" +
        ");");
        db.run("CREATE TABLE SearchFiles (" +
            "searchid         INTEGER                    NOT NULL, " +
            "rocuid           INTEGER                    NOT NULL, " +
            "filename         VARCHAR(100)               NOT NULL" +
        ");");

        db.run("CREATE TABLE Reviews (" + 
            "id               INTEGER       PRIMARY KEY  AUTOINCREMENT, " +
            "searchid         INTEGER                    NOT NULL, " +
            "rocuid           INTEGER                    NOT NULL, " +
            "username         VARCHAR(50)                NOT NULL, " +
            "clearance        INTEGER                    NOT NULL," +
            "hits             INTEGER                    NOT NULL, " +
            "keyword          VARCHAR(100)               NOT NULL," +
            "date             TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP" +
        ");");
        // approval value is 
        //   -1 if the file needs approving,
        //    1 if it was manually approved and
        //    0 if it was automatically approved
        db.run("CREATE TABLE ReviewFiles (" +
            "reviewid         INTEGER                    NOT NULL, " +
            "fileid           INTEGER                    NOT NULL, " +
            "approval         INTEGER                    NOT NULL," +
            "approver         INTEGER" +
        ");");

        // var statement = db.prepare("INSERT INTO Users VALUES (?, ?, ?, ?, ?)");
        // statement.run(null, 'S. Holmes', 'sholmes', bcrypt.hashSync("sholmes", 10), 1);

        // statement = db.prepare("INSERT INTO Documents (id, owner, keywords, filename," +
        //     " confidentiality, covered) VALUES (?, ?, ?, ?, ?, ?);");
        // statement.run(null, 1, "Jack the ripper", "jack.parchemnt", 1, 0);

        // statement = db.prepare("INSERT INTO Searches (id, userid, hits, keyword) VALUES (?, ?, ?, ?);");
        // statement.run(null, 1, 0, 'Jack the ripper');

        // statement = db.prepare("INSERT INTO SearchFiles VALUES (?, ?, ?);");
        // statement.run(1, 1, 'jack.parchemnt');

        // statement = db.prepare("INSERT INTO Reviews (id, searchid, rocuid, username, clearance, hits, keyword) " + 
        //     " VALUES (?, ?, ?, ?, ?, ?, ?)");
        // statement.run(null, 1, 1, 'S. Holmes', 1, 1, 'Jack the ripper');

        // statement = db.prepare("INSERT INTO ReviewFiles VALUES (?, ?, ?, ?)");
        // statement.run(1, 1, -1, null);
    });
}