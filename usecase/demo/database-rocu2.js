const sqlite3 = require("sqlite3").verbose();
const bcrypt = require('bcrypt');

var db_file = __dirname + "/../client-server/database/database-2.db";
var db = new sqlite3.Database(db_file);

var statement = db.prepare("INSERT INTO Users VALUES (?, ?, ?, ?, ?)");
statement.run(null, 'Ms Marple', 'jmarple', bcrypt.hashSync("jmarple", 10), 1);
statement.run(null, 'S. Holmes', 'sholmes', bcrypt.hashSync("sholmes", 10), 3);
