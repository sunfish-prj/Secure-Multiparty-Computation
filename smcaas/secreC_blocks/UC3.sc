/**
 * This file is an example of SMCaaS for UC3
 * It represents how block are generated in SecreC by Xtext
 * As first version every blocks are putted above the main (like functions)
 * Implemented in Sharemind (through the usage of SMC)
 * author gilzan (https://github.com/gilzan)
 */
import shared3p;
import shared3p_table_database;
import stdlib;
import table_database;

domain pd_shared3p shared3p;

/**
 *
 * TO NOTICE that each a simplified version of how they really are written in SecreC
 * Therefore, refer to https://github.com/sunfish-prj/Secure-Multiparty-Computation/tree/master/usecase
 *
 */

// the block Insert Data  must represent the union of add-owner.sc and add-document.sc
void addDataset(string ds, string tbl, string [[1]] clm_names, pd_shared3p uint64 [[2]] values){

  // First create table
  uint params = tdbVmapNew();

  for (uint i = 0; i < size(clm_names); ++i) {
    pd_shared3p uint64 vtype;
    tdbVmapAddType(params, "types", vtype);
    tdbVmapAddString(params, "names", clm_names[i]);
  }

  tdbTableCreate(ds, tbl, params);

  // Then insert values into database:
  uint length = size(values) / size(clm_names);
  for (uint i = 0; i < length; ++i) {

    tdbVmapClear(params);

    for (uint j = 0; j < size(clm_names); ++j) {
      tdbVmapAddValue(params, "values", values[j]);
    }

    tdbInsertRow(ds, tbl, params);
  }
  tdbVmapDelete(params);

  return tbl;
}

//parameters for these struct are ad-hoc for UC3, but can be generated for a general case
struct match {
  boolean flag = false;
  pd_shared3p uint64 owner;
  pd_shared3p uint64 document;
  pd_shared3p uint64 level;
}

pd_shared3p uint64 [[2]] readDB(string ds, string tbl, uint l){
  pd_shared3p uint64 [[2]] db;
  //put each column into a matrix
  for (uint i = 0; i < l; ++i){
    db[i] = tdbReadColumn(ds, tbl, i);
  }
  return db;
}

//we use readDB() funct. and 2 for-loops nested because we refer to a general case
void find(string ds, string tbl, uint l, pd_shared3p uint64 keyword){

  // Read table
  pd_shared3p uint64 [[2]] db = readDB(ds, tbl, l);

  // Search a match
  uint x = size(db)/l;
  for (uint i = 0; i < x; ++i) {
    for (uint j = 0; j < l; ++i) {
      // TBD -> TODO as in search.sc (https://github.com/sunfish-prj/Secure-Multiparty-Computation/tree/master/usecase)
      if(db[i,j] == keyword){
        match.flag = true;
        match.owner = db[i, j-1];
        match.document = keyword;
        match.level = db[i, j+1];
      }
    }
  }

  //results from search are saved into struct 'match'
}

boolean checkPolicy(pd_shared3p uint64 reqLvl){
  boolean access_control_ack;

  if(match.level <= reqLvl){
    access_control_ack = true;
  }else{
    access_control_ack = false;
  }

  return access_control_ack;
}

void main() {

  string ds = "DS1";
  //tbl should be passed in input by client (through argument() function)
  string tbl = argument("UC3");

  tdbOpenConnection(ds);

  // If the result table already exists, delete it
  if (tdbTableExists(ds, tbl)) {
      print("Table `" + tbl + "` already exisis, deleting...");
      tdbTableDelete(ds, tbl);
  }

  string [[1]] features_names = argument("features_names");
  pd_shared3p uint64 [[2]] values = argument("values");

  // Call block Insert Data
  insert_data(ds, tbl, features_names, values);

  pd_shared3p uint64 keyword = argument("keyword");

  // Call block Search
  find(ds, tbl, size(features_names), keyword);

  pd_shared3p uint64 requesterLvl = argument("mylvl");
  if(match.flag == true){

    // Call block Access Control
    boolean ack = checkPolicy(requesterLvl);

    if(ack == true){

      publish("ac_result", declassify(match.document));

    }else{

      // Call block Permission Release
      askPermission(match.owner, requesterLvl);  //TODO

    }
  }
}





