package models.access
// AUTO-GENERATED Slick data model for table PeWorkplace
trait PeWorkplaceTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeWorkplace
    *  @param workplaceid Database column WorkPlaceID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param workplacename Database column WorkPlaceName SqlType(VARCHAR), Length(50,true)
    *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0)) */
  case class PeWorkplaceRow(workplaceid: Int = 0, workplacename: Option[String], orderid: Option[Int] = Some(0))

  /** GetResult implicit for fetching PeWorkplaceRow objects using plain SQL queries */
  /** Table description of table PE_WorkPlace. Objects of this class serve as prototypes for rows in queries. */
  class PeWorkplace(_tableTag: Tag) extends profile.api.Table[PeWorkplaceRow](_tableTag, "PE_WorkPlace") {
    def * = (workplaceid :: workplacename :: orderid :: HNil).mapTo[PeWorkplaceRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column WorkPlaceID SqlType(INTEGER), PrimaryKey, Default(0) */
    val workplaceid: Rep[Int] = column[Int]("WorkPlaceID", O.PrimaryKey, O.Default(0))

    /** Database column WorkPlaceName SqlType(VARCHAR), Length(50,true) */
    val workplacename: Rep[Option[String]] = column[Option[String]]("WorkPlaceName", O.Length(50, varying = true))

    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))

    /** Index over (orderid) (database name PE_WORKPLACE_ORDERID) */
    val index1 = index("PE_WORKPLACE_ORDERID", orderid :: HNil)
  }

  /** Collection-like TableQuery object for table PeWorkplace */
  lazy val PeWorkplace = new TableQuery(tag => new PeWorkplace(tag))
}
