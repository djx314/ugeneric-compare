package models.access
// AUTO-GENERATED Slick data model for table PeTransferitem
trait PeTransferitemTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeTransferitem
   *  @param itemid Database column ItemID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param orderformid Database column OrderFormID SqlType(INTEGER), Default(Some(0))
   *  @param ownerusername Database column OwnerUserName SqlType(VARCHAR), Length(20,true)
   *  @param targetusername Database column TargetUserName SqlType(VARCHAR), Length(20,true)
   *  @param poundage Database column Poundage SqlType(DECIMAL), Default(Some(0))
   *  @param payerusername Database column PayerUserName SqlType(VARCHAR), Length(20,true)
   *  @param remark Database column Remark SqlType(VARCHAR), Length(50,true)
   *  @param dateandtime Database column DateAndTime SqlType(TIMESTAMP)
   *  @param inputer Database column Inputer SqlType(VARCHAR), Length(20,true) */
  case class PeTransferitemRow(itemid: Int, orderformid: Option[Int] = Some(0), ownerusername: Option[String], targetusername: Option[String], poundage: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), payerusername: Option[String], remark: Option[String], dateandtime: Option[java.sql.Timestamp], inputer: Option[String])
  /** GetResult implicit for fetching PeTransferitemRow objects using plain SQL queries */

  /** Table description of table PE_TransferItem. Objects of this class serve as prototypes for rows in queries. */
  class PeTransferitem(_tableTag: Tag) extends profile.api.Table[PeTransferitemRow](_tableTag, "PE_TransferItem") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ItemID SqlType(INTEGER), AutoInc, PrimaryKey */
    val itemid: Rep[Int] = column[Int]("ItemID", O.AutoInc, O.PrimaryKey)
    /** Database column OrderFormID SqlType(INTEGER), Default(Some(0)) */
    val orderformid: Rep[Option[Int]] = column[Option[Int]]("OrderFormID", O.Default(Some(0)))
    /** Database column OwnerUserName SqlType(VARCHAR), Length(20,true) */
    val ownerusername: Rep[Option[String]] = column[Option[String]]("OwnerUserName", O.Length(20,varying=true))
    /** Database column TargetUserName SqlType(VARCHAR), Length(20,true) */
    val targetusername: Rep[Option[String]] = column[Option[String]]("TargetUserName", O.Length(20,varying=true))
    /** Database column Poundage SqlType(DECIMAL), Default(Some(0)) */
    val poundage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Poundage", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column PayerUserName SqlType(VARCHAR), Length(20,true) */
    val payerusername: Rep[Option[String]] = column[Option[String]]("PayerUserName", O.Length(20,varying=true))
    /** Database column Remark SqlType(VARCHAR), Length(50,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(50,varying=true))
    /** Database column DateAndTime SqlType(TIMESTAMP) */
    val dateandtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("DateAndTime")
    /** Database column Inputer SqlType(VARCHAR), Length(20,true) */
    val inputer: Rep[Option[String]] = column[Option[String]]("Inputer", O.Length(20,varying=true))

    /** Index over (orderformid) (database name PE_TRANSFERITEM_ORDERFORMID) */
    val index1 = index("PE_TRANSFERITEM_ORDERFORMID", orderformid)
  }
  /** Collection-like TableQuery object for table PeTransferitem */
  lazy val PeTransferitem = new TableQuery(tag => new PeTransferitem(tag))
}
