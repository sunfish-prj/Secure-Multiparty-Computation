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
import shared3p;
import table_database;

domain pd_shared3p shared3p;

void main() {
  string ds = "DS1";
  string tbl = "rocu-documents";

  pd_shared3p uint64 x = 1; // To enable shared3p module

  tdbOpenConnection(ds);

  // If the result table already exists, delete it
  if (tdbTableExists(ds, tbl)) {
      print("Table `" + tbl + "` exisis, deleting...");
      tdbTableDelete(ds, tbl);
  }
  tdbCloseConnection(ds);
  print("Done");
}