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
import shared3p_random;
import shared3p_aes;
import analytics;
import ae_utils;
import ae_aggregate;
import ae_join;
import sunfish_uc3_policy;

domain pd_shared3p shared3p;

void main() {
  string ds = "DS1";
  string tbl = "rocu-documents";

  tdbOpenConnection(ds);

  /**
   * STEP 1: SEARCH
   */
  print("Step 1: Searching");

  // Check if a table exists
  if (!tdbTableExists(ds, tbl)) {
    print("Database table does not exist!");
    return;
  }

  uint32[[1]] seed = {0xdae60299, 0x9b23f811, 0xa58d3bc7, 0x84fc61a9, 0x7df76b0c}; // Public seed. Has to be constant.

  pd_shared3p xor_uint32[[1]] keyword = argument("keyword");
  print(size(keyword));
  pd_shared3p uint8 vettingLevel = argument("vettingLevel");

  // Read table info
  print("Table name: ", tbl);
  print("Columns: ", tdbGetColumnCount(ds, tbl));
  uint numRows = tdbGetRowCount(ds, tbl);
  print("Rows: ", numRows);

  pd_shared3p bool[[1]] matchingDocuments (numRows);

  // Load values from database:
  uint filterVmap = tdbReadColumn(ds, tbl, "filter");

  for (uint i = 0; i < numRows; ++i) {
    print("Searching in document ", i);
    pd_shared3p bool[[1]] filter = tdbVmapGetVlenValue(filterVmap, "values", i);
    pd_shared3p bool[[1]] result = bloomQueryMany(keyword, filter, seed);
    //printVector(declassify(result));
    matchingDocuments[i] = all(result);
  }

  //print("DEBUG: Matching documents:");
  //printVector(declassify(matchingDocuments));

  /*
   * STEP 2: Filter
   */
  // Filter search match by clearence level and covered status.
  pd_shared3p uint8[[1]] docConfLvl = tdbReadColumn(ds, tbl, "confidentiality");
  pd_shared3p bool[[1]] docCovered = tdbReadColumn(ds, tbl, "covered");

  print("Filtering matches");
  pd_shared3p bool[[1]] autoApprove = checkPolicyUncovered(matchingDocuments, docCovered, docConfLvl, vettingLevel);

  //print("DEBUG: Automatically approved documents:");
  //printVector(declassify(autoApprove));

  // Save result as separate table:
  // We have to do that as currently `aggregate` function can only load data 
  // from a database table.
  pd_shared3p uint64 tblId;
  tblId = randomize(tblId);
  string resultTblName = "search-" + tostring(declassify(tblId));

  // Check if the table already exists
  if (tdbTableExists(ds, resultTblName)) {
    print("ERROR: Table `" + resultTblName + "` already exisis");
    return;
  }

  uint params = tdbVmapNew();

  {
    pd_shared3p uint64 vtype;
    tdbVmapAddType(params, "types", vtype);
    tdbVmapAddString(params, "names", "docid");
  }
  {
    pd_shared3p uint8 vtype;
    tdbVmapAddType(params, "types", vtype);
    tdbVmapAddString(params, "names", "owner");
  }
  {
    pd_shared3p bool vtype;
    tdbVmapAddType(params, "types", vtype);
    tdbVmapAddString(params, "names", "approved");
  }
//  {
//    pd_shared3p bool vtype;
//    tdbVmapAddType(params, "types", vtype);
//    tdbVmapAddString(params, "names", "match");
//  }

  tdbTableCreate(ds, resultTblName, params);
  print("Created table ", resultTblName);

  // Fill values:
  tdbVmapClear(params);
  tdbVmapSetValueAsColumn(params);

  // We use `_cut` here to filter out non-matching documents.
  // This leaks the total number of documents, but we leak that
  // anyway at the end.
  // TODO: Do oblivious shuffle before `_cut`, remove `declassify`

  bool[[1]] cutDocuments = declassify(matchingDocuments);

  pd_shared3p uint64[[1]] documentIds = tdbReadColumn(ds, tbl, "id");
  documentIds = _cut(documentIds, cutDocuments);
  tdbVmapAddValue(params, "values", documentIds);

  pd_shared3p uint8[[1]] ownerIds = tdbReadColumn(ds, tbl, "owner");
  ownerIds = _cut(ownerIds, cutDocuments);
  tdbVmapAddValue(params, "values", ownerIds);
  
  autoApprove = _cut(autoApprove, cutDocuments);
  tdbVmapAddValue(params, "values", autoApprove);
  
  //tdbVmapAddValue(params, "values", matchingDocuments);

  //print("DEBUG: Number of values in vmap: ", tdbVmapValueVectorSize(params, "values"));

  print("Inserting data into search result table");
  tdbInsertRow(ds, resultTblName, params);

  tdbVmapDelete(params);

  /**
   * STEP 2: AGGREGATE
   */

/*
  print("Step 2: Aggregating search results per data owner");

  uint aggregateKeyCols = tdbVmapNew();
  uint aggregateDataCols = tdbVmapNew();
  uint aggregateFunctions = tdbVmapNew();

  // TODO: We should show matching document ID-s in result, but for
  // the prototype, we only show matching document count.

  tdbVmapAddString(aggregateKeyCols, "datasources", ds);
  tdbVmapAddString(aggregateKeyCols, "tables", resultTblName);
  tdbVmapAddString(aggregateKeyCols, "names", "owner");
  tdbVmapAddString(aggregateKeyCols, "types", "uint8");

  tdbVmapAddString(aggregateDataCols, "datasources", ds);
  tdbVmapAddString(aggregateDataCols, "tables", resultTblName);
  tdbVmapAddString(aggregateDataCols, "names", "docid");
  tdbVmapAddString(aggregateDataCols, "ia-datasources", "");
  tdbVmapAddString(aggregateDataCols, "ia-tables", "");
  tdbVmapAddString(aggregateDataCols, "ia-names", "");
  tdbVmapAddString(aggregateDataCols, "types", "bool");

  tdbVmapAddString(aggregateFunctions, "values", "sum");

  option<uint> aggregateResultNames = none();
  uint aggregateResultNamesVMap = tdbVmapNew();
  tdbVmapAddString(aggregateResultNamesVMap, "names", "owner");
  tdbVmapAddString(aggregateResultNamesVMap, "names", "matchcount");
  aggregateResultNames = some(aggregateResultNamesVMap);

  bool[[1]] aggregateDataColsHasIA = {false};

  pd_shared3p uint domainProxy = 1;

  uint[[1]] aggregateResult = groupBy(aggregateKeyCols, aggregateDataCols,
    aggregateDataColsHasIA, aggregateFunctions, aggregateResultNames, domainProxy);

  // Find result column names:
//  uint resultCols = tdbVmapStringVectorSize(aggregateResult[1], "names");
//  for (uint i = 0; i < resultCols; ++i) {
//    print("Column name: ", tdbVmapGetString(aggregateResult[1], "names", i));
//    print("Column type: ", tdbVmapGetTypeName(aggregateResult[1], "types", i));
//  }

  {
    print("DEBUG: Aggregation results:");
    pd_shared3p uint8[[1]] owners = tdbVmapGetValue(aggregateResult[0], "values", 0 :: uint);
    pd_shared3p uint64[[1]] matchcount = tdbVmapGetValue(aggregateResult[0], "values", 1 :: uint);

    for (uint i = 0; i < size(owners); ++i) {
      print(declassify(owners[i]), ": ", declassify(matchcount[i]));
    }
  }

  // Save aggregate operation result:
  // We have to do that because `join` can currently 
  // only work on database tables.
  print("Saving aggragation result");

  //tblId = randomize(tblId); // Use the same search ID
  resultTblName = "aggregate-" + tostring(declassify(tblId));

  // Check if the table already exists
  if (tdbTableExists(ds, resultTblName)) {
    print("ERROR: Table `" + resultTblName + "` already exisis");
    return;
  }

  tdbTableCreate(ds, resultTblName, aggregateResult[1]);
  tdbInsertRow(ds, resultTblName, aggregateResult[0]);
*/

  /**
   * STEP 3: JOIN
   */

  print("Step 3: Finding data owners' encryption keys");

  uint leftCols = tdbVmapNew();
  uint rightCols = tdbVmapNew();
  uint leftKeyCols = tdbVmapNew();
  uint rightKeyCols = tdbVmapNew();

  tdbVmapAddString(leftCols, "datasources", ds);
  tdbVmapAddString(leftCols, "tables", resultTblName);
  tdbVmapAddString(leftCols, "names", "docid");
  tdbVmapAddString(leftCols, "types", "uint64");

  tdbVmapAddString(leftCols, "datasources", ds);
  tdbVmapAddString(leftCols, "tables", resultTblName);
  tdbVmapAddString(leftCols, "names", "approved");
  tdbVmapAddString(leftCols, "types", "bool");

  tdbVmapAddString(rightCols, "datasources", ds);
  tdbVmapAddString(rightCols, "tables", "rocu-owners");
  tdbVmapAddString(rightCols, "names", "key0");
  tdbVmapAddString(rightCols, "types", "xor_uint32");

  tdbVmapAddString(rightCols, "datasources", ds);
  tdbVmapAddString(rightCols, "tables", "rocu-owners");
  tdbVmapAddString(rightCols, "names", "key1");
  tdbVmapAddString(rightCols, "types", "xor_uint32");

  tdbVmapAddString(rightCols, "datasources", ds);
  tdbVmapAddString(rightCols, "tables", "rocu-owners");
  tdbVmapAddString(rightCols, "names", "key2");
  tdbVmapAddString(rightCols, "types", "xor_uint32");

  tdbVmapAddString(rightCols, "datasources", ds);
  tdbVmapAddString(rightCols, "tables", "rocu-owners");
  tdbVmapAddString(rightCols, "names", "key3");
  tdbVmapAddString(rightCols, "types", "xor_uint32");

  tdbVmapAddString(leftKeyCols, "datasources", ds);
  tdbVmapAddString(leftKeyCols, "tables", resultTblName);
  tdbVmapAddString(leftKeyCols, "names", "owner");
  tdbVmapAddString(leftKeyCols, "types", "uint8");

  tdbVmapAddString(rightKeyCols, "datasources", ds);
  tdbVmapAddString(rightKeyCols, "tables", "rocu-owners");
  tdbVmapAddString(rightKeyCols, "names", "owner");
  tdbVmapAddString(rightKeyCols, "types", "uint8");

  bool[[1]] hasIA1 = {false, false};
  bool[[1]] hasIA2 = {false, false, false, false};

  bool[[1]] needsPrefix1 = {false, false};
  bool[[1]] needsPrefix2 (4); needsPrefix2 = false;

  pd_shared3p uint domainProxy = 1;

  print("Joining");
  join_result joinRes = joinTables(leftCols, leftKeyCols, hasIA1, needsPrefix1,
                                   rightCols, rightKeyCols, hasIA2, needsPrefix2,
                                   "inner", domainProxy);

  // TODO: It actually has to be right join, as not every document owner
  // has documents in the index.

  if (!joinRes.success) {
      print("ERROR: Join was unsuccessful, aborting");
      return;
  }

  /**
   * STEP 4: ENCRYPT RESULTS
   */
  print("Step 4");

  // Load AES keys
  //print("Loading column `owners`");
  pd_shared3p uint8[[1]] owners = tdbVmapGetValue(joinRes.resultData, "values", 0 :: uint);
  //print("Loading column `docid`");
  pd_shared3p uint64[[1]] docid = tdbVmapGetValue(joinRes.resultData, "values", 1 :: uint);
  //print("Loading column `approved`");
  pd_shared3p bool[[1]] approved = tdbVmapGetValue(joinRes.resultData, "values", 2 :: uint);
  //print("Loading column `key0`");
  pd_shared3p xor_uint32[[1]] key0 = tdbVmapGetValue(joinRes.resultData, "values", 3 :: uint);
  //print("Loading column `key1`");
  pd_shared3p xor_uint32[[1]] key1 = tdbVmapGetValue(joinRes.resultData, "values", 4 :: uint);
  //print("Loading column `key2`");
  pd_shared3p xor_uint32[[1]] key2 = tdbVmapGetValue(joinRes.resultData, "values", 5 :: uint);
  //print("Loading column `key3`");
  pd_shared3p xor_uint32[[1]] key3 = tdbVmapGetValue(joinRes.resultData, "values", 6 :: uint);
  //print("Loaded");

  assert((size(owners) == size(docid))
    && (size(docid) == size(approved))
    && (size(owners) == size(key0))
    && (size(key0) == size(key1))
    && (size(key1) == size(key2))
    && (size(key2) == size(key3)));
  //print(size(key0));

  // Restructure AES keys:
  // FIXME vectorised AES was broken with that Sharemind build
  // Do encryption block-by-block at the moment
  pd_shared3p xor_uint32[[1]] keys (4);
  for (uint i = 0; i < 1; ++i) {
    keys[4*i]   = key0[i];
    keys[4*i+1] = key1[i];
    keys[4*i+2] = key2[i];
    keys[4*i+3] = key3[i];
  }
  pd_shared3p xor_uint32[[1]] expandedKeys = aes128ExpandKey(keys);

  //pd_shared3p uint32[[1]] matchcount32 = (uint32) matchcount;
  //pd_shared3p xor_uint32[[1]] xor_matchcount = reshare(matchcount32);
  pd_shared3p xor_uint32[[1]] plaintext (4 * size(owners));

  for (uint i = 0; i < size(owners); ++i) {
    plaintext[4*i]   = reshare((uint32) owners[i]);
    plaintext[4*i+1] = reshare((uint32) docid[i]);
    plaintext[4*i+2] = reshare((uint32) approved[i]);
  }

  print("Encrypting search results");
  //pd_shared3p xor_uint32[[1]] ciphertext = aes128EncryptEcb(expandedKeys, plaintext);
  pd_shared3p xor_uint32[[1]] ciphertext (size(plaintext));

  uint Nb = 4; uint Nr = 10; // AES-128
  for (uint i = 0; i < size(owners); ++i) {
    ciphertext[Nb*i:Nb*(i+1)] = aes128EncryptEcb(expandedKeys, 
      plaintext[Nb*i:Nb*(i+1)]);
  }

  // TODO: Also encrypt search term

  tdbCloseConnection(ds);

  //publish("owners", declassify(owners));
  publish("matches", declassify(ciphertext));

  print("All done");
}