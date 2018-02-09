/**
 * This file is a prototype version of Access Control part,
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

/**
 * Assuming that in add-document part (i.e. https://github.com/sunfish-prj/Secure-Multiparty-Computation/blob/master/usecase/beta/add-document.sc),
 * the clearance level associated with document was retrieved by Client UI through argument() function,
 * and then saved inside "rocu-documents" table in ad hoc column (e.g. called "clearance_level").
 * Assuming that in search part (i.e. https://github.com/sunfish-prj/Secure-Multiparty-Computation/blob/master/usecase/beta/search.sc),
 * the vetting level associated with searcher was retrieved by Client UI through argument() function,
 * and then saved inside a private local variable (e.g. called "vetting_level").
 */

// Access control function
pd_shared3p bool [[1]] checkPolicy(pd_shared3p uint8 [[1]] c_lvls, pd_shared3p uint8 v_lvl){

    uint64 n = size(c_lvls);

    pd_shared3p bool [[1]] ac_flags (n);

    ac_flags = (v_lvl >= c_lvls);

    return ac_flags;
}

void main() {
    string ds = "DS1";

    // Table created in add-document.sc
    string tbl_rc = "rocu-documents";

    // Table created in search.sc, for search with id = tblId
    pd_shared3p uint64 tblId;
    tblId = randomize(tblId);
    string tbl_search = "search-" + tostring(declassify(tblId));

    tdbOpenConnection(ds);

    // Check if a table exists
    if (!tdbTableExists(ds, tbl_rc)) {
        print("Database table does not exist!");
        return;
    }else{
        print("Yes! Table exists!");
    }

    /**
    * STEP 1:
    *   Retrieve clearance levels from DB (in table tbl_search) and vetting level from Client
    *   Assuming that table tbl_search was composed in this way:
    *         ----------------------------------------------------------------------------------
    *   Name: |            "docid" |           "owner" |          "match" |  "clearance_level" |
    *   Type: | pd_shared3p uint64 | pd_shared3p uint8 | pd_shared3p bool |  pd_shared3p uint8 |
    *         ----------------------------------------------------------------------------------
    *   And also assuming that in "match" column only "true" values are present (doc with a match for the keyword passed in input)
    */
    pd_shared3p uint8 [[1]] clearance_level = tdbReadColumn(ds, tbl_search, "clearance_level");
    uint8 vetting_level = argument("vetting_level");

    /**
    * STEP 2: Check policy
    */
    pd_shared3p bool [[1]] access_control = checkPolicy(clearance_level, vetting_level);

    // Test
//    pd_shared3p uint8 [[1]] p1 = {0, 0, 1, 0, 2, 2, 0};
//    pd_shared3p uint8 p2 = 1;
//    pd_shared3p bool [[1]] access_control = checkPolicy(p1, p2);
//    printVector(declassify(access_control));

    /**
    * STEP 3: Save access control checks on DB as separate table
    */
    string tbl_access_control = "access_control-" + tostring(declassify(tblId));

    // Check if the table already exists
    if (tdbTableExists(ds, tbl_access_control)) {
        print("ERROR: Table `" + tbl_access_control + "` already exists");
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
    setColumnWise(params);

    pd_shared3p uint64[[1]] documentIds = tdbReadColumn(ds, tbl_search, "id");
    tdbVmapAddValue(params, "values", documentIds);

    pd_shared3p uint8[[1]] ownerIds = tdbReadColumn(ds, tbl_search, "owner");
    tdbVmapAddValue(params, "values", ownerIds);

    pd_shared3p bool[[1]] matchingDocuments = tdbReadColumn(ds, tbl_search, "match");
    tdbVmapAddValue(params, "values", matchingDocuments);

    tdbVmapAddValue(params, "values", access_control);

    //print("DEBUG: Number of values in vmap: ", tdbVmapValueVectorSize(params, "values"));

    print("Inserting data into access control result table");
    tdbInsertRow(ds, tbl_access_control, params);

    tdbVmapDelete(params);

    tdbCloseConnection(ds);
    print("Done");
}
