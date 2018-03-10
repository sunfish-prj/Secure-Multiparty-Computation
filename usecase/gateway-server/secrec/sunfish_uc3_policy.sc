/**
 * This file is part of the SUNFISH project (http://www.sunfishproject.eu/).
 *
 * Copyright 2017 University of Southampton
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

module sunfish_uc3_policy;

// Access control function on covered docs
template <domain D>
D bool [[1]] checkCovered(D bool [[1]] cov){

    return !(cov);
}

// Access control function on policy (for UC3)
template <domain D>
D bool [[1]] checkPolicyUncovered(D bool [[1]] match, D bool [[1]] cov, D uint8 [[1]] c_lvls, D uint8 v_lvl){

    assert(size(match) == size(cov));

    D bool [[1]] ac_covered = checkCovered(cov);

    assert(size(ac_covered) == size(c_lvls));

    D bool [[1]] ac_policy  = (v_lvl >= c_lvls);

    D bool [[1]] ac_final  = (ac_covered & ac_policy);

    return ac_final;

}

// Access control function on policy (Bell-LaPadula)
template <domain D>
D bool [[1]] checkPolicyBLP_Simple(string mode, D uint8 [[1]] o_lvls, D uint8 s_lvl){
    uint64 n = size(o_lvls);
    D bool [[1]] ac_policy (n);

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
template <domain D>
D bool [[1]] checkPolicyBLP(string mode, D uint8 [[1]] o_lvls, D uint8 s_lvl){
    uint64 n = size(o_lvls);
    D bool [[1]] ac_policy (n);
    
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
template <domain D>
D bool [[1]] checkPolicyBLP(bool current, string mode, D uint8 [[1]] o_lvls, D uint8 s_lvl){
    uint64 n = size(o_lvls);
    D bool [[1]] ac_policy (n);

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
