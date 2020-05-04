package models.access
// AUTO-GENERATED Slick data model for table PePayment
trait PePaymentTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PePayment
    *  @param paymentid Database column PaymentID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param username Database column UserName SqlType(VARCHAR), Length(20,true)
    *  @param orderformid Database column OrderFormID SqlType(INTEGER), Default(Some(0))
    *  @param paymentnum Database column PaymentNum SqlType(VARCHAR), Length(50,true)
    *  @param ebankid Database column eBankID SqlType(INTEGER), Default(Some(0))
    *  @param moneypay Database column MoneyPay SqlType(DECIMAL), Default(Some(0))
    *  @param moneytrue Database column MoneyTrue SqlType(DECIMAL), Default(Some(0))
    *  @param paytime Database column PayTime SqlType(TIMESTAMP)
    *  @param status Database column Status SqlType(INTEGER), Default(Some(0))
    *  @param ebankinfo Database column eBankInfo SqlType(VARCHAR), Length(200,true)
    *  @param remark Database column Remark SqlType(VARCHAR), Length(255,true) */
  case class PePaymentRow(
    paymentid: Int = 0,
    username: Option[String],
    orderformid: Option[Int] = Some(0),
    paymentnum: Option[String],
    ebankid: Option[Int] = Some(0),
    moneypay: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    moneytrue: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    paytime: Option[java.sql.Timestamp],
    status: Option[Int] = Some(0),
    ebankinfo: Option[String],
    remark: Option[String]
  )

  /** GetResult implicit for fetching PePaymentRow objects using plain SQL queries */
  /** Table description of table PE_Payment. Objects of this class serve as prototypes for rows in queries. */
  class PePayment(_tableTag: Tag) extends profile.api.Table[PePaymentRow](_tableTag, "PE_Payment") {
    def * =
      (paymentid :: username :: orderformid :: paymentnum :: ebankid :: moneypay :: moneytrue :: paytime :: status :: ebankinfo :: remark :: HNil).mapTo[PePaymentRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column PaymentID SqlType(INTEGER), PrimaryKey, Default(0) */
    val paymentid: Rep[Int] = column[Int]("PaymentID", O.PrimaryKey, O.Default(0))

    /** Database column UserName SqlType(VARCHAR), Length(20,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(20, varying = true))

    /** Database column OrderFormID SqlType(INTEGER), Default(Some(0)) */
    val orderformid: Rep[Option[Int]] = column[Option[Int]]("OrderFormID", O.Default(Some(0)))

    /** Database column PaymentNum SqlType(VARCHAR), Length(50,true) */
    val paymentnum: Rep[Option[String]] = column[Option[String]]("PaymentNum", O.Length(50, varying = true))

    /** Database column eBankID SqlType(INTEGER), Default(Some(0)) */
    val ebankid: Rep[Option[Int]] = column[Option[Int]]("eBankID", O.Default(Some(0)))

    /** Database column MoneyPay SqlType(DECIMAL), Default(Some(0)) */
    val moneypay: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MoneyPay", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column MoneyTrue SqlType(DECIMAL), Default(Some(0)) */
    val moneytrue: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MoneyTrue", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column PayTime SqlType(TIMESTAMP) */
    val paytime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PayTime")

    /** Database column Status SqlType(INTEGER), Default(Some(0)) */
    val status: Rep[Option[Int]] = column[Option[Int]]("Status", O.Default(Some(0)))

    /** Database column eBankInfo SqlType(VARCHAR), Length(200,true) */
    val ebankinfo: Rep[Option[String]] = column[Option[String]]("eBankInfo", O.Length(200, varying = true))

    /** Database column Remark SqlType(VARCHAR), Length(255,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(255, varying = true))

    /** Index over (ebankid) (database name PE_PAYMENT_EBANKID) */
    val index1 = index("PE_PAYMENT_EBANKID", ebankid :: HNil)

    /** Index over (moneypay) (database name PE_PAYMENT_MONEYPAY) */
    val index2 = index("PE_PAYMENT_MONEYPAY", moneypay :: HNil)

    /** Index over (orderformid) (database name PE_PAYMENT_ORDERFORMID) */
    val index3 = index("PE_PAYMENT_ORDERFORMID", orderformid :: HNil)

    /** Index over (paymentnum) (database name PE_PAYMENT_PAYMENTNUM) */
    val index4 = index("PE_PAYMENT_PAYMENTNUM", paymentnum :: HNil)

    /** Index over (username) (database name PE_PAYMENT_USERNAME) */
    val index5 = index("PE_PAYMENT_USERNAME", username :: HNil)
  }

  /** Collection-like TableQuery object for table PePayment */
  lazy val PePayment = new TableQuery(tag => new PePayment(tag))
}
