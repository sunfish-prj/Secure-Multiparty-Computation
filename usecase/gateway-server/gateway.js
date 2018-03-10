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
const http = require('http');
// const soap = require('soap');
const fs = require('fs');
const EventEmitter = require('events');

// The main Sharemind Web Application Gateway API
const WebGateway = require('sharemind-web-gateway');

// Parse command line arguments
// usage: 'node gateway.js <name> <conf> <port> <hostname>'
if (process.argv.length <= 2)
  throw new Error('Usage: node gateway.js gatewayNumber [port] [hostname] [confFile]');

var gatewayNumber = parseInt(process.argv[2]);
if (isNaN(gatewayNumber) || gatewayNumber < 1 || gatewayNumber > 4)
  throw new Error('Invalid gatewayNumber argument, expecting an integer between 1 and 3 inclusive');

var gatewayName = 'Gateway' + gatewayNumber;
var gatewayPort = process.argv.length > 3 ? parseInt(process.argv[3]) : 8080 + gatewayNumber;
var gatewayHostname = process.argv.length > 4 ? process.argv[4] : '0.0.0.0';
var gatewayConfig = process.argv.length > 5 ? process.argv[5] : 'conf/gateway' + gatewayNumber + '.cfg';

// ---

// Sharemind server names (in order)
var serverNames = [
  'DebugMiner1',
  'DebugMiner2',
  'DebugMiner3'
];
var otherServerNames = serverNames;
otherServerNames.splice(gatewayNumber-1, 1);

var scriptsInfoMap = {};
scriptsInfoMap['add-document'] = {
  name: 'add-document.sb',
  type: 'multi', // 'multi' means this script does MPC computations
  otherServerNames: otherServerNames
};
scriptsInfoMap['search'] = {
  name: 'search.sb',
  type: 'multi',
  otherServerNames: otherServerNames
};

// ---

var client;

var logPrefix = '[' + gatewayName + ']';

function assert(cond, msg) {
  if (!msg)
    msg = "";
  console.assert(cond, msg);
}

function log(msg) {
  console.log(logPrefix + "[INFO]  " + msg);
}

function debug(msg) {
  console.log(logPrefix + "[DEBUG] " + msg);
}

function logErr(err, msg) {
  assert(err);
  if (msg)
    console.error(logPrefix + "[ERROR] " + msg);
  else
    console.error(logPrefix + "[ERROR] An error occurred:");
  console.error(err.stack || err);
}

// ---

// Gracefully close HTTP server
function closeHttpServer(callback) {
  if (httpServer && httpServer.address()) {
    log("Closing HTTP server...");
    httpServer.close(function () {
      log("Closed listening server.");
      callback();
    });
  } else {
    callback();
  }
}

// Gracefully close the WebGateway object
function closeWebGateway(callback) {
  if (gateway) {
    log("Closing gateway...");
    gateway.close(function(err) {
      if (err) {
        logErr(err, "Error when closing WebGateway object:");
      }
      log("Disconnected from Sharemind and closed WebGateway object.");
      gateway = null;
      callback();
    });
  } else {
    callback();
  }
}

function stop(rv) {
  closeHttpServer(function() {
    closeWebGateway(function() {
      assert(!gateway);
      process.exit(rv);
    });
  });
}

process.on("SIGTERM", function () {
  log("Caught SIGTERM, closing gateway...");
  stop(0);
});

process.on("SIGINT", function () {
  log("Caught SIGINT, closing gateway...");
  stop(0);
});

process.on('uncaughtException', function(err) {
  logErr(err, "Uncaught exception:");
  stop(1);
});

// HTTP server  
var httpServer = http.createServer(function(request,response) {
    response.writeHead(404);
    response.end("404: Not Found: " + request.url + "\n");
});

debug('Other server names: ' + otherServerNames);

// Initialize the Sharemind Web Application Gateway object, read in configuration
log('Initializing WebGateway...');
var gateway = WebGateway.getInstance(gatewayConfig, log);

log('WebGateway initialized. Got serverInfo from Sharemind: ' + JSON.stringify(gateway.getServerInfo()));
log('Connecting to Sharemind...');

// Connect gateway to Sharemind and start the HTTP server
gateway.connect(function (err) {
  if (err) {
    logErr(err, 'Error when connecting to Sharemind');
    return stop(1);
  }

  log('Connected gateway to Sharemind. Running server...');
  // TODO: Move starting SOAP server here.
  log('Gateway listening on hostname: \'' + gatewayHostname + '\', port: \'' + gatewayPort + '\'');
});


httpServer.listen(gatewayPort, gatewayHostname);
var xml = fs.readFileSync('sharemind-soap.wsdl', 'utf8');

// Logger object to pass to SOAP service
var logger = {
  log: log,
  error: logErr,
  debug: debug
}

const soap = require('./sharemind-gateway-soap-service');
soap.createSharemindSoapService(gateway, scriptsInfoMap, httpServer, xml, logger);