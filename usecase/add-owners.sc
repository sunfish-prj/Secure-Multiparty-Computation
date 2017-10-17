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
import shared3p_table_database;
import stdlib;
import table_database;

domain pd_shared3p shared3p;

void main() {
  string ds = "DS1";
  string tbl = "rocu-owners";

  tdbOpenConnection(ds);

  // If the result table already exists, delete it
  if (tdbTableExists(ds, tbl)) {
      print("Table `" + tbl + "` already exisis, deleting...");
      tdbTableDelete(ds, tbl);
  }

  print("Creating new table: ", tbl);

  uint params = tdbVmapNew();

  {
    pd_shared3p uint8 vtype;
    tdbVmapAddType(params, "types", vtype);
    tdbVmapAddString(params, "names", "owner");
  }
  // AES key is split between four columns:
  {
    pd_shared3p xor_uint32 vtype;
    tdbVmapAddType(params, "types", vtype);
    tdbVmapAddString(params, "names", "key0");
  }
  {
    pd_shared3p xor_uint32 vtype;
    tdbVmapAddType(params, "types", vtype);
    tdbVmapAddString(params, "names", "key1");
  }
  {
    pd_shared3p xor_uint32 vtype;
    tdbVmapAddType(params, "types", vtype);
    tdbVmapAddString(params, "names", "key2");
  }
  {
    pd_shared3p xor_uint32 vtype;
    tdbVmapAddType(params, "types", vtype);
    tdbVmapAddString(params, "names", "key3");
  }

  tdbTableCreate(ds, tbl, params);
  print("Table created.");

  // Insert a couple of data owners into database:
  for (uint8 i = 1; i <= 3; ++i) {
    print("Preparing database statement for owner ", i);
    tdbVmapClear(params);

    pd_shared3p uint8 ownerId = i;
    tdbVmapAddValue(params, "values", ownerId);

    // For testing, use the same key for everybody:
    pd_shared3p xor_uint32[[1]] key = {0x2b7e1516, 0x28aed2a6, 0xabf71588, 0x09cf4f3c};
    tdbVmapAddValue(params, "values", key[0]);
    tdbVmapAddValue(params, "values", key[1]);
    tdbVmapAddValue(params, "values", key[2]);
    tdbVmapAddValue(params, "values", key[3]);

    print("Inserting owner to database");
    tdbInsertRow(ds, tbl, params);
  }
  tdbVmapDelete(params);

  tdbCloseConnection(ds);
  print("Done");
}
