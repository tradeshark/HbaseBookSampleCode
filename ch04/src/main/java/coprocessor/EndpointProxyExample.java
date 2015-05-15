//package coprocessor;
//
//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.hbase.HBaseConfiguration;
//import org.apache.hadoop.hbase.TableName;
//import org.apache.hadoop.hbase.client.HBaseAdmin;
//import org.apache.hadoop.hbase.client.HTable;
//import org.apache.hadoop.hbase.client.Scan;
//import org.apache.hadoop.hbase.client.coprocessor.AggregationClient;
//import org.apache.hadoop.hbase.util.Bytes;
//import util.HBaseHelper;
//
//import java.io.IOException;
//import java.util.Map;
//
//// cc EndpointProxyExample Example using the proxy call of HTable to invoke an endpoint on a single region
//public class EndpointProxyExample {
//
//  public static void main(String[] args) throws Throwable {
//
//      Configuration customConf = new Configuration();
////
////      // Increase RPC timeout, in case of a slow computation
////      customConf.setLong("hbase.rpc.timeout", 600000);
////      // Default is 1, set to a higher value for faster scanner.next(..)
////      customConf.setLong("hbase.client.scanner.caching", 1000);
////      Configuration configuration = HBaseConfiguration.create(customConf);
////      AggregationClient aggregationClient = new AggregationClient(
////              configuration);
////      Scan scan = new Scan();
////      scan.addFamily("cf".getBytes());
////      long rowCount = aggregationClient.rowCount(TableName.valueOf("target"), null, scan);
////      System.out.println("row count is " + rowCount);
////
//
//
//
//    Configuration conf = HBaseConfiguration.create();
//    HBaseHelper helper = HBaseHelper.getHelper(conf);
//    helper.dropTable("testtable");
//      helper.createTable("testtable", "colfam1", "colfam2");
//    helper.put("testtable",
//      new String[]{"row1", "row2", "row3", "row4", "row5"},
//      new String[]{"colfam1", "colfam2"},
//            new String[]{"qual1", "qual1"},
//            new long[]{1, 2},
//            new String[]{"val1", "val2"});
//    System.out.println("Before endpoint call...");
//    helper.dump("testtable",
//      new String[]{"row1", "row2", "row3", "row4", "row5"},
//      null, null);
//    HBaseAdmin admin = new HBaseAdmin(conf);
//    try {
//      admin.split(Bytes.toBytes("testtable"), Bytes.toBytes("row3"));
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
//    HTable table = new HTable(conf, "testtable");
//    // wait for the split to be done
//    while (table.getRegionLocations().size() < 2)
//      try {
//        Thread.sleep(1000);
//      } catch (InterruptedException e) {
//      }
//    try {
//      //vv EndpointProxyExample
//      RowCountProtocol protocol = table.coprocessorProxy(
//        RowCountProtocol.class, Bytes.toBytes("row4"));
//      long rowsInRegion = protocol.getRowCount();
//      System.out.println("Region Row Count: " + rowsInRegion);
//      // ^^ EndpointProxyExample
//    } catch (Throwable throwable) {
//      throwable.printStackTrace();
//    }
//  }
//}
