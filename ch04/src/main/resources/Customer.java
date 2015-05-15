// ORM class for table 'Customer'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue May 05 15:38:54 CST 2015
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Customer extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String CustomerNumber;
  public String get_CustomerNumber() {
    return CustomerNumber;
  }
  public void set_CustomerNumber(String CustomerNumber) {
    this.CustomerNumber = CustomerNumber;
  }
  public Customer with_CustomerNumber(String CustomerNumber) {
    this.CustomerNumber = CustomerNumber;
    return this;
  }
  private String ParentCustomerNumber;
  public String get_ParentCustomerNumber() {
    return ParentCustomerNumber;
  }
  public void set_ParentCustomerNumber(String ParentCustomerNumber) {
    this.ParentCustomerNumber = ParentCustomerNumber;
  }
  public Customer with_ParentCustomerNumber(String ParentCustomerNumber) {
    this.ParentCustomerNumber = ParentCustomerNumber;
    return this;
  }
  private String Name;
  public String get_Name() {
    return Name;
  }
  public void set_Name(String Name) {
    this.Name = Name;
  }
  public Customer with_Name(String Name) {
    this.Name = Name;
    return this;
  }
  private Boolean BillParentFlag;
  public Boolean get_BillParentFlag() {
    return BillParentFlag;
  }
  public void set_BillParentFlag(Boolean BillParentFlag) {
    this.BillParentFlag = BillParentFlag;
  }
  public Customer with_BillParentFlag(Boolean BillParentFlag) {
    this.BillParentFlag = BillParentFlag;
    return this;
  }
  private String BillingContact;
  public String get_BillingContact() {
    return BillingContact;
  }
  public void set_BillingContact(String BillingContact) {
    this.BillingContact = BillingContact;
  }
  public Customer with_BillingContact(String BillingContact) {
    this.BillingContact = BillingContact;
    return this;
  }
  private String BillingAddress1;
  public String get_BillingAddress1() {
    return BillingAddress1;
  }
  public void set_BillingAddress1(String BillingAddress1) {
    this.BillingAddress1 = BillingAddress1;
  }
  public Customer with_BillingAddress1(String BillingAddress1) {
    this.BillingAddress1 = BillingAddress1;
    return this;
  }
  private String BillingAddress2;
  public String get_BillingAddress2() {
    return BillingAddress2;
  }
  public void set_BillingAddress2(String BillingAddress2) {
    this.BillingAddress2 = BillingAddress2;
  }
  public Customer with_BillingAddress2(String BillingAddress2) {
    this.BillingAddress2 = BillingAddress2;
    return this;
  }
  private String BillingCity;
  public String get_BillingCity() {
    return BillingCity;
  }
  public void set_BillingCity(String BillingCity) {
    this.BillingCity = BillingCity;
  }
  public Customer with_BillingCity(String BillingCity) {
    this.BillingCity = BillingCity;
    return this;
  }
  private String BillingState;
  public String get_BillingState() {
    return BillingState;
  }
  public void set_BillingState(String BillingState) {
    this.BillingState = BillingState;
  }
  public Customer with_BillingState(String BillingState) {
    this.BillingState = BillingState;
    return this;
  }
  private String BillingZipCode;
  public String get_BillingZipCode() {
    return BillingZipCode;
  }
  public void set_BillingZipCode(String BillingZipCode) {
    this.BillingZipCode = BillingZipCode;
  }
  public Customer with_BillingZipCode(String BillingZipCode) {
    this.BillingZipCode = BillingZipCode;
    return this;
  }
  private String BillingPlanetAbbrv;
  public String get_BillingPlanetAbbrv() {
    return BillingPlanetAbbrv;
  }
  public void set_BillingPlanetAbbrv(String BillingPlanetAbbrv) {
    this.BillingPlanetAbbrv = BillingPlanetAbbrv;
  }
  public Customer with_BillingPlanetAbbrv(String BillingPlanetAbbrv) {
    this.BillingPlanetAbbrv = BillingPlanetAbbrv;
    return this;
  }
  private String BillingEmail;
  public String get_BillingEmail() {
    return BillingEmail;
  }
  public void set_BillingEmail(String BillingEmail) {
    this.BillingEmail = BillingEmail;
  }
  public Customer with_BillingEmail(String BillingEmail) {
    this.BillingEmail = BillingEmail;
    return this;
  }
  private java.math.BigDecimal CreditLimit;
  public java.math.BigDecimal get_CreditLimit() {
    return CreditLimit;
  }
  public void set_CreditLimit(java.math.BigDecimal CreditLimit) {
    this.CreditLimit = CreditLimit;
  }
  public Customer with_CreditLimit(java.math.BigDecimal CreditLimit) {
    this.CreditLimit = CreditLimit;
    return this;
  }
  private Boolean ProblemUseBillingInfoFlag;
  public Boolean get_ProblemUseBillingInfoFlag() {
    return ProblemUseBillingInfoFlag;
  }
  public void set_ProblemUseBillingInfoFlag(Boolean ProblemUseBillingInfoFlag) {
    this.ProblemUseBillingInfoFlag = ProblemUseBillingInfoFlag;
  }
  public Customer with_ProblemUseBillingInfoFlag(Boolean ProblemUseBillingInfoFlag) {
    this.ProblemUseBillingInfoFlag = ProblemUseBillingInfoFlag;
    return this;
  }
  private String ProblemContact;
  public String get_ProblemContact() {
    return ProblemContact;
  }
  public void set_ProblemContact(String ProblemContact) {
    this.ProblemContact = ProblemContact;
  }
  public Customer with_ProblemContact(String ProblemContact) {
    this.ProblemContact = ProblemContact;
    return this;
  }
  private String ProblemAddress1;
  public String get_ProblemAddress1() {
    return ProblemAddress1;
  }
  public void set_ProblemAddress1(String ProblemAddress1) {
    this.ProblemAddress1 = ProblemAddress1;
  }
  public Customer with_ProblemAddress1(String ProblemAddress1) {
    this.ProblemAddress1 = ProblemAddress1;
    return this;
  }
  private String ProblemAddress2;
  public String get_ProblemAddress2() {
    return ProblemAddress2;
  }
  public void set_ProblemAddress2(String ProblemAddress2) {
    this.ProblemAddress2 = ProblemAddress2;
  }
  public Customer with_ProblemAddress2(String ProblemAddress2) {
    this.ProblemAddress2 = ProblemAddress2;
    return this;
  }
  private String ProblemCity;
  public String get_ProblemCity() {
    return ProblemCity;
  }
  public void set_ProblemCity(String ProblemCity) {
    this.ProblemCity = ProblemCity;
  }
  public Customer with_ProblemCity(String ProblemCity) {
    this.ProblemCity = ProblemCity;
    return this;
  }
  private String ProblemState;
  public String get_ProblemState() {
    return ProblemState;
  }
  public void set_ProblemState(String ProblemState) {
    this.ProblemState = ProblemState;
  }
  public Customer with_ProblemState(String ProblemState) {
    this.ProblemState = ProblemState;
    return this;
  }
  private String ProblemZipCode;
  public String get_ProblemZipCode() {
    return ProblemZipCode;
  }
  public void set_ProblemZipCode(String ProblemZipCode) {
    this.ProblemZipCode = ProblemZipCode;
  }
  public Customer with_ProblemZipCode(String ProblemZipCode) {
    this.ProblemZipCode = ProblemZipCode;
    return this;
  }
  private String ProblemPlanetAbbrv;
  public String get_ProblemPlanetAbbrv() {
    return ProblemPlanetAbbrv;
  }
  public void set_ProblemPlanetAbbrv(String ProblemPlanetAbbrv) {
    this.ProblemPlanetAbbrv = ProblemPlanetAbbrv;
  }
  public Customer with_ProblemPlanetAbbrv(String ProblemPlanetAbbrv) {
    this.ProblemPlanetAbbrv = ProblemPlanetAbbrv;
    return this;
  }
  private String ProblemEmail;
  public String get_ProblemEmail() {
    return ProblemEmail;
  }
  public void set_ProblemEmail(String ProblemEmail) {
    this.ProblemEmail = ProblemEmail;
  }
  public Customer with_ProblemEmail(String ProblemEmail) {
    this.ProblemEmail = ProblemEmail;
    return this;
  }
  private java.sql.Timestamp StartDate;
  public java.sql.Timestamp get_StartDate() {
    return StartDate;
  }
  public void set_StartDate(java.sql.Timestamp StartDate) {
    this.StartDate = StartDate;
  }
  public Customer with_StartDate(java.sql.Timestamp StartDate) {
    this.StartDate = StartDate;
    return this;
  }
  private Boolean NoDeliveriesFlag;
  public Boolean get_NoDeliveriesFlag() {
    return NoDeliveriesFlag;
  }
  public void set_NoDeliveriesFlag(Boolean NoDeliveriesFlag) {
    this.NoDeliveriesFlag = NoDeliveriesFlag;
  }
  public Customer with_NoDeliveriesFlag(Boolean NoDeliveriesFlag) {
    this.NoDeliveriesFlag = NoDeliveriesFlag;
    return this;
  }
  private Integer NumberOfEmployees;
  public Integer get_NumberOfEmployees() {
    return NumberOfEmployees;
  }
  public void set_NumberOfEmployees(Integer NumberOfEmployees) {
    this.NumberOfEmployees = NumberOfEmployees;
  }
  public Customer with_NumberOfEmployees(Integer NumberOfEmployees) {
    this.NumberOfEmployees = NumberOfEmployees;
    return this;
  }
  private java.math.BigDecimal AnnualRevenue;
  public java.math.BigDecimal get_AnnualRevenue() {
    return AnnualRevenue;
  }
  public void set_AnnualRevenue(java.math.BigDecimal AnnualRevenue) {
    this.AnnualRevenue = AnnualRevenue;
  }
  public Customer with_AnnualRevenue(java.math.BigDecimal AnnualRevenue) {
    this.AnnualRevenue = AnnualRevenue;
    return this;
  }
  private Integer AccountRepEmployeeNumber;
  public Integer get_AccountRepEmployeeNumber() {
    return AccountRepEmployeeNumber;
  }
  public void set_AccountRepEmployeeNumber(Integer AccountRepEmployeeNumber) {
    this.AccountRepEmployeeNumber = AccountRepEmployeeNumber;
  }
  public Customer with_AccountRepEmployeeNumber(Integer AccountRepEmployeeNumber) {
    this.AccountRepEmployeeNumber = AccountRepEmployeeNumber;
    return this;
  }
  private String Comments;
  public String get_Comments() {
    return Comments;
  }
  public void set_Comments(String Comments) {
    this.Comments = Comments;
  }
  public Customer with_Comments(String Comments) {
    this.Comments = Comments;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Customer)) {
      return false;
    }
    Customer that = (Customer) o;
    boolean equal = true;
    equal = equal && (this.CustomerNumber == null ? that.CustomerNumber == null : this.CustomerNumber.equals(that.CustomerNumber));
    equal = equal && (this.ParentCustomerNumber == null ? that.ParentCustomerNumber == null : this.ParentCustomerNumber.equals(that.ParentCustomerNumber));
    equal = equal && (this.Name == null ? that.Name == null : this.Name.equals(that.Name));
    equal = equal && (this.BillParentFlag == null ? that.BillParentFlag == null : this.BillParentFlag.equals(that.BillParentFlag));
    equal = equal && (this.BillingContact == null ? that.BillingContact == null : this.BillingContact.equals(that.BillingContact));
    equal = equal && (this.BillingAddress1 == null ? that.BillingAddress1 == null : this.BillingAddress1.equals(that.BillingAddress1));
    equal = equal && (this.BillingAddress2 == null ? that.BillingAddress2 == null : this.BillingAddress2.equals(that.BillingAddress2));
    equal = equal && (this.BillingCity == null ? that.BillingCity == null : this.BillingCity.equals(that.BillingCity));
    equal = equal && (this.BillingState == null ? that.BillingState == null : this.BillingState.equals(that.BillingState));
    equal = equal && (this.BillingZipCode == null ? that.BillingZipCode == null : this.BillingZipCode.equals(that.BillingZipCode));
    equal = equal && (this.BillingPlanetAbbrv == null ? that.BillingPlanetAbbrv == null : this.BillingPlanetAbbrv.equals(that.BillingPlanetAbbrv));
    equal = equal && (this.BillingEmail == null ? that.BillingEmail == null : this.BillingEmail.equals(that.BillingEmail));
    equal = equal && (this.CreditLimit == null ? that.CreditLimit == null : this.CreditLimit.equals(that.CreditLimit));
    equal = equal && (this.ProblemUseBillingInfoFlag == null ? that.ProblemUseBillingInfoFlag == null : this.ProblemUseBillingInfoFlag.equals(that.ProblemUseBillingInfoFlag));
    equal = equal && (this.ProblemContact == null ? that.ProblemContact == null : this.ProblemContact.equals(that.ProblemContact));
    equal = equal && (this.ProblemAddress1 == null ? that.ProblemAddress1 == null : this.ProblemAddress1.equals(that.ProblemAddress1));
    equal = equal && (this.ProblemAddress2 == null ? that.ProblemAddress2 == null : this.ProblemAddress2.equals(that.ProblemAddress2));
    equal = equal && (this.ProblemCity == null ? that.ProblemCity == null : this.ProblemCity.equals(that.ProblemCity));
    equal = equal && (this.ProblemState == null ? that.ProblemState == null : this.ProblemState.equals(that.ProblemState));
    equal = equal && (this.ProblemZipCode == null ? that.ProblemZipCode == null : this.ProblemZipCode.equals(that.ProblemZipCode));
    equal = equal && (this.ProblemPlanetAbbrv == null ? that.ProblemPlanetAbbrv == null : this.ProblemPlanetAbbrv.equals(that.ProblemPlanetAbbrv));
    equal = equal && (this.ProblemEmail == null ? that.ProblemEmail == null : this.ProblemEmail.equals(that.ProblemEmail));
    equal = equal && (this.StartDate == null ? that.StartDate == null : this.StartDate.equals(that.StartDate));
    equal = equal && (this.NoDeliveriesFlag == null ? that.NoDeliveriesFlag == null : this.NoDeliveriesFlag.equals(that.NoDeliveriesFlag));
    equal = equal && (this.NumberOfEmployees == null ? that.NumberOfEmployees == null : this.NumberOfEmployees.equals(that.NumberOfEmployees));
    equal = equal && (this.AnnualRevenue == null ? that.AnnualRevenue == null : this.AnnualRevenue.equals(that.AnnualRevenue));
    equal = equal && (this.AccountRepEmployeeNumber == null ? that.AccountRepEmployeeNumber == null : this.AccountRepEmployeeNumber.equals(that.AccountRepEmployeeNumber));
    equal = equal && (this.Comments == null ? that.Comments == null : this.Comments.equals(that.Comments));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Customer)) {
      return false;
    }
    Customer that = (Customer) o;
    boolean equal = true;
    equal = equal && (this.CustomerNumber == null ? that.CustomerNumber == null : this.CustomerNumber.equals(that.CustomerNumber));
    equal = equal && (this.ParentCustomerNumber == null ? that.ParentCustomerNumber == null : this.ParentCustomerNumber.equals(that.ParentCustomerNumber));
    equal = equal && (this.Name == null ? that.Name == null : this.Name.equals(that.Name));
    equal = equal && (this.BillParentFlag == null ? that.BillParentFlag == null : this.BillParentFlag.equals(that.BillParentFlag));
    equal = equal && (this.BillingContact == null ? that.BillingContact == null : this.BillingContact.equals(that.BillingContact));
    equal = equal && (this.BillingAddress1 == null ? that.BillingAddress1 == null : this.BillingAddress1.equals(that.BillingAddress1));
    equal = equal && (this.BillingAddress2 == null ? that.BillingAddress2 == null : this.BillingAddress2.equals(that.BillingAddress2));
    equal = equal && (this.BillingCity == null ? that.BillingCity == null : this.BillingCity.equals(that.BillingCity));
    equal = equal && (this.BillingState == null ? that.BillingState == null : this.BillingState.equals(that.BillingState));
    equal = equal && (this.BillingZipCode == null ? that.BillingZipCode == null : this.BillingZipCode.equals(that.BillingZipCode));
    equal = equal && (this.BillingPlanetAbbrv == null ? that.BillingPlanetAbbrv == null : this.BillingPlanetAbbrv.equals(that.BillingPlanetAbbrv));
    equal = equal && (this.BillingEmail == null ? that.BillingEmail == null : this.BillingEmail.equals(that.BillingEmail));
    equal = equal && (this.CreditLimit == null ? that.CreditLimit == null : this.CreditLimit.equals(that.CreditLimit));
    equal = equal && (this.ProblemUseBillingInfoFlag == null ? that.ProblemUseBillingInfoFlag == null : this.ProblemUseBillingInfoFlag.equals(that.ProblemUseBillingInfoFlag));
    equal = equal && (this.ProblemContact == null ? that.ProblemContact == null : this.ProblemContact.equals(that.ProblemContact));
    equal = equal && (this.ProblemAddress1 == null ? that.ProblemAddress1 == null : this.ProblemAddress1.equals(that.ProblemAddress1));
    equal = equal && (this.ProblemAddress2 == null ? that.ProblemAddress2 == null : this.ProblemAddress2.equals(that.ProblemAddress2));
    equal = equal && (this.ProblemCity == null ? that.ProblemCity == null : this.ProblemCity.equals(that.ProblemCity));
    equal = equal && (this.ProblemState == null ? that.ProblemState == null : this.ProblemState.equals(that.ProblemState));
    equal = equal && (this.ProblemZipCode == null ? that.ProblemZipCode == null : this.ProblemZipCode.equals(that.ProblemZipCode));
    equal = equal && (this.ProblemPlanetAbbrv == null ? that.ProblemPlanetAbbrv == null : this.ProblemPlanetAbbrv.equals(that.ProblemPlanetAbbrv));
    equal = equal && (this.ProblemEmail == null ? that.ProblemEmail == null : this.ProblemEmail.equals(that.ProblemEmail));
    equal = equal && (this.StartDate == null ? that.StartDate == null : this.StartDate.equals(that.StartDate));
    equal = equal && (this.NoDeliveriesFlag == null ? that.NoDeliveriesFlag == null : this.NoDeliveriesFlag.equals(that.NoDeliveriesFlag));
    equal = equal && (this.NumberOfEmployees == null ? that.NumberOfEmployees == null : this.NumberOfEmployees.equals(that.NumberOfEmployees));
    equal = equal && (this.AnnualRevenue == null ? that.AnnualRevenue == null : this.AnnualRevenue.equals(that.AnnualRevenue));
    equal = equal && (this.AccountRepEmployeeNumber == null ? that.AccountRepEmployeeNumber == null : this.AccountRepEmployeeNumber.equals(that.AccountRepEmployeeNumber));
    equal = equal && (this.Comments == null ? that.Comments == null : this.Comments.equals(that.Comments));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CustomerNumber = JdbcWritableBridge.readString(1, __dbResults);
    this.ParentCustomerNumber = JdbcWritableBridge.readString(2, __dbResults);
    this.Name = JdbcWritableBridge.readString(3, __dbResults);
    this.BillParentFlag = JdbcWritableBridge.readBoolean(4, __dbResults);
    this.BillingContact = JdbcWritableBridge.readString(5, __dbResults);
    this.BillingAddress1 = JdbcWritableBridge.readString(6, __dbResults);
    this.BillingAddress2 = JdbcWritableBridge.readString(7, __dbResults);
    this.BillingCity = JdbcWritableBridge.readString(8, __dbResults);
    this.BillingState = JdbcWritableBridge.readString(9, __dbResults);
    this.BillingZipCode = JdbcWritableBridge.readString(10, __dbResults);
    this.BillingPlanetAbbrv = JdbcWritableBridge.readString(11, __dbResults);
    this.BillingEmail = JdbcWritableBridge.readString(12, __dbResults);
    this.CreditLimit = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.ProblemUseBillingInfoFlag = JdbcWritableBridge.readBoolean(14, __dbResults);
    this.ProblemContact = JdbcWritableBridge.readString(15, __dbResults);
    this.ProblemAddress1 = JdbcWritableBridge.readString(16, __dbResults);
    this.ProblemAddress2 = JdbcWritableBridge.readString(17, __dbResults);
    this.ProblemCity = JdbcWritableBridge.readString(18, __dbResults);
    this.ProblemState = JdbcWritableBridge.readString(19, __dbResults);
    this.ProblemZipCode = JdbcWritableBridge.readString(20, __dbResults);
    this.ProblemPlanetAbbrv = JdbcWritableBridge.readString(21, __dbResults);
    this.ProblemEmail = JdbcWritableBridge.readString(22, __dbResults);
    this.StartDate = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.NoDeliveriesFlag = JdbcWritableBridge.readBoolean(24, __dbResults);
    this.NumberOfEmployees = JdbcWritableBridge.readInteger(25, __dbResults);
    this.AnnualRevenue = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.AccountRepEmployeeNumber = JdbcWritableBridge.readInteger(27, __dbResults);
    this.Comments = JdbcWritableBridge.readString(28, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CustomerNumber = JdbcWritableBridge.readString(1, __dbResults);
    this.ParentCustomerNumber = JdbcWritableBridge.readString(2, __dbResults);
    this.Name = JdbcWritableBridge.readString(3, __dbResults);
    this.BillParentFlag = JdbcWritableBridge.readBoolean(4, __dbResults);
    this.BillingContact = JdbcWritableBridge.readString(5, __dbResults);
    this.BillingAddress1 = JdbcWritableBridge.readString(6, __dbResults);
    this.BillingAddress2 = JdbcWritableBridge.readString(7, __dbResults);
    this.BillingCity = JdbcWritableBridge.readString(8, __dbResults);
    this.BillingState = JdbcWritableBridge.readString(9, __dbResults);
    this.BillingZipCode = JdbcWritableBridge.readString(10, __dbResults);
    this.BillingPlanetAbbrv = JdbcWritableBridge.readString(11, __dbResults);
    this.BillingEmail = JdbcWritableBridge.readString(12, __dbResults);
    this.CreditLimit = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.ProblemUseBillingInfoFlag = JdbcWritableBridge.readBoolean(14, __dbResults);
    this.ProblemContact = JdbcWritableBridge.readString(15, __dbResults);
    this.ProblemAddress1 = JdbcWritableBridge.readString(16, __dbResults);
    this.ProblemAddress2 = JdbcWritableBridge.readString(17, __dbResults);
    this.ProblemCity = JdbcWritableBridge.readString(18, __dbResults);
    this.ProblemState = JdbcWritableBridge.readString(19, __dbResults);
    this.ProblemZipCode = JdbcWritableBridge.readString(20, __dbResults);
    this.ProblemPlanetAbbrv = JdbcWritableBridge.readString(21, __dbResults);
    this.ProblemEmail = JdbcWritableBridge.readString(22, __dbResults);
    this.StartDate = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.NoDeliveriesFlag = JdbcWritableBridge.readBoolean(24, __dbResults);
    this.NumberOfEmployees = JdbcWritableBridge.readInteger(25, __dbResults);
    this.AnnualRevenue = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.AccountRepEmployeeNumber = JdbcWritableBridge.readInteger(27, __dbResults);
    this.Comments = JdbcWritableBridge.readString(28, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CustomerNumber, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ParentCustomerNumber, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(BillParentFlag, 4 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(BillingContact, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BillingAddress1, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BillingAddress2, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BillingCity, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BillingState, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(BillingZipCode, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BillingPlanetAbbrv, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(BillingEmail, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CreditLimit, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBoolean(ProblemUseBillingInfoFlag, 14 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(ProblemContact, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProblemAddress1, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProblemAddress2, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProblemCity, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProblemState, 19 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(ProblemZipCode, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProblemPlanetAbbrv, 21 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(ProblemEmail, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(StartDate, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBoolean(NoDeliveriesFlag, 24 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeInteger(NumberOfEmployees, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AnnualRevenue, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(AccountRepEmployeeNumber, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Comments, 28 + __off, 12, __dbStmt);
    return 28;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CustomerNumber, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ParentCustomerNumber, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(BillParentFlag, 4 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(BillingContact, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BillingAddress1, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BillingAddress2, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BillingCity, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BillingState, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(BillingZipCode, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BillingPlanetAbbrv, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(BillingEmail, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CreditLimit, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBoolean(ProblemUseBillingInfoFlag, 14 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(ProblemContact, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProblemAddress1, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProblemAddress2, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProblemCity, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProblemState, 19 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(ProblemZipCode, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ProblemPlanetAbbrv, 21 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(ProblemEmail, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(StartDate, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBoolean(NoDeliveriesFlag, 24 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeInteger(NumberOfEmployees, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AnnualRevenue, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(AccountRepEmployeeNumber, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Comments, 28 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CustomerNumber = null;
    } else {
    this.CustomerNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ParentCustomerNumber = null;
    } else {
    this.ParentCustomerNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Name = null;
    } else {
    this.Name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BillParentFlag = null;
    } else {
    this.BillParentFlag = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.BillingContact = null;
    } else {
    this.BillingContact = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BillingAddress1 = null;
    } else {
    this.BillingAddress1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BillingAddress2 = null;
    } else {
    this.BillingAddress2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BillingCity = null;
    } else {
    this.BillingCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BillingState = null;
    } else {
    this.BillingState = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BillingZipCode = null;
    } else {
    this.BillingZipCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BillingPlanetAbbrv = null;
    } else {
    this.BillingPlanetAbbrv = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BillingEmail = null;
    } else {
    this.BillingEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CreditLimit = null;
    } else {
    this.CreditLimit = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProblemUseBillingInfoFlag = null;
    } else {
    this.ProblemUseBillingInfoFlag = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.ProblemContact = null;
    } else {
    this.ProblemContact = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProblemAddress1 = null;
    } else {
    this.ProblemAddress1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProblemAddress2 = null;
    } else {
    this.ProblemAddress2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProblemCity = null;
    } else {
    this.ProblemCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProblemState = null;
    } else {
    this.ProblemState = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProblemZipCode = null;
    } else {
    this.ProblemZipCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProblemPlanetAbbrv = null;
    } else {
    this.ProblemPlanetAbbrv = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProblemEmail = null;
    } else {
    this.ProblemEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.StartDate = null;
    } else {
    this.StartDate = new Timestamp(__dataIn.readLong());
    this.StartDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.NoDeliveriesFlag = null;
    } else {
    this.NoDeliveriesFlag = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.NumberOfEmployees = null;
    } else {
    this.NumberOfEmployees = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.AnnualRevenue = null;
    } else {
    this.AnnualRevenue = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AccountRepEmployeeNumber = null;
    } else {
    this.AccountRepEmployeeNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Comments = null;
    } else {
    this.Comments = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CustomerNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CustomerNumber);
    }
    if (null == this.ParentCustomerNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ParentCustomerNumber);
    }
    if (null == this.Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Name);
    }
    if (null == this.BillParentFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.BillParentFlag);
    }
    if (null == this.BillingContact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingContact);
    }
    if (null == this.BillingAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingAddress1);
    }
    if (null == this.BillingAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingAddress2);
    }
    if (null == this.BillingCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingCity);
    }
    if (null == this.BillingState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingState);
    }
    if (null == this.BillingZipCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingZipCode);
    }
    if (null == this.BillingPlanetAbbrv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingPlanetAbbrv);
    }
    if (null == this.BillingEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingEmail);
    }
    if (null == this.CreditLimit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CreditLimit, __dataOut);
    }
    if (null == this.ProblemUseBillingInfoFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.ProblemUseBillingInfoFlag);
    }
    if (null == this.ProblemContact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemContact);
    }
    if (null == this.ProblemAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemAddress1);
    }
    if (null == this.ProblemAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemAddress2);
    }
    if (null == this.ProblemCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemCity);
    }
    if (null == this.ProblemState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemState);
    }
    if (null == this.ProblemZipCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemZipCode);
    }
    if (null == this.ProblemPlanetAbbrv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemPlanetAbbrv);
    }
    if (null == this.ProblemEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemEmail);
    }
    if (null == this.StartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.StartDate.getTime());
    __dataOut.writeInt(this.StartDate.getNanos());
    }
    if (null == this.NoDeliveriesFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.NoDeliveriesFlag);
    }
    if (null == this.NumberOfEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.NumberOfEmployees);
    }
    if (null == this.AnnualRevenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AnnualRevenue, __dataOut);
    }
    if (null == this.AccountRepEmployeeNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.AccountRepEmployeeNumber);
    }
    if (null == this.Comments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Comments);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CustomerNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CustomerNumber);
    }
    if (null == this.ParentCustomerNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ParentCustomerNumber);
    }
    if (null == this.Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Name);
    }
    if (null == this.BillParentFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.BillParentFlag);
    }
    if (null == this.BillingContact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingContact);
    }
    if (null == this.BillingAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingAddress1);
    }
    if (null == this.BillingAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingAddress2);
    }
    if (null == this.BillingCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingCity);
    }
    if (null == this.BillingState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingState);
    }
    if (null == this.BillingZipCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingZipCode);
    }
    if (null == this.BillingPlanetAbbrv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingPlanetAbbrv);
    }
    if (null == this.BillingEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BillingEmail);
    }
    if (null == this.CreditLimit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CreditLimit, __dataOut);
    }
    if (null == this.ProblemUseBillingInfoFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.ProblemUseBillingInfoFlag);
    }
    if (null == this.ProblemContact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemContact);
    }
    if (null == this.ProblemAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemAddress1);
    }
    if (null == this.ProblemAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemAddress2);
    }
    if (null == this.ProblemCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemCity);
    }
    if (null == this.ProblemState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemState);
    }
    if (null == this.ProblemZipCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemZipCode);
    }
    if (null == this.ProblemPlanetAbbrv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemPlanetAbbrv);
    }
    if (null == this.ProblemEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProblemEmail);
    }
    if (null == this.StartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.StartDate.getTime());
    __dataOut.writeInt(this.StartDate.getNanos());
    }
    if (null == this.NoDeliveriesFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.NoDeliveriesFlag);
    }
    if (null == this.NumberOfEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.NumberOfEmployees);
    }
    if (null == this.AnnualRevenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AnnualRevenue, __dataOut);
    }
    if (null == this.AccountRepEmployeeNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.AccountRepEmployeeNumber);
    }
    if (null == this.Comments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Comments);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerNumber==null?"null":CustomerNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ParentCustomerNumber==null?"null":ParentCustomerNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Name==null?"null":Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillParentFlag==null?"null":"" + BillParentFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingContact==null?"null":BillingContact, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingAddress1==null?"null":BillingAddress1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingAddress2==null?"null":BillingAddress2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingCity==null?"null":BillingCity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingState==null?"null":BillingState, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingZipCode==null?"null":BillingZipCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingPlanetAbbrv==null?"null":BillingPlanetAbbrv, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingEmail==null?"null":BillingEmail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CreditLimit==null?"null":CreditLimit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemUseBillingInfoFlag==null?"null":"" + ProblemUseBillingInfoFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemContact==null?"null":ProblemContact, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemAddress1==null?"null":ProblemAddress1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemAddress2==null?"null":ProblemAddress2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemCity==null?"null":ProblemCity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemState==null?"null":ProblemState, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemZipCode==null?"null":ProblemZipCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemPlanetAbbrv==null?"null":ProblemPlanetAbbrv, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemEmail==null?"null":ProblemEmail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StartDate==null?"null":"" + StartDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NoDeliveriesFlag==null?"null":"" + NoDeliveriesFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NumberOfEmployees==null?"null":"" + NumberOfEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AnnualRevenue==null?"null":AnnualRevenue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AccountRepEmployeeNumber==null?"null":"" + AccountRepEmployeeNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Comments==null?"null":Comments, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerNumber==null?"null":CustomerNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ParentCustomerNumber==null?"null":ParentCustomerNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Name==null?"null":Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillParentFlag==null?"null":"" + BillParentFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingContact==null?"null":BillingContact, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingAddress1==null?"null":BillingAddress1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingAddress2==null?"null":BillingAddress2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingCity==null?"null":BillingCity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingState==null?"null":BillingState, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingZipCode==null?"null":BillingZipCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingPlanetAbbrv==null?"null":BillingPlanetAbbrv, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BillingEmail==null?"null":BillingEmail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CreditLimit==null?"null":CreditLimit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemUseBillingInfoFlag==null?"null":"" + ProblemUseBillingInfoFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemContact==null?"null":ProblemContact, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemAddress1==null?"null":ProblemAddress1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemAddress2==null?"null":ProblemAddress2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemCity==null?"null":ProblemCity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemState==null?"null":ProblemState, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemZipCode==null?"null":ProblemZipCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemPlanetAbbrv==null?"null":ProblemPlanetAbbrv, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProblemEmail==null?"null":ProblemEmail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StartDate==null?"null":"" + StartDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NoDeliveriesFlag==null?"null":"" + NoDeliveriesFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NumberOfEmployees==null?"null":"" + NumberOfEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AnnualRevenue==null?"null":AnnualRevenue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AccountRepEmployeeNumber==null?"null":"" + AccountRepEmployeeNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Comments==null?"null":Comments, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CustomerNumber = null; } else {
      this.CustomerNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ParentCustomerNumber = null; } else {
      this.ParentCustomerNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Name = null; } else {
      this.Name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BillParentFlag = null; } else {
      this.BillParentFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingContact = null; } else {
      this.BillingContact = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingAddress1 = null; } else {
      this.BillingAddress1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingAddress2 = null; } else {
      this.BillingAddress2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingCity = null; } else {
      this.BillingCity = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingState = null; } else {
      this.BillingState = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingZipCode = null; } else {
      this.BillingZipCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingPlanetAbbrv = null; } else {
      this.BillingPlanetAbbrv = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingEmail = null; } else {
      this.BillingEmail = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CreditLimit = null; } else {
      this.CreditLimit = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProblemUseBillingInfoFlag = null; } else {
      this.ProblemUseBillingInfoFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemContact = null; } else {
      this.ProblemContact = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemAddress1 = null; } else {
      this.ProblemAddress1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemAddress2 = null; } else {
      this.ProblemAddress2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemCity = null; } else {
      this.ProblemCity = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemState = null; } else {
      this.ProblemState = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemZipCode = null; } else {
      this.ProblemZipCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemPlanetAbbrv = null; } else {
      this.ProblemPlanetAbbrv = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemEmail = null; } else {
      this.ProblemEmail = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.StartDate = null; } else {
      this.StartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NoDeliveriesFlag = null; } else {
      this.NoDeliveriesFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NumberOfEmployees = null; } else {
      this.NumberOfEmployees = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AnnualRevenue = null; } else {
      this.AnnualRevenue = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AccountRepEmployeeNumber = null; } else {
      this.AccountRepEmployeeNumber = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Comments = null; } else {
      this.Comments = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CustomerNumber = null; } else {
      this.CustomerNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ParentCustomerNumber = null; } else {
      this.ParentCustomerNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Name = null; } else {
      this.Name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BillParentFlag = null; } else {
      this.BillParentFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingContact = null; } else {
      this.BillingContact = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingAddress1 = null; } else {
      this.BillingAddress1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingAddress2 = null; } else {
      this.BillingAddress2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingCity = null; } else {
      this.BillingCity = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingState = null; } else {
      this.BillingState = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingZipCode = null; } else {
      this.BillingZipCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingPlanetAbbrv = null; } else {
      this.BillingPlanetAbbrv = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BillingEmail = null; } else {
      this.BillingEmail = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CreditLimit = null; } else {
      this.CreditLimit = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProblemUseBillingInfoFlag = null; } else {
      this.ProblemUseBillingInfoFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemContact = null; } else {
      this.ProblemContact = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemAddress1 = null; } else {
      this.ProblemAddress1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemAddress2 = null; } else {
      this.ProblemAddress2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemCity = null; } else {
      this.ProblemCity = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemState = null; } else {
      this.ProblemState = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemZipCode = null; } else {
      this.ProblemZipCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemPlanetAbbrv = null; } else {
      this.ProblemPlanetAbbrv = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProblemEmail = null; } else {
      this.ProblemEmail = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.StartDate = null; } else {
      this.StartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NoDeliveriesFlag = null; } else {
      this.NoDeliveriesFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NumberOfEmployees = null; } else {
      this.NumberOfEmployees = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AnnualRevenue = null; } else {
      this.AnnualRevenue = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AccountRepEmployeeNumber = null; } else {
      this.AccountRepEmployeeNumber = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Comments = null; } else {
      this.Comments = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    Customer o = (Customer) super.clone();
    o.StartDate = (o.StartDate != null) ? (java.sql.Timestamp) o.StartDate.clone() : null;
    return o;
  }

  public void clone0(Customer o) throws CloneNotSupportedException {
    o.StartDate = (o.StartDate != null) ? (java.sql.Timestamp) o.StartDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CustomerNumber", this.CustomerNumber);
    __sqoop$field_map.put("ParentCustomerNumber", this.ParentCustomerNumber);
    __sqoop$field_map.put("Name", this.Name);
    __sqoop$field_map.put("BillParentFlag", this.BillParentFlag);
    __sqoop$field_map.put("BillingContact", this.BillingContact);
    __sqoop$field_map.put("BillingAddress1", this.BillingAddress1);
    __sqoop$field_map.put("BillingAddress2", this.BillingAddress2);
    __sqoop$field_map.put("BillingCity", this.BillingCity);
    __sqoop$field_map.put("BillingState", this.BillingState);
    __sqoop$field_map.put("BillingZipCode", this.BillingZipCode);
    __sqoop$field_map.put("BillingPlanetAbbrv", this.BillingPlanetAbbrv);
    __sqoop$field_map.put("BillingEmail", this.BillingEmail);
    __sqoop$field_map.put("CreditLimit", this.CreditLimit);
    __sqoop$field_map.put("ProblemUseBillingInfoFlag", this.ProblemUseBillingInfoFlag);
    __sqoop$field_map.put("ProblemContact", this.ProblemContact);
    __sqoop$field_map.put("ProblemAddress1", this.ProblemAddress1);
    __sqoop$field_map.put("ProblemAddress2", this.ProblemAddress2);
    __sqoop$field_map.put("ProblemCity", this.ProblemCity);
    __sqoop$field_map.put("ProblemState", this.ProblemState);
    __sqoop$field_map.put("ProblemZipCode", this.ProblemZipCode);
    __sqoop$field_map.put("ProblemPlanetAbbrv", this.ProblemPlanetAbbrv);
    __sqoop$field_map.put("ProblemEmail", this.ProblemEmail);
    __sqoop$field_map.put("StartDate", this.StartDate);
    __sqoop$field_map.put("NoDeliveriesFlag", this.NoDeliveriesFlag);
    __sqoop$field_map.put("NumberOfEmployees", this.NumberOfEmployees);
    __sqoop$field_map.put("AnnualRevenue", this.AnnualRevenue);
    __sqoop$field_map.put("AccountRepEmployeeNumber", this.AccountRepEmployeeNumber);
    __sqoop$field_map.put("Comments", this.Comments);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CustomerNumber", this.CustomerNumber);
    __sqoop$field_map.put("ParentCustomerNumber", this.ParentCustomerNumber);
    __sqoop$field_map.put("Name", this.Name);
    __sqoop$field_map.put("BillParentFlag", this.BillParentFlag);
    __sqoop$field_map.put("BillingContact", this.BillingContact);
    __sqoop$field_map.put("BillingAddress1", this.BillingAddress1);
    __sqoop$field_map.put("BillingAddress2", this.BillingAddress2);
    __sqoop$field_map.put("BillingCity", this.BillingCity);
    __sqoop$field_map.put("BillingState", this.BillingState);
    __sqoop$field_map.put("BillingZipCode", this.BillingZipCode);
    __sqoop$field_map.put("BillingPlanetAbbrv", this.BillingPlanetAbbrv);
    __sqoop$field_map.put("BillingEmail", this.BillingEmail);
    __sqoop$field_map.put("CreditLimit", this.CreditLimit);
    __sqoop$field_map.put("ProblemUseBillingInfoFlag", this.ProblemUseBillingInfoFlag);
    __sqoop$field_map.put("ProblemContact", this.ProblemContact);
    __sqoop$field_map.put("ProblemAddress1", this.ProblemAddress1);
    __sqoop$field_map.put("ProblemAddress2", this.ProblemAddress2);
    __sqoop$field_map.put("ProblemCity", this.ProblemCity);
    __sqoop$field_map.put("ProblemState", this.ProblemState);
    __sqoop$field_map.put("ProblemZipCode", this.ProblemZipCode);
    __sqoop$field_map.put("ProblemPlanetAbbrv", this.ProblemPlanetAbbrv);
    __sqoop$field_map.put("ProblemEmail", this.ProblemEmail);
    __sqoop$field_map.put("StartDate", this.StartDate);
    __sqoop$field_map.put("NoDeliveriesFlag", this.NoDeliveriesFlag);
    __sqoop$field_map.put("NumberOfEmployees", this.NumberOfEmployees);
    __sqoop$field_map.put("AnnualRevenue", this.AnnualRevenue);
    __sqoop$field_map.put("AccountRepEmployeeNumber", this.AccountRepEmployeeNumber);
    __sqoop$field_map.put("Comments", this.Comments);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CustomerNumber".equals(__fieldName)) {
      this.CustomerNumber = (String) __fieldVal;
    }
    else    if ("ParentCustomerNumber".equals(__fieldName)) {
      this.ParentCustomerNumber = (String) __fieldVal;
    }
    else    if ("Name".equals(__fieldName)) {
      this.Name = (String) __fieldVal;
    }
    else    if ("BillParentFlag".equals(__fieldName)) {
      this.BillParentFlag = (Boolean) __fieldVal;
    }
    else    if ("BillingContact".equals(__fieldName)) {
      this.BillingContact = (String) __fieldVal;
    }
    else    if ("BillingAddress1".equals(__fieldName)) {
      this.BillingAddress1 = (String) __fieldVal;
    }
    else    if ("BillingAddress2".equals(__fieldName)) {
      this.BillingAddress2 = (String) __fieldVal;
    }
    else    if ("BillingCity".equals(__fieldName)) {
      this.BillingCity = (String) __fieldVal;
    }
    else    if ("BillingState".equals(__fieldName)) {
      this.BillingState = (String) __fieldVal;
    }
    else    if ("BillingZipCode".equals(__fieldName)) {
      this.BillingZipCode = (String) __fieldVal;
    }
    else    if ("BillingPlanetAbbrv".equals(__fieldName)) {
      this.BillingPlanetAbbrv = (String) __fieldVal;
    }
    else    if ("BillingEmail".equals(__fieldName)) {
      this.BillingEmail = (String) __fieldVal;
    }
    else    if ("CreditLimit".equals(__fieldName)) {
      this.CreditLimit = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ProblemUseBillingInfoFlag".equals(__fieldName)) {
      this.ProblemUseBillingInfoFlag = (Boolean) __fieldVal;
    }
    else    if ("ProblemContact".equals(__fieldName)) {
      this.ProblemContact = (String) __fieldVal;
    }
    else    if ("ProblemAddress1".equals(__fieldName)) {
      this.ProblemAddress1 = (String) __fieldVal;
    }
    else    if ("ProblemAddress2".equals(__fieldName)) {
      this.ProblemAddress2 = (String) __fieldVal;
    }
    else    if ("ProblemCity".equals(__fieldName)) {
      this.ProblemCity = (String) __fieldVal;
    }
    else    if ("ProblemState".equals(__fieldName)) {
      this.ProblemState = (String) __fieldVal;
    }
    else    if ("ProblemZipCode".equals(__fieldName)) {
      this.ProblemZipCode = (String) __fieldVal;
    }
    else    if ("ProblemPlanetAbbrv".equals(__fieldName)) {
      this.ProblemPlanetAbbrv = (String) __fieldVal;
    }
    else    if ("ProblemEmail".equals(__fieldName)) {
      this.ProblemEmail = (String) __fieldVal;
    }
    else    if ("StartDate".equals(__fieldName)) {
      this.StartDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("NoDeliveriesFlag".equals(__fieldName)) {
      this.NoDeliveriesFlag = (Boolean) __fieldVal;
    }
    else    if ("NumberOfEmployees".equals(__fieldName)) {
      this.NumberOfEmployees = (Integer) __fieldVal;
    }
    else    if ("AnnualRevenue".equals(__fieldName)) {
      this.AnnualRevenue = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AccountRepEmployeeNumber".equals(__fieldName)) {
      this.AccountRepEmployeeNumber = (Integer) __fieldVal;
    }
    else    if ("Comments".equals(__fieldName)) {
      this.Comments = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("CustomerNumber".equals(__fieldName)) {
      this.CustomerNumber = (String) __fieldVal;
      return true;
    }
    else    if ("ParentCustomerNumber".equals(__fieldName)) {
      this.ParentCustomerNumber = (String) __fieldVal;
      return true;
    }
    else    if ("Name".equals(__fieldName)) {
      this.Name = (String) __fieldVal;
      return true;
    }
    else    if ("BillParentFlag".equals(__fieldName)) {
      this.BillParentFlag = (Boolean) __fieldVal;
      return true;
    }
    else    if ("BillingContact".equals(__fieldName)) {
      this.BillingContact = (String) __fieldVal;
      return true;
    }
    else    if ("BillingAddress1".equals(__fieldName)) {
      this.BillingAddress1 = (String) __fieldVal;
      return true;
    }
    else    if ("BillingAddress2".equals(__fieldName)) {
      this.BillingAddress2 = (String) __fieldVal;
      return true;
    }
    else    if ("BillingCity".equals(__fieldName)) {
      this.BillingCity = (String) __fieldVal;
      return true;
    }
    else    if ("BillingState".equals(__fieldName)) {
      this.BillingState = (String) __fieldVal;
      return true;
    }
    else    if ("BillingZipCode".equals(__fieldName)) {
      this.BillingZipCode = (String) __fieldVal;
      return true;
    }
    else    if ("BillingPlanetAbbrv".equals(__fieldName)) {
      this.BillingPlanetAbbrv = (String) __fieldVal;
      return true;
    }
    else    if ("BillingEmail".equals(__fieldName)) {
      this.BillingEmail = (String) __fieldVal;
      return true;
    }
    else    if ("CreditLimit".equals(__fieldName)) {
      this.CreditLimit = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ProblemUseBillingInfoFlag".equals(__fieldName)) {
      this.ProblemUseBillingInfoFlag = (Boolean) __fieldVal;
      return true;
    }
    else    if ("ProblemContact".equals(__fieldName)) {
      this.ProblemContact = (String) __fieldVal;
      return true;
    }
    else    if ("ProblemAddress1".equals(__fieldName)) {
      this.ProblemAddress1 = (String) __fieldVal;
      return true;
    }
    else    if ("ProblemAddress2".equals(__fieldName)) {
      this.ProblemAddress2 = (String) __fieldVal;
      return true;
    }
    else    if ("ProblemCity".equals(__fieldName)) {
      this.ProblemCity = (String) __fieldVal;
      return true;
    }
    else    if ("ProblemState".equals(__fieldName)) {
      this.ProblemState = (String) __fieldVal;
      return true;
    }
    else    if ("ProblemZipCode".equals(__fieldName)) {
      this.ProblemZipCode = (String) __fieldVal;
      return true;
    }
    else    if ("ProblemPlanetAbbrv".equals(__fieldName)) {
      this.ProblemPlanetAbbrv = (String) __fieldVal;
      return true;
    }
    else    if ("ProblemEmail".equals(__fieldName)) {
      this.ProblemEmail = (String) __fieldVal;
      return true;
    }
    else    if ("StartDate".equals(__fieldName)) {
      this.StartDate = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("NoDeliveriesFlag".equals(__fieldName)) {
      this.NoDeliveriesFlag = (Boolean) __fieldVal;
      return true;
    }
    else    if ("NumberOfEmployees".equals(__fieldName)) {
      this.NumberOfEmployees = (Integer) __fieldVal;
      return true;
    }
    else    if ("AnnualRevenue".equals(__fieldName)) {
      this.AnnualRevenue = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AccountRepEmployeeNumber".equals(__fieldName)) {
      this.AccountRepEmployeeNumber = (Integer) __fieldVal;
      return true;
    }
    else    if ("Comments".equals(__fieldName)) {
      this.Comments = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
