import shared3p;
import shared3p_table_database;
import stdlib;
import table_database;
import shared3p_bloom;
import shared3p_random;
import shared3p_aes;
import shared3p_sort;

domain pd_shared3p shared3p;

// Search function on keyword passed in input
pd_shared3p bool [[1]] search(string ds, string tbl, string clm, uint32[[1]] seed, pd_shared3p xor_uint64[[1]] keyword){
	
	uint numRows = tdbGetRowCount(ds, tbl);
	
	pd_shared3p bool[[1]] match (numRows);
	
	uint filterVmap = tdbReadColumn(ds, tbl, clm);
	
	for (uint i = 0; i < numRows; ++i) {
	    print("Searching in document ", i);
	    pd_shared3p bool[[1]] filter = tdbVmapGetVlenValue(filterVmap, "values", i);
	    pd_shared3p bool[[1]] result = bloomQueryMany(keyword, filter, seed);
	    matchingDocuments[i] = all(result);
	}

    return match;
}

// Access control function on covered docs
pd_shared3p bool [[1]] checkCovered(pd_shared3p bool [[1]] match, pd_shared3p bool [[1]] cov){

    assert(size(match) == size(cov));
    uint64 n = size(match);

    pd_shared3p bool [[1]] ac_flags (n);

    ac_flags = !(cov);

    return ac_flags;
}

// Access control function on policy (for UC3)
pd_shared3p bool [[1]] checkPolicyUncovered(pd_shared3p bool [[1]] match, pd_shared3p bool [[1]] cov, pd_shared3p uint64 [[1]] c_lvls, pd_shared3p uint64 v_lvl){

    pd_shared3p bool [[1]] ac_covered = checkCovered(match, cov);

    assert(size(ac_covered) == size(c_lvls));
    uint64 n = size(ac_covered);

    pd_shared3p bool [[1]] ac_policy (n);

    ac_policy = (v_lvl >= c_lvls);

    pd_shared3p bool [[1]] ac_final (n);

    ac_final = (ac_covered & ac_policy);

    return ac_final;

}

// Access control function on policy (Bell-LaPadula)
pd_shared3p bool [[1]] checkPolicyBLP_Simple(string mode, pd_shared3p uint64 [[1]] o_lvls, pd_shared3p uint64 s_lvl){
    uint64 n = size(o_lvls);
    pd_shared3p bool [[1]] ac_policy (n);

    // simple security property (no-read-up)
    if(mode == "read"){
        ac_policy = (s_lvl >= o_lvls);
    }
    // star property (no-write-down)
    if(mode == "write"){
        ac_policy = (s_lvl <= o_lvls);
    }
    return ac_policy;
}

// Access control function on policy (Bell-LaPadula)
pd_shared3p bool [[1]] checkPolicyBLP(string mode, pd_shared3p uint64 [[1]] o_lvls, pd_shared3p uint64 s_lvl){
    uint64 n = size(o_lvls);
    pd_shared3p bool [[1]] ac_policy (n);
    
    // simple security property (no-read-up)
    if(mode == "read"){
        ac_policy = (s_lvl >= o_lvls);
    }else{
        // star property (no-write-down)
        if(mode == "write"){
            ac_policy = (s_lvl == o_lvls);
        }
        if(mode == "append"){
            ac_policy = (s_lvl <= o_lvls);
        }
    }

    return ac_policy;
}

// Access control function on policy (Bell-LaPadula)
pd_shared3p bool [[1]] checkPolicyBLP(bool current, string mode, pd_shared3p uint64 [[1]] o_lvls, pd_shared3p uint64 s_lvl){
    uint64 n = size(o_lvls);
    pd_shared3p bool [[1]] ac_policy (n);

    // each subject has a maximal level and a current level

    // simple security property (no-read-up)
    if(mode == "read"){
        ac_policy = (s_lvl >= o_lvls);
    }

    // star property (no-write-down)
    // IF subject-level is equal to current-level
    if(current){
        if(mode == "write"){
            ac_policy = (s_lvl == o_lvls);
        }
        if(mode == "append"){
            ac_policy = (s_lvl <= o_lvls);
        }

    // OTHERWISE subject-level is equal to maximal-level
    }else{
        ac_policy = false;
    }

    return ac_policy;
}

permission release - TO ADD MODULE

void main() {
	
	string ds = "DS1";
	
	tdbOpenConnection(ds);
	
	// Public seed. Has to be constant
	uint32[[1]] seed = {0xdae60299, 0x9b23f811, 0xa58d3bc7, 0x84fc61a9, 0x7df76b0c};
	
	uint params = tdbVmapNew();
	
	 string 
	tbl_own 
	 = "rocu-owners"
	;
	
	if(tdbTableExists(ds, tbl_own)
	){
		print((("Table "
		) + (tbl_own
		)
		) + (" already exists"
		)
		);
		
		print("Choose another name or update the existing one"
		);
		
		return;
	}
	
	tdbVmapClear(params);
	
	{
		pd_shared3p uint64 vtype;
		tdbVmapAddType(params, "types", vtype);
		tdbVmapAddString(params, "names", "owner");
	}
	
	{
		pd_shared3p xor_uint64 vtype;
		tdbVmapAddType(params, "types", vtype);
		tdbVmapAddString(params, "names", "key");
	}
	
	
	tdbTableCreate(ds, tbl_own, params);
	
	pd_shared3p uint64 
	[[1]] owner 
	 = argument("owner")
	;
	
	pd_shared3p xor_uint64 
	[[1]] key 
	 = argument("key")
	;
	
	tdbVmapClear(params);
	
	tdbVmapAddValue(params, "values", owner);
	
	tdbVmapAddValue(params, "values", key);
	
	
	tdbInsertRow(ds, tbl_own, params);
	
	 string 
	tbl_doc 
	 = "rocu-documents"
	;
	
	if(!(tdbTableExists(ds, tbl_doc)
	)
	){
		print((("Table "
		) + (tbl_doc
		)
		) + (" does not exist"
		)
		);
		
		print("Creating new one before insert values"
		);
		
		tdbVmapClear(params);
		
		{
			pd_shared3p uint64 vtype;
			tdbVmapAddType(params, "types", vtype);
			tdbVmapAddString(params, "names", "id");
		}
		
		{
			pd_shared3p uint64 vtype;
			tdbVmapAddType(params, "types", vtype);
			tdbVmapAddString(params, "names", "owner");
		}
		
		{
			pd_shared3p bool vtype;
			tdbVmapAddType(params, "types", vtype);
			tdbVmapAddString(params, "names", "filter");
		}
		
		{
			pd_shared3p uint64 vtype;
			tdbVmapAddType(params, "types", vtype);
			tdbVmapAddString(params, "names", "clearance_level");
		}
		
		{
			pd_shared3p bool vtype;
			tdbVmapAddType(params, "types", vtype);
			tdbVmapAddString(params, "names", "covered");
		}
		
		
		tdbTableCreate(ds, tbl_doc, params);
		
	}
	
	pd_shared3p uint64 
	id 
	 = argument("docid")
	;
	
	pd_shared3p uint64 
	owner 
	 = argument("owner")
	;
	
	pd_shared3p xor_uint64 
	words 
	 = argument("words")
	;
	
	pd_shared3p uint64 
	clearance_level 
	 = argument("clearance_level")
	;
	
	pd_shared3p bool 
	covered 
	 = argument("covered")
	;
	
	pd_shared3p bool 
	[[1]] document 
	(1000);
	
	document = bloomInsertMany(words, document, seed);
	
	tdbVmapClear(params);
	
	tdbVmapAddValue(params, "values", id);
	
	tdbVmapAddValue(params, "values", owner);
	
	tdbVmapAddValue(params, "values", document);
	
	tdbVmapAddValue(params, "values", clearance_level);
	
	tdbVmapAddValue(params, "values", covered);
	
	
	tdbInsertRow(ds, tbl_doc, params);
	
	pd_shared3p xor_uint64 
	[[1]] keyword 
	 = argument("keyword")
	;
	
	if(!(tdbTableExists(ds, tbl_doc)
	)
	){
		print((("Table "
		) + (tbl_doc
		)
		) + (" does not exist"
		)
		);
		
		print("Check if table name is correct or create new one before search"
		);
		
		return;
	}
	
	pd_shared3p bool 
	[[1]] match 
	 = search(ds, tbl_doc, "filter", seed, keyword)
	;
	
	 string 
	tbl_search 
	 = "search-myID-keyword"
	;
	
	if(!(tdbTableExists(ds, tbl_search)
	)
	){
		tdbVmapClear(params);
		
		{
			pd_shared3p uint64 vtype;
			tdbVmapAddType(params, "types", vtype);
			tdbVmapAddString(params, "names", "id");
		}
		
		{
			pd_shared3p uint64 vtype;
			tdbVmapAddType(params, "types", vtype);
			tdbVmapAddString(params, "names", "owner");
		}
		
		{
			pd_shared3p bool vtype;
			tdbVmapAddType(params, "types", vtype);
			tdbVmapAddString(params, "names", "match");
		}
		
		{
			pd_shared3p uint64 vtype;
			tdbVmapAddType(params, "types", vtype);
			tdbVmapAddString(params, "names", "clearance_level");
		}
		
		{
			pd_shared3p bool vtype;
			tdbVmapAddType(params, "types", vtype);
			tdbVmapAddString(params, "names", "covered");
		}
		
		
		tdbTableCreate(ds, tbl_search, params);
		
		pd_shared3p uint64 
		[[1]] id 
		 = tdbReadColumn(ds, tbl_doc
		, "docid");
		;
		
		pd_shared3p uint64 
		[[1]] owner 
		 = tdbReadColumn(ds, tbl_doc
		, "owner");
		;
		
		pd_shared3p uint64 
		[[1]] clearance_level 
		 = tdbReadColumn(ds, tbl_doc
		, "clearance_level");
		;
		
		pd_shared3p bool 
		[[1]] covered 
		 = tdbReadColumn(ds, tbl_doc
		, "covered");
		;
		
		tdbVmapClear(params);
		
		tdbVmapAddValue(params, "values", id);
		
		tdbVmapAddValue(params, "values", owner);
		
		tdbVmapAddValue(params, "values", match);
		
		tdbVmapAddValue(params, "values", clearance_level);
		
		tdbVmapAddValue(params, "values", covered);
		
		
		tdbInsertRow(ds, tbl_search, params);
		
	}
	
	else {
		print((("ERROR: Table "
		) + (tbl_search
		)
		) + (" already exists"
		)
		);
		
		print("Choose another name"
		);
		
		return;
	}
	
	pd_shared3p uint64 
	[[1]] clearance_levels 
	 = tdbReadColumn(ds, tbl_search
	, "clearance_level");
	;
	
	pd_shared3p bool 
	[[1]] covered 
	 = tdbReadColumn(ds, tbl_search
	, "covered");
	;
	
	pd_shared3p uint64 
	vetting_level 
	 = argument("vetting_level")
	;
	
	pd_shared3p bool 
	[[1]] acCovered 
	 = checkPolicyUncovered(match, covered, clearance_levels, vetting_level)
	;
	
	 string 
	tbl_access_control 
	 = "access-control-myID-keyword"
	;
	
	if(!(tdbTableExists(ds, tbl_access_control)
	)
	){
		tdbVmapClear(params);
		
		{
			pd_shared3p uint64 vtype;
			tdbVmapAddType(params, "types", vtype);
			tdbVmapAddString(params, "names", "id");
		}
		
		{
			pd_shared3p uint64 vtype;
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
		
		pd_shared3p uint64 
		[[1]] id 
		 = tdbReadColumn(ds, tbl_search
		, "id");
		;
		
		pd_shared3p uint64 
		[[1]] owner 
		 = tdbReadColumn(ds, tbl_search
		, "owner");
		;
		
		tdbVmapClear(params);
		
		tdbVmapAddValue(params, "values", id);
		
		tdbVmapAddValue(params, "values", owner);
		
		tdbVmapAddValue(params, "values", match);
		
		tdbVmapAddValue(params, "values", acCovered);
		
		
		tdbInsertRow(ds, tbl_access_control, params);
		
	}
	
	else {
		print((("ERROR: Table "
		) + (tbl_access_control
		)
		) + (" already exists"
		)
		);
		
		print("Choose another name"
		);
		
		return;
	}
	
	
	tdbVmapDelete(params);
	
	tdbCloseConnection(ds);
}
