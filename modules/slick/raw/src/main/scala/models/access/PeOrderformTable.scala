package models.access
// AUTO-GENERATED Slick data model for table PeOrderform
trait PeOrderformTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeOrderform
    *  @param orderformid Database column OrderFormID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param orderformnum Database column OrderFormNum SqlType(VARCHAR), Length(20,true)
    *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
    *  @param agentname Database column AgentName SqlType(VARCHAR), Length(50,true)
    *  @param clientid Database column ClientID SqlType(INTEGER), Default(Some(0))
    *  @param moneytotal Database column MoneyTotal SqlType(DECIMAL), Default(Some(0))
    *  @param moneygoods Database column MoneyGoods SqlType(DECIMAL), Default(Some(0))
    *  @param needinvoice Database column NeedInvoice SqlType(BOOLEAN)
    *  @param invoicecontent Database column InvoiceContent SqlType(VARCHAR), Length(16777216,true)
    *  @param invoiced Database column Invoiced SqlType(BOOLEAN)
    *  @param remark Database column Remark SqlType(VARCHAR), Length(16777216,true)
    *  @param moneyreceipt Database column MoneyReceipt SqlType(DECIMAL), Default(Some(0))
    *  @param begindate Database column BeginDate SqlType(TIMESTAMP)
    *  @param inputtime Database column InputTime SqlType(TIMESTAMP)
    *  @param contactername Database column ContacterName SqlType(VARCHAR), Length(50,true)
    *  @param address Database column Address SqlType(VARCHAR), Length(255,true)
    *  @param zipcode Database column ZipCode SqlType(VARCHAR), Length(10,true)
    *  @param mobile Database column Mobile SqlType(VARCHAR), Length(50,true)
    *  @param phone Database column Phone SqlType(VARCHAR), Length(50,true)
    *  @param email Database column Email SqlType(VARCHAR), Length(50,true)
    *  @param paymenttype Database column PaymentType SqlType(INTEGER), Default(Some(0))
    *  @param delivertype Database column DeliverType SqlType(INTEGER), Default(Some(0))
    *  @param status Database column Status SqlType(INTEGER), Default(Some(0))
    *  @param deliverstatus Database column DeliverStatus SqlType(INTEGER), Default(Some(0))
    *  @param enabledownload Database column EnableDownload SqlType(BOOLEAN)
    *  @param presentmoney Database column PresentMoney SqlType(DECIMAL), Default(Some(0))
    *  @param presentpoint Database column PresentPoint SqlType(INTEGER), Default(Some(0))
    *  @param presentexp Database column PresentExp SqlType(INTEGER), Default(Some(0))
    *  @param discountPayment Database column Discount_Payment SqlType(DOUBLE), Default(Some(0.0))
    *  @param chargeDeliver Database column Charge_Deliver SqlType(DECIMAL), Default(Some(0)) */
  case class PeOrderformRow(
    orderformid: Int = 0,
    orderformnum: Option[String],
    username: Option[String],
    agentname: Option[String],
    clientid: Option[Int] = Some(0),
    moneytotal: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    moneygoods: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    needinvoice: Option[Boolean],
    invoicecontent: Option[String],
    invoiced: Option[Boolean],
    remark: Option[String],
    moneyreceipt: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    begindate: Option[java.sql.Timestamp],
    inputtime: Option[java.sql.Timestamp],
    contactername: Option[String],
    address: Option[String],
    zipcode: Option[String],
    mobile: Option[String],
    phone: Option[String],
    email: Option[String],
    paymenttype: Option[Int] = Some(0),
    delivertype: Option[Int] = Some(0),
    status: Option[Int] = Some(0),
    deliverstatus: Option[Int] = Some(0),
    enabledownload: Option[Boolean],
    presentmoney: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    presentpoint: Option[Int] = Some(0),
    presentexp: Option[Int] = Some(0),
    discountPayment: Option[Double] = Some(0.0),
    chargeDeliver: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0"))
  )

  /** GetResult implicit for fetching PeOrderformRow objects using plain SQL queries */
  /** Table description of table PE_OrderForm. Objects of this class serve as prototypes for rows in queries. */
  class PeOrderform(_tableTag: Tag) extends profile.api.Table[PeOrderformRow](_tableTag, "PE_OrderForm") {
    def * =
      (orderformid :: orderformnum :: username :: agentname :: clientid :: moneytotal :: moneygoods :: needinvoice :: invoicecontent :: invoiced :: remark :: moneyreceipt :: begindate :: inputtime :: contactername :: address :: zipcode :: mobile :: phone :: email :: paymenttype :: delivertype :: status :: deliverstatus :: enabledownload :: presentmoney :: presentpoint :: presentexp :: discountPayment :: chargeDeliver :: HNil)
        .mapTo[PeOrderformRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column OrderFormID SqlType(INTEGER), PrimaryKey, Default(0) */
    val orderformid: Rep[Int] = column[Int]("OrderFormID", O.PrimaryKey, O.Default(0))

    /** Database column OrderFormNum SqlType(VARCHAR), Length(20,true) */
    val orderformnum: Rep[Option[String]] = column[Option[String]]("OrderFormNum", O.Length(20, varying = true))

    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(50, varying = true))

    /** Database column AgentName SqlType(VARCHAR), Length(50,true) */
    val agentname: Rep[Option[String]] = column[Option[String]]("AgentName", O.Length(50, varying = true))

    /** Database column ClientID SqlType(INTEGER), Default(Some(0)) */
    val clientid: Rep[Option[Int]] = column[Option[Int]]("ClientID", O.Default(Some(0)))

    /** Database column MoneyTotal SqlType(DECIMAL), Default(Some(0)) */
    val moneytotal: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MoneyTotal", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column MoneyGoods SqlType(DECIMAL), Default(Some(0)) */
    val moneygoods: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MoneyGoods", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column NeedInvoice SqlType(BOOLEAN) */
    val needinvoice: Rep[Option[Boolean]] = column[Option[Boolean]]("NeedInvoice")

    /** Database column InvoiceContent SqlType(VARCHAR), Length(16777216,true) */
    val invoicecontent: Rep[Option[String]] = column[Option[String]]("InvoiceContent", O.Length(16777216, varying = true))

    /** Database column Invoiced SqlType(BOOLEAN) */
    val invoiced: Rep[Option[Boolean]] = column[Option[Boolean]]("Invoiced")

    /** Database column Remark SqlType(VARCHAR), Length(16777216,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(16777216, varying = true))

    /** Database column MoneyReceipt SqlType(DECIMAL), Default(Some(0)) */
    val moneyreceipt: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MoneyReceipt", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column BeginDate SqlType(TIMESTAMP) */
    val begindate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("BeginDate")

    /** Database column InputTime SqlType(TIMESTAMP) */
    val inputtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("InputTime")

    /** Database column ContacterName SqlType(VARCHAR), Length(50,true) */
    val contactername: Rep[Option[String]] = column[Option[String]]("ContacterName", O.Length(50, varying = true))

    /** Database column Address SqlType(VARCHAR), Length(255,true) */
    val address: Rep[Option[String]] = column[Option[String]]("Address", O.Length(255, varying = true))

    /** Database column ZipCode SqlType(VARCHAR), Length(10,true) */
    val zipcode: Rep[Option[String]] = column[Option[String]]("ZipCode", O.Length(10, varying = true))

    /** Database column Mobile SqlType(VARCHAR), Length(50,true) */
    val mobile: Rep[Option[String]] = column[Option[String]]("Mobile", O.Length(50, varying = true))

    /** Database column Phone SqlType(VARCHAR), Length(50,true) */
    val phone: Rep[Option[String]] = column[Option[String]]("Phone", O.Length(50, varying = true))

    /** Database column Email SqlType(VARCHAR), Length(50,true) */
    val email: Rep[Option[String]] = column[Option[String]]("Email", O.Length(50, varying = true))

    /** Database column PaymentType SqlType(INTEGER), Default(Some(0)) */
    val paymenttype: Rep[Option[Int]] = column[Option[Int]]("PaymentType", O.Default(Some(0)))

    /** Database column DeliverType SqlType(INTEGER), Default(Some(0)) */
    val delivertype: Rep[Option[Int]] = column[Option[Int]]("DeliverType", O.Default(Some(0)))

    /** Database column Status SqlType(INTEGER), Default(Some(0)) */
    val status: Rep[Option[Int]] = column[Option[Int]]("Status", O.Default(Some(0)))

    /** Database column DeliverStatus SqlType(INTEGER), Default(Some(0)) */
    val deliverstatus: Rep[Option[Int]] = column[Option[Int]]("DeliverStatus", O.Default(Some(0)))

    /** Database column EnableDownload SqlType(BOOLEAN) */
    val enabledownload: Rep[Option[Boolean]] = column[Option[Boolean]]("EnableDownload")

    /** Database column PresentMoney SqlType(DECIMAL), Default(Some(0)) */
    val presentmoney: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PresentMoney", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column PresentPoint SqlType(INTEGER), Default(Some(0)) */
    val presentpoint: Rep[Option[Int]] = column[Option[Int]]("PresentPoint", O.Default(Some(0)))

    /** Database column PresentExp SqlType(INTEGER), Default(Some(0)) */
    val presentexp: Rep[Option[Int]] = column[Option[Int]]("PresentExp", O.Default(Some(0)))

    /** Database column Discount_Payment SqlType(DOUBLE), Default(Some(0.0)) */
    val discountPayment: Rep[Option[Double]] = column[Option[Double]]("Discount_Payment", O.Default(Some(0.0)))

    /** Database column Charge_Deliver SqlType(DECIMAL), Default(Some(0)) */
    val chargeDeliver: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Charge_Deliver", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Index over (clientid) (database name PE_ORDERFORM_CLIENTID) */
    val index1 = index("PE_ORDERFORM_CLIENTID", clientid :: HNil)

    /** Index over (orderformnum) (database name PE_ORDERFORM_ORDERFORMNUM) */
    val index2 = index("PE_ORDERFORM_ORDERFORMNUM", orderformnum :: HNil)

    /** Index over (zipcode) (database name PE_ORDERFORM_POSTCODE) */
    val index3 = index("PE_ORDERFORM_POSTCODE", zipcode :: HNil)

    /** Index over (username) (database name PE_ORDERFORM_USERNAME) */
    val index4 = index("PE_ORDERFORM_USERNAME", username :: HNil)

    /** Index over (agentname) (database name PE_ORDERFORM_USERNAME1) */
    val index5 = index("PE_ORDERFORM_USERNAME1", agentname :: HNil)
  }

  /** Collection-like TableQuery object for table PeOrderform */
  lazy val PeOrderform = new TableQuery(tag => new PeOrderform(tag))
}
