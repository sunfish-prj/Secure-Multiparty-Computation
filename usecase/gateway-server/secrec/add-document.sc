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
import shared3p_bloom;

domain pd_shared3p shared3p;

void main() {
  string ds = "DS1";
  string tbl = "rocu-documents";

  // Document ID also comes from the owner as it is used to reference the 
  // document later in its owner's database
  pd_shared3p uint64 id = argument("docid");
  pd_shared3p uint8 owner = argument("owner");
  pd_shared3p uint8 confidentiality = argument("confidentiality");
  pd_shared3p bool covered = argument("covered");
  pd_shared3p xor_uint32[[1]] words = argument("words");

  tdbOpenConnection(ds);

  // Check if a table exists
  if (!tdbTableExists(ds, tbl)) {
    print("Creating new table: ", tbl);

    uint params = tdbVmapNew();

    {
      pd_shared3p uint64 vtype;
      tdbVmapAddType(params, "types", vtype);
      tdbVmapAddString(params, "names", "id");
    }
    {
      pd_shared3p uint8 vtype;
      tdbVmapAddType(params, "types", vtype);
      tdbVmapAddString(params, "names", "owner");
    }
    {
      pd_shared3p uint8 vtype;
      tdbVmapAddType(params, "types", vtype);
      tdbVmapAddString(params, "names", "confidentiality");
    }
    {
      pd_shared3p bool vtype;
      tdbVmapAddType(params, "types", vtype);
      tdbVmapAddString(params, "names", "covered");
    }
    {
      pd_shared3p bool vtype;
      tdbVmapAddVlenType(params, "types", vtype);
      tdbVmapAddString(params, "names", "filter");
    }

    tdbTableCreate(ds, tbl, params);
    tdbVmapDelete(params);
    print("Table created.");
  }

  // Create a Bloom filter
  uint32[[1]] seed = {0xdae60299, 0x9b23f811, 0xa58d3bc7, 0x84fc61a9, 0x7df76b0c}; // Public seed. Has to be constant.
  pd_shared3p bool[[1]] document (1000); // TODO: Choose right size

  print("Constructing Bloom filter");
  document = bloomInsertMany(words, document, seed);

  // Insert filter into database:
  uint params = tdbVmapNew();

  print("Preparing database statement");
  tdbVmapAddValue(params, "values", id);
  tdbVmapAddValue(params, "values", owner);
  tdbVmapAddValue(params, "values", confidentiality);
  tdbVmapAddValue(params, "values", covered);
  tdbVmapAddVlenValue(params, "values", document);

  print("Inserting document to database");
  tdbInsertRow(ds, tbl, params);
  tdbVmapDelete(params);

  tdbCloseConnection(ds);
  publish("success", 1); // We publish something in order to let javascript know we are finished
  print("Done");
}
