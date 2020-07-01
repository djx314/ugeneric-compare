package models.access
// AUTO-GENERATED Slick data model for table PeBankrollitem
trait PeBankrollitemTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeBankrollitem
   *  @param itemid Database column ItemID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
   *  @param clientid Database column ClientID SqlType(INTEGER), Default(Some(0))
   *  @param dateandtime Database column DateAndTime SqlType(TIMESTAMP)
   *  @param money Database column Money SqlType(DECIMAL), Default(Some(0))
   *  @param moneytype Database column MoneyType SqlType(INTEGER), Default(Some(0))
   *  @param currencytype Database column CurrencyType SqlType(INTEGER), Default(Some(0))
   *  @param ebankid Database column eBankID SqlType(INTEGER), Default(Some(0))
   *  @param bank Database column Bank SqlType(VARCHAR), Length(50,true)
   *  @param incomePayout Database column Income_PayOut SqlType(INTEGER), Default(Some(0))
   *  @param orderformid Database column OrderFormID SqlType(INTEGER), Default(Some(0))
   *  @param paymentid Database column PaymentID SqlType(INTEGER), Default(Some(0))
   *  @param remark Database column Remark SqlType(VARCHAR), Length(255,true)
   *  @param logtime Database column LogTime SqlType(TIMESTAMP)
   *  @param inputer Database column Inputer SqlType(VARCHAR), Length(50,true)
   *  @param ip Database column IP SqlType(VARCHAR), Length(50,true) */
  case class PeBankrollitemRow(itemid: Int, username: Option[String], clientid: Option[Int] = Some(0), dateandtime: Option[java.sql.Timestamp], money: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), moneytype: Option[Int] = Some(0), currencytype: Option[Int] = Some(0), ebankid: Option[Int] = Some(0), bank: Option[String], incomePayout: Option[Int] = Some(0), orderformid: Option[Int] = Some(0), paymentid: Option[Int] = Some(0), remark: Option[String], logtime: Option[java.sql.Timestamp], inputer: Option[String], ip: Option[String])
  /** GetResult implicit for fetching PeBankrollitemRow objects using plain SQL queries */

  /** Table description of table PE_BankrollItem. Objects of this class serve as prototypes for rows in queries. */
  class PeBankrollitem(_tableTag: Tag) extends profile.api.Table[PeBankrollitemRow](_tableTag, "PE_BankrollItem") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ItemID SqlType(INTEGER), AutoInc, PrimaryKey */
    val itemid: Rep[Int] = column[Int]("ItemID", O.AutoInc, O.PrimaryKey)
    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(50,varying=true))
    /** Database column ClientID SqlType(INTEGER), Default(Some(0)) */
    val clientid: Rep[Option[Int]] = column[Option[Int]]("ClientID", O.Default(Some(0)))
    /** Database column DateAndTime SqlType(TIMESTAMP) */
    val dateandtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("DateAndTime")
    /** Database column Money SqlType(DECIMAL), Default(Some(0)) */
    val money: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Money", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column MoneyType SqlType(INTEGER), Default(Some(0)) */
    val moneytype: Rep[Option[Int]] = column[Option[Int]]("MoneyType", O.Default(Some(0)))
    /** Database column CurrencyType SqlType(INTEGER), Default(Some(0)) */
    val currencytype: Rep[Option[Int]] = column[Option[Int]]("CurrencyType", O.Default(Some(0)))
    /** Database column eBankID SqlType(INTEGER), Default(Some(0)) */
    val ebankid: Rep[Option[Int]] = column[Option[Int]]("eBankID", O.Default(Some(0)))
    /** Database column Bank SqlType(VARCHAR), Length(50,true) */
    val bank: Rep[Option[String]] = column[Option[String]]("Bank", O.Length(50,varying=true))
    /** Database column Income_PayOut SqlType(INTEGER), Default(Some(0)) */
    val incomePayout: Rep[Option[Int]] = column[Option[Int]]("Income_PayOut", O.Default(Some(0)))
    /** Database column OrderFormID SqlType(INTEGER), Default(Some(0)) */
    val orderformid: Rep[Option[Int]] = column[Option[Int]]("OrderFormID", O.Default(Some(0)))
    /** Database column PaymentID SqlType(INTEGER), Default(Some(0)) */
    val paymentid: Rep[Option[Int]] = column[Option[Int]]("PaymentID", O.Default(Some(0)))
    /** Database column Remark SqlType(VARCHAR), Length(255,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(255,varying=true))
    /** Database column LogTime SqlType(TIMESTAMP) */
    val logtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LogTime")
    /** Database column Inputer SqlType(VARCHAR), Length(50,true) */
    val inputer: Rep[Option[String]] = column[Option[String]]("Inputer", O.Length(50,varying=true))
    /** Database column IP SqlType(VARCHAR), Length(50,true) */
    val ip: Rep[Option[String]] = column[Option[String]]("IP", O.Length(50,varying=true))

    /** Index over (clientid) (database name PE_BANKROLLITEM_CLIENTID) */
    val index1 = index("PE_BANKROLLITEM_CLIENTID", clientid)
    /** Index over (ebankid) (database name PE_BANKROLLITEM_EBANKID) */
    val index2 = index("PE_BANKROLLITEM_EBANKID", ebankid)
    /** Index over (orderformid) (database name PE_BANKROLLITEM_ORDERFORMID) */
    val index3 = index("PE_BANKROLLITEM_ORDERFORMID", orderformid)
    /** Index over (paymentid) (database name PE_BANKROLLITEM_PAYMENTID) */
    val index4 = index("PE_BANKROLLITEM_PAYMENTID", paymentid)
    /** Index over (username) (database name PE_BANKROLLITEM_USERNAME) */
    val index5 = index("PE_BANKROLLITEM_USERNAME", username)
  }
  /** Collection-like TableQuery object for table PeBankrollitem */
  lazy val PeBankrollitem = new TableQuery(tag => new PeBankrollitem(tag))
}
