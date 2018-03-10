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
module.exports = function(db, data, callback) {
    db.serialize(function() {
        var statement = db.prepare("INSERT INTO Documents VALUES (?, ?, ?, ?, ?, ?)");

        var keywordsArr = data.keywords.split(/,\s*|\n+/);
        var keywords = keywordsArr.join(", ");

        statement.run(null, data.user,
                        keywords,
                        data.name,
                        data.confidentiality,
                        data.covered);

        db.get("SELECT last_insert_rowid() AS id;", [], function(err, row){
            if (typeof row !== 'undefined') {
                callback(row.id);
            } else {
                callback(0);
            }
        });
    });
}