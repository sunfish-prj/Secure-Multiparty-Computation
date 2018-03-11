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
var client = function(config)
{
    this.BigInteger = require('jsbn').BigInteger;
    this.soap = require('soap');
    this.sm = require('sharemind-web-client');
    this.crypto = require('crypto');
    this.servers = null;
    this.pub = this.sm.types.base;
    this.priv = this.sm.types.shared3p;
    this.config = config;
}

client.prototype.SMdisconnect = function() {
    if (this.servers !== null) {
        console.log('Disconnecting from Sharemind.')
        this.servers.close();
        this.servers = null;
    }
}

client.prototype.SMconnect = function(callback) {
    var parent = this;
    if (this.servers === null) {
        console.log('Servers not yet connected.');

        try {
            console.log('Connecting to Sharemind servers.');
            var hosts = this.config.hosts;
            var uxpProperties = null;
            if (this.config.useuxp) {
                hosts = [
                    this.config.uxpservice[0].endpoint,
                    this.config.uxpservice[1].endpoint,
                    this.config.uxpservice[2].endpoint
                ];
                uxpProperties = [
                    this.config.uxpclient,
                    this.config.uxpservice[0],
                    this.config.uxpservice[1],
                    this.config.uxpservice[2]
                ];
            }

            this.servers = new this.sm.client.GatewayConnection(hosts, uxpProperties, 
                function(err) {console.log(err);});

            this.servers.openConnection(function(err, serverInfos, prngSeed) {
                // if an error accures
                if (err) {
                    return callback(err);
                }

                // if a pseudorandom number generator doesn't exist, create one from the seed
                if (!parent.sm.prng.instance) {
                    parent.sm.prng.init(prngSeed);
                }
                console.log('Connected to Sharemind servers.');
                callback();

            });
        } catch (err) {
            callback(err);
            this.SMdisconnect();
            return;
        }
    } else {
        console.log('Already connected to servers.');
        callback();
    }
}    

// Secret-share arguments
client.prototype.SMgetArgs = function(params) {
    var args = {};

    for (var pIx = 0; pIx < params.length; pIx++) {
      // Secret-share the input:
      var pub_value;
      if (typeof params[pIx].paramValue === 'number') {
        pub_value = new params[pIx].pubConstructor(1);
        pub_value.set(0, new params[pIx].pubType(''+params[pIx].paramValue, 10));
      } else {
        pub_value = new params[pIx].pubConstructor(params[pIx].paramValue.length);
        for (var eIx = 0; eIx < params[pIx].paramValue.length; eIx++) {
          pub_value.set(eIx, new params[pIx].pubType(''+params[pIx].paramValue[eIx], 10));
        }
      }

      if (typeof params[pIx].privConstructor !== 'undefined') {
        args[params[pIx].paramName] = new params[pIx].privConstructor(pub_value);
      } else {
        args[params[pIx].paramName] = pub_value;
      }
    }

    return args;
}

client.prototype.SMrunScript = function(codefile, params, callback) {
    var parent = this;

    this.SMconnect(function (err) {
        if (err) {
            if (callback) {
                callback(err);
                return;
            }
        }
        console.log('Shareing inputs');
        var args = parent.SMgetArgs(params);
        console.log('Starting to run MPC script');

        console.log(args);

        parent.servers.runMpcComputation(codefile, args, function (err, data, negotiationId) {
            if (err) {
                console.log(err);
            }
            console.log('MPC computation done');
            if (callback) {
                callback(undefined, data);
            }
        });
    });
}

client.prototype.addDocuments = function(data, callback) {
    // slice each keyword into 32 bit segments for the Bloom filter
    var keywordsArr = data.keywords.split(/,\s*|\n+/);
    var len = keywordsArr.length;
    var slices = [];

    for (var i = 0; i < len; i++) {
        var len2 = keywordsArr[i].length;

        if (len2 < 4) {
            keywordsArr[i] = keywordsArr[i] + "\0".repeat(4-len2);
        }
        
        len2 = keywordsArr[i].length;

        for (var j = 4; j <= len2; j++) {
            slices.push(keywordsArr[i].slice(j-4, j));
        }
    }

    len = slices.length;
    var slicesUINT = [];

    console.log(slices);

    for (var i = 0; i < len; i++) {
        var buffer = new Buffer(slices[i], "ascii");
        slicesUINT.push(buffer.readUInt32BE());
    }

    console.log(slicesUINT);

    var params = [
        {
            paramName: 'docid',
            paramValue: data.docid,
            pubType: this.BigInteger,
            pubConstructor: this.pub.Uint64Array,
            privConstructor: this.priv.Uint64Array
        },
        {
            paramName: 'owner',  // this is not the user id but the rocu id?
            paramValue: data.owner,
            pubType: this.BigInteger,
            pubConstructor: this.pub.Uint8Array,
            privConstructor: this.priv.Uint8Array
        },
        {
            paramName: 'confidentiality',
            paramValue: data.confidentiality,
            pubType: this.BigInteger,
            pubConstructor: this.pub.Uint8Array,
            privConstructor: this.priv.Uint8Array
        },
        {
            paramName: 'covered',
            paramValue: data.covered,
            pubType: this.BigInteger,
            pubConstructor: this.pub.BoolArray,
            privConstructor: this.priv.BoolArray
        },
        {
            paramName: 'words',
            paramValue: slicesUINT,
            pubType: this.BigInteger,
            pubConstructor: this.pub.Uint32Array,
            privConstructor: this.priv.XorUint32Array
        }
    ];

    this.SMrunScript('add-document', params, function(err, data) {
        callback(err, data);
    });
}

client.prototype.search = function(searchParams, callback) {
    var password = new Buffer(this.config.password, 'hex');

    // slice the keyword into 32 bit segments for the bloom filter 
    var keyword = searchParams.keyword;
    var slices = []
    var len = keyword.length;

    if (len < 4) {
        keyword = keyword + "\0".repeat(4-len);
    }
    
    len = keyword.length;
    for (var i = 4; i <= len; i++) {
        slices.push(keyword.slice(i-4, i));
    }

    len = slices.length;
    var slicesUINT = [];

    for (var i = 0; i < len; i++) {
        var buffer = new Buffer(slices[i], "ascii");
        slicesUINT.push(buffer.readUInt32BE());
    }

    console.log(slices);
    console.log(slicesUINT);

    var params = [
        {
            paramName: 'keyword',
            paramValue: slicesUINT,
            pubType: this.BigInteger,
            pubConstructor: this.pub.Uint32Array,
            privConstructor: this.priv.XorUint32Array
        },
        {
            paramName: 'vettingLevel',
            paramValue: searchParams.clearance, // It's actually a vetting level
            pubType: this.BigInteger,
            pubConstructor: this.pub.Uint8Array,
            privConstructor: this.priv.Uint8Array
        }
    ];

    // make the crypto library a local variable, because 'this' referse to a
    // different object while inside a child function
    var crypto = this.crypto;
    var parent = this;
    this.SMrunScript('search', params, function(err, data) {
        // If there were no results, there is nothing to do:
        console.log(data);
        if (data.matchcount.get(0) == 0) {
            console.log("No documents matched the search");
            callback(err, {});
            return;
        }

        // Check if `matches` is a valid AES ciphertext
        if (data.matches.length * data.matches.typesize % 16 != 0) {
            console.log('Error: Result is not a valid AES ciphertext!');
            return;
        }

        // Reorder bytes in ciphertexts:
        var len = data.matches.length;
        var matches = Buffer.alloc(len * 4);
        for (var j = 0; j < len; j++) {
            matches.writeUInt32BE(data.matches.get(j), j*4);
        }
        var hexMatches = matches.toString('hex');
        console.log(hexMatches);

        // We distribute all excrypted results to all ROCU-s:
        var config = this.config;
        Object.keys(this.config.rocus).forEach(function (rid) {
            console.log("Notifying ROCU ID = " + rid);
            var url = config.rocus[rid].endpoint;

            // multiplying the slice indices by 16 because the a buffer is indexed with bytes
            // and a AES block size is 16 bytes.
            // console.log(matches.slice(16*i, 16*(i+1)).toString('hex'));
            var args = {encryptedResult: hexMatches,
                        rocuId: config.rocuid,
                        searchId: searchParams.id,
                        searchUsername: searchParams.username,
                        searchClearance: searchParams.clearance,
                        keyword: keyword // TODO: This should also be encrypted
            };
            parent.soap.createClient(url + "?wsdl", function(err, client) {
                if (err) {
                    console.log(err);
                } else {
                    console.log(url);
                    console.log(client.describe());
                    client.on('request', function (envelope) {
                        console.log('Client request event');
                        console.log(envelope);
                    });
                    client.setEndpoint(url);
                    client.postSearchResult(args, function(err, result, raw, soapHeader) {
                        if (err) {
                            console.log("Error sending search result to ROCU.");
                            console.log(err);
                        }
                        console.log("Sent search result to ROCU");
                        console.log(result);
                    });
                }
            });
        });
        callback(err, {});
    });
}

module.exports = client;