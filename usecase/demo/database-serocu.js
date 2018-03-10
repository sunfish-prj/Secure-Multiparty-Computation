const sqlite3 = require("sqlite3").verbose();
const bcrypt = require('bcrypt');

var db_file = __dirname + "/../client-server/database/database-1.db";
var db = new sqlite3.Database(db_file);

var statement = db.prepare("INSERT INTO Users VALUES (?, ?, ?, ?, ?)");
statement.run(null, 'Inspector Lestrade', 'glestrade', bcrypt.hashSync("glestrade", 10), 3);
