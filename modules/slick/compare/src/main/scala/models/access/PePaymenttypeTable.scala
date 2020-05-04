package models.access
// AUTO-GENERATED Slick data model for table PePaymenttype
trait PePaymenttypeTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PePaymenttype
    *  @param typeid Database column TypeID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param typename Database column TypeName SqlType(VARCHAR), Length(50,true)
    *  @param intro Database column Intro SqlType(VARCHAR), Length(50,true)
    *  @param discount Database column Discount SqlType(DOUBLE), Default(Some(0.0))
    *  @param isdefault Database column IsDefault SqlType(BOOLEAN)
    *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0))
    *  @param isdisabled Database column IsDisabled SqlType(BOOLEAN) */
  case class PePaymenttypeRow(
    typeid: Int = 0,
    typename: Option[String],
    intro: Option[String],
    discount: Option[Double] = Some(0.0),
    isdefault: Option[Boolean],
    orderid: Option[Int] = Some(0),
    isdisabled: Option[Boolean]
  )

  /** GetResult implicit for fetching PePaymenttypeRow objects using plain SQL queries */
  /** Table description of table PE_PaymentType. Objects of this class serve as prototypes for rows in queries. */
  class PePaymenttype(_tableTag: Tag) extends profile.api.Table[PePaymenttypeRow](_tableTag, "PE_PaymentType") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column TypeID SqlType(INTEGER), PrimaryKey, Default(0) */
    val typeid: Rep[Int] = column[Int]("TypeID", O.PrimaryKey, O.Default(0))

    /** Database column TypeName SqlType(VARCHAR), Length(50,true) */
    val typename: Rep[Option[String]] = column[Option[String]]("TypeName", O.Length(50, varying = true))

    /** Database column Intro SqlType(VARCHAR), Length(50,true) */
    val intro: Rep[Option[String]] = column[Option[String]]("Intro", O.Length(50, varying = true))

    /** Database column Discount SqlType(DOUBLE), Default(Some(0.0)) */
    val discount: Rep[Option[Double]] = column[Option[Double]]("Discount", O.Default(Some(0.0)))

    /** Database column IsDefault SqlType(BOOLEAN) */
    val isdefault: Rep[Option[Boolean]] = column[Option[Boolean]]("IsDefault")

    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))

    /** Database column IsDisabled SqlType(BOOLEAN) */
    val isdisabled: Rep[Option[Boolean]] = column[Option[Boolean]]("IsDisabled")

    /** Index over (orderid) (database name PE_PAYMENTTYPE_ORDERID) */
    val index1 = index("PE_PAYMENTTYPE_ORDERID", orderid)
  }

  /** Collection-like TableQuery object for table PePaymenttype */
  lazy val PePaymenttype = new TableQuery(tag => new PePaymenttype(tag))
}
