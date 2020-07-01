package models.access
// AUTO-GENERATED Slick data model for table PeInvoiceitem
trait PeInvoiceitemTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeInvoiceitem
   *  @param invoiceid Database column InvoiceID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param clientid Database column ClientID SqlType(INTEGER), Default(Some(0))
   *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
   *  @param orderformid Database column OrderFormID SqlType(INTEGER), Default(Some(0))
   *  @param invoicetype Database column InvoiceType SqlType(INTEGER), Default(Some(0))
   *  @param invoicenum Database column InvoiceNum SqlType(VARCHAR), Length(50,true)
   *  @param invoicetitle Database column InvoiceTitle SqlType(VARCHAR), Length(50,true)
   *  @param invoicecontent Database column InvoiceContent SqlType(VARCHAR), Length(16777216,true)
   *  @param invoicedate Database column InvoiceDate SqlType(TIMESTAMP)
   *  @param totalmoney Database column TotalMoney SqlType(DECIMAL), Default(Some(0))
   *  @param drawer Database column Drawer SqlType(VARCHAR), Length(50,true)
   *  @param inputer Database column Inputer SqlType(VARCHAR), Length(50,true)
   *  @param inputtime Database column InputTime SqlType(TIMESTAMP) */
  case class PeInvoiceitemRow(invoiceid: Int, clientid: Option[Int] = Some(0), username: Option[String], orderformid: Option[Int] = Some(0), invoicetype: Option[Int] = Some(0), invoicenum: Option[String], invoicetitle: Option[String], invoicecontent: Option[String], invoicedate: Option[java.sql.Timestamp], totalmoney: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), drawer: Option[String], inputer: Option[String], inputtime: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching PeInvoiceitemRow objects using plain SQL queries */

  /** Table description of table PE_InvoiceItem. Objects of this class serve as prototypes for rows in queries. */
  class PeInvoiceitem(_tableTag: Tag) extends profile.api.Table[PeInvoiceitemRow](_tableTag, "PE_InvoiceItem") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column InvoiceID SqlType(INTEGER), AutoInc, PrimaryKey */
    val invoiceid: Rep[Int] = column[Int]("InvoiceID", O.AutoInc, O.PrimaryKey)
    /** Database column ClientID SqlType(INTEGER), Default(Some(0)) */
    val clientid: Rep[Option[Int]] = column[Option[Int]]("ClientID", O.Default(Some(0)))
    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(50,varying=true))
    /** Database column OrderFormID SqlType(INTEGER), Default(Some(0)) */
    val orderformid: Rep[Option[Int]] = column[Option[Int]]("OrderFormID", O.Default(Some(0)))
    /** Database column InvoiceType SqlType(INTEGER), Default(Some(0)) */
    val invoicetype: Rep[Option[Int]] = column[Option[Int]]("InvoiceType", O.Default(Some(0)))
    /** Database column InvoiceNum SqlType(VARCHAR), Length(50,true) */
    val invoicenum: Rep[Option[String]] = column[Option[String]]("InvoiceNum", O.Length(50,varying=true))
    /** Database column InvoiceTitle SqlType(VARCHAR), Length(50,true) */
    val invoicetitle: Rep[Option[String]] = column[Option[String]]("InvoiceTitle", O.Length(50,varying=true))
    /** Database column InvoiceContent SqlType(VARCHAR), Length(16777216,true) */
    val invoicecontent: Rep[Option[String]] = column[Option[String]]("InvoiceContent", O.Length(16777216,varying=true))
    /** Database column InvoiceDate SqlType(TIMESTAMP) */
    val invoicedate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("InvoiceDate")
    /** Database column TotalMoney SqlType(DECIMAL), Default(Some(0)) */
    val totalmoney: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("TotalMoney", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column Drawer SqlType(VARCHAR), Length(50,true) */
    val drawer: Rep[Option[String]] = column[Option[String]]("Drawer", O.Length(50,varying=true))
    /** Database column Inputer SqlType(VARCHAR), Length(50,true) */
    val inputer: Rep[Option[String]] = column[Option[String]]("Inputer", O.Length(50,varying=true))
    /** Database column InputTime SqlType(TIMESTAMP) */
    val inputtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("InputTime")

    /** Index over (clientid) (database name PE_INVOICEITEM_CLIENTID) */
    val index1 = index("PE_INVOICEITEM_CLIENTID", clientid)
    /** Index over (invoicenum) (database name PE_INVOICEITEM_INVOICENUM) */
    val index2 = index("PE_INVOICEITEM_INVOICENUM", invoicenum)
    /** Index over (orderformid) (database name PE_INVOICEITEM_ORDERFORMID) */
    val index3 = index("PE_INVOICEITEM_ORDERFORMID", orderformid)
    /** Index over (username) (database name PE_INVOICEITEM_USERNAME) */
    val index4 = index("PE_INVOICEITEM_USERNAME", username)
  }
  /** Collection-like TableQuery object for table PeInvoiceitem */
  lazy val PeInvoiceitem = new TableQuery(tag => new PeInvoiceitem(tag))
}
