/**
 * This file represents Access Control part,
 * which will be included inside script demonstrator of UC3 for SUNFISH project
 * author gilzan (https://github.com/gilzan)
 */

import shared3p;
import shared3p_table_database;
import stdlib;
import table_database;
import shared3p_bloom;
import shared3p_random;
import shared3p_aes;

domain pd_shared3p shared3p;

// Access control function on covered docs
pd_shared3p bool [[1]] checkCovered(pd_shared3p bool [[1]] match, pd_shared3p bool [[1]] cov){

    assert(size(match) == size(cov));
    uint64 n = size(match);

    pd_shared3p bool [[1]] ac_flags (n);

    ac_flags = !(cov);

    return ac_flags;
}

// Access control function on policy
pd_shared3p bool [[1]] checkPolicy(pd_shared3p bool [[1]] ac_covered, pd_shared3p uint8 [[1]] c_lvls, pd_shared3p uint8 v_lvl){

    assert(size(ac_covered) == size(c_lvls));
    uint64 n = size(ac_covered);

    pd_shared3p bool [[1]] ac_policy (n);

    ac_policy = (v_lvl >= c_lvls);

    pd_shared3p bool [[1]] ac_final (n);

    ac_final = (ac_covered & ac_policy);

    return ac_final;

}

void main() {
    string ds = "DS1";

    /*
    *  Table created in search.sc, for search with id = tblId
    *        ----------------------------------------------------------------------------------------------------
    *  Name: |            "docid" |           "owner" |          "match" | "clearance_level" |        "covered" |
    *  Type: | pd_shared3p uint64 | pd_shared3p uint8 | pd_shared3p bool | pd_shared3p uint8 | pd_shared3p bool |
    *        ----------------------------------------------------------------------------------------------------
    */
    pd_shared3p uint64 tblId;
    tblId = randomize(tblId);
    string tbl_search = "search-" + tostring(declassify(tblId));

    tdbOpenConnection(ds);

    // Check if a table "search-#" exists
    if (!tdbTableExists(ds, tbl_search)) {
        print("Search n. "+tostring(declassify(tblId))+" does not exist!");
        return;
    }

    /*
    *  TO NOTICE:
    *  If all is done in the same main, then folliwing info can be retrieved in local variables, without accessing the DB.
    *  Values in clearance_level belong to {1,2,3,4} = {official, official sensitive, secret, top secret}.
    *  Value in vetting_level belongs to {1,2,3} = {ctc, sc, dv}.
    *  Docs "covered" or "top secret" cannot be accessed without declassification.
    *  As a result of AC flow, a column called "access_control" will be created.
    *  This column will have:
    *       "0" - notify the data owner asking for declassification, no ack to the data searcher
    *       "1" - notify the data searcher of a hit, ack to the data consumer
    */
    // Retrieve info from "search-#"
    pd_shared3p bool [[1]] match = tdbReadColumn(ds, tbl_search, "match");
    pd_shared3p uint8 [[1]] clearance_level = tdbReadColumn(ds, tbl_search, "clearance_level");
    pd_shared3p bool [[1]] covered = tdbReadColumn(ds, tbl_search, "covered");
    uint8 vetting_level = argument("vetting_level");

    /**
    * STEP 1: Check covered
    */

    pd_shared3p bool [[1]] ac_temp = checkCovered(match, covered);

    /**
    * STEP 2: Check policy
    */
    pd_shared3p bool [[1]] access_control = checkPolicy(ac_temp, clearance_level, vetting_level);

    // Test
//    pd_shared3p bool [[1]] m = {true, true, true, true, true};
//    pd_shared3p bool [[1]] c = {true, false, false, true, true};
//    pd_shared3p uint8 [[1]] cl = {1, 3, 1, 2, 3};
//    pd_shared3p uint8 vl = 2;
//    pd_shared3p bool [[1]] ac_temp = checkCovered(m, c);
//    printVector(declassify(ac_temp));
//    pd_shared3p bool [[1]] access_control = checkPolicy(ac_temp, cl, vl);
//    printVector(declassify(access_control));

    /**
    * STEP 3: Save access control checks on DB as separate table
    */
    string tbl_access_control = "access_control-" + tostring(declassify(tblId));

    // Check if the table already exists
    if (tdbTableExists(ds, tbl_access_control)) {
        print("WARNING: Table `" + tbl_access_control + "` already exists");
        print("*** choose another name ***");
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
        tdbVmapAddString(params, "names", "match");
    }
    {
        pd_shared3p bool vtype;
        tdbVmapAddType(params, "types", vtype);
        tdbVmapAddString(params, "names", "access_control");
    }

    tdbTableCreate(ds, tbl_access_control, params);
    print("Created table ", tbl_access_control);

    // Fill values:
    tdbVmapClear(params);

    // As before, following info can be retrieved by local variables
    pd_shared3p uint64[[1]] documentIds = tdbReadColumn(ds, tbl_search, "id");
    tdbVmapAddValue(params, "values", documentIds);

    pd_shared3p uint8[[1]] ownerIds = tdbReadColumn(ds, tbl_search, "owner");
    tdbVmapAddValue(params, "values", ownerIds);

    tdbVmapAddValue(params, "values", match);

    tdbVmapAddValue(params, "values", access_control);

    //print("DEBUG: Number of values in vmap: ", tdbVmapValueVectorSize(params, "values"));

    print("Inserting data into access control result table");
    tdbInsertRow(ds, tbl_access_control, params);

    tdbVmapDelete(params);

    tdbCloseConnection(ds);
    print("Done");
}
