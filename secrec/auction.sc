/**
 * This file is an example of Danish sugar beet auction (considering only one between supply and demand)
 * Implemented in Sharemind (through the usage of SMC)
 * author gilzan (https://github.com/gilzan)
 */
import shared3p;
import shared3p_table_database;
import stdlib;
import table_database;

domain pd_shared3p shared3p;

// Sums all elements of the input array and calculates the average
pd_shared3p uint64 avg(pd_shared3p uint64 [[1]] x){
  pd_shared3p uint64 res;
  pd_shared3p uint64 sum;

  uint64 n = size(x);
  for (uint64 i = 0; i < n; ++i) {
    sum += x[i];
  }

  res = sum / n;

  return res;
}


void main() {
  string ds = "DS1";
  string tbl = "bids";

  tdbOpenConnection(ds);

  /*
  *
  * STEP 1 = ADD BIDS [bidders are SMC-input parties]
  *
  */

  // If the result table already exists, delete it
  if (tdbTableExists(ds, tbl)) {
      print("Table `" + tbl + "` already exisis, deleting...");
      tdbTableDelete(ds, tbl);
  }

  print("Creating new table: ", tbl);

  /*
   * We want to create a simple table with 4 columns:
   * It contains the first column composed by the id of each bidder
   * Each bidder specifies how much goods is willing to sell/buy for each price
   *
   *       --------------------------------------------------------------------------------
   * Name: |      "bidder" |         "price_10" |         "price_15" |         "price_20" |
   * Type: | public uint64 | pd_shared3p uint64 | pd_shared3p uint64 | pd_shared3p uint64 |
   *       --------------------------------------------------------------------------------
   *       |             1 |                 38 |                 35 |                 32 |
   *       |             2 |                 42 |                 39 |                 36 |
   *       |             3 |                 38 |                 35 |                 32 |
   *       |             4 |                 42 |                 39 |                 36 |
   *       |             5 |                 38 |                 35 |                 32 |
   *       --------------------------------------------------------------------------------
   */

  uint params = tdbVmapNew();

  // Column 0, name "bidder", type public uint64
  {
      uint64 vtype;
      tdbVmapAddType(params, "types", vtype);
      tdbVmapAddString(params, "names", "bidder");
  }

  // Column 1, name "price_10", type pd_shared3p uint64
  {
      pd_shared3p uint64 vtype;
      tdbVmapAddType(params, "types", vtype);
      tdbVmapAddString(params, "names", "price_10");
  }

  // Column 2, name "price_15", type pd_shared3p uint64
  {
      pd_shared3p uint64 vtype;
      tdbVmapAddType(params, "types", vtype);
      tdbVmapAddString(params, "names", "price_15");
  }

  // Column 3, name "price_20", type pd_shared3p uint64
  {
      pd_shared3p uint64 vtype;
      tdbVmapAddType(params, "types", vtype);
      tdbVmapAddString(params, "names", "price_20");
  }

  tdbTableCreate(ds, tbl, params);
  print("Table created.");

  // Insert a couple of data bidders into database:
  for (uint64 i = 1; i <= 5; ++i) {
    print("Preparing database statement for bidder ", i);
    tdbVmapClear(params);

    uint64 bidderId = i;
    tdbVmapAddValue(params, "values", bidderId);

    pd_shared3p uint64 bid = 30;

    // trying to simulate randomness
    if((bidderId % 2) == 1){
      bid -= 1;
    }
    else{
      bid += 3;
    }

    pd_shared3p uint64 bid10 = bid + 9;
    pd_shared3p uint64 bid15 = bid + 6;
    pd_shared3p uint64 bid20 = bid + 3;

    // insert bids for each price
    tdbVmapAddValue(params, "values", bid10);
    tdbVmapAddValue(params, "values", bid15);
    tdbVmapAddValue(params, "values", bid20);

    print("Inserting bids to database");
    tdbInsertRow(ds, tbl, params);
  }
  tdbVmapDelete(params);

  /*
  *
  * STEP 2 = CALCULATE MARKET CLEARING PRICE (weighted average) [auctioneer is SMC-output party]
  *
  */

  {
    // read from database the private bids
    //uint64 [[1]] bidder = tdbReadColumn(ds, tbl, "bidder");
    pd_shared3p uint64 [[1]] price_10 = tdbReadColumn(ds, tbl, "price_10");
    pd_shared3p uint64 [[1]] price_15 = tdbReadColumn(ds, tbl, "price_15");
    pd_shared3p uint64 [[1]] price_20 = tdbReadColumn(ds, tbl, "price_20");

    // calculate the average for each price
    pd_shared3p uint64 avg_p10 = avg(price_10);
    pd_shared3p uint64 avg_p15 = avg(price_15);
    pd_shared3p uint64 avg_p20 = avg(price_20);

    // calculate the Market Clearing Price for all prices proposed (i.e. 10, 15, 20)
    pd_shared3p uint64 tot_p = 45;
    pd_shared3p uint64 sum_w = 10*avg_p10 + 15*avg_p15 + 20*avg_p20;
    pd_shared3p uint64 w_avg = sum_w / tot_p;

    // print the average making it public
    print("Average for 10 is: ", declassify(avg_p10));
    print("Average for 15 is: ", declassify(avg_p15));
    print("Average for 20 is: ", declassify(avg_p20));

    // print the MCP making it public
    print("Market clearing price is: ", declassify(w_avg));

  }

  tdbCloseConnection(ds);
  print("Done");
}
