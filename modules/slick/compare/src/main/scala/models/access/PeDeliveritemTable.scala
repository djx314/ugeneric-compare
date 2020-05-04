package models.access
// AUTO-GENERATED Slick data model for table PeDeliveritem
trait PeDeliveritemTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeDeliveritem
    *  @param deliverid Database column DeliverID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param orderformid Database column OrderFormID SqlType(INTEGER), Default(Some(0))
    *  @param deliverdate Database column DeliverDate SqlType(TIMESTAMP)
    *  @param deliverdirection Database column DeliverDirection SqlType(INTEGER), Default(Some(0))
    *  @param handlername Database column HandlerName SqlType(VARCHAR), Length(20,true)
    *  @param expresscompany Database column ExpressCompany SqlType(VARCHAR), Length(50,true)
    *  @param expressnumber Database column ExpressNumber SqlType(VARCHAR), Length(50,true)
    *  @param inputer Database column Inputer SqlType(VARCHAR), Length(20,true)
    *  @param remark Database column Remark SqlType(VARCHAR), Length(255,true)
    *  @param received Database column Received SqlType(BOOLEAN) */
  case class PeDeliveritemRow(
    deliverid: Int,
    orderformid: Option[Int] = Some(0),
    deliverdate: Option[java.sql.Timestamp],
    deliverdirection: Option[Int] = Some(0),
    handlername: Option[String],
    expresscompany: Option[String],
    expressnumber: Option[String],
    inputer: Option[String],
    remark: Option[String],
    received: Option[Boolean]
  )

  /** GetResult implicit for fetching PeDeliveritemRow objects using plain SQL queries */
  /** Table description of table PE_DeliverItem. Objects of this class serve as prototypes for rows in queries. */
  class PeDeliveritem(_tableTag: Tag) extends profile.api.Table[PeDeliveritemRow](_tableTag, "PE_DeliverItem") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column DeliverID SqlType(INTEGER), AutoInc, PrimaryKey */
    val deliverid: Rep[Int] = column[Int]("DeliverID", O.AutoInc, O.PrimaryKey)

    /** Database column OrderFormID SqlType(INTEGER), Default(Some(0)) */
    val orderformid: Rep[Option[Int]] = column[Option[Int]]("OrderFormID", O.Default(Some(0)))

    /** Database column DeliverDate SqlType(TIMESTAMP) */
    val deliverdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("DeliverDate")

    /** Database column DeliverDirection SqlType(INTEGER), Default(Some(0)) */
    val deliverdirection: Rep[Option[Int]] = column[Option[Int]]("DeliverDirection", O.Default(Some(0)))

    /** Database column HandlerName SqlType(VARCHAR), Length(20,true) */
    val handlername: Rep[Option[String]] = column[Option[String]]("HandlerName", O.Length(20, varying = true))

    /** Database column ExpressCompany SqlType(VARCHAR), Length(50,true) */
    val expresscompany: Rep[Option[String]] = column[Option[String]]("ExpressCompany", O.Length(50, varying = true))

    /** Database column ExpressNumber SqlType(VARCHAR), Length(50,true) */
    val expressnumber: Rep[Option[String]] = column[Option[String]]("ExpressNumber", O.Length(50, varying = true))

    /** Database column Inputer SqlType(VARCHAR), Length(20,true) */
    val inputer: Rep[Option[String]] = column[Option[String]]("Inputer", O.Length(20, varying = true))

    /** Database column Remark SqlType(VARCHAR), Length(255,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(255, varying = true))

    /** Database column Received SqlType(BOOLEAN) */
    val received: Rep[Option[Boolean]] = column[Option[Boolean]]("Received")

    /** Index over (orderformid) (database name PE_DELIVERITEM_ORDERFORMID) */
    val index1 = index("PE_DELIVERITEM_ORDERFORMID", orderformid)
  }

  /** Collection-like TableQuery object for table PeDeliveritem */
  lazy val PeDeliveritem = new TableQuery(tag => new PeDeliveritem(tag))
}
