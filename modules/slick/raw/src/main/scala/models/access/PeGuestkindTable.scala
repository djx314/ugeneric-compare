package models.access
// AUTO-GENERATED Slick data model for table PeGuestkind
trait PeGuestkindTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeGuestkind
   *  @param kindid Database column KindID SqlType(INTEGER), PrimaryKey
   *  @param kindname Database column KindName SqlType(VARCHAR), Length(50,true)
   *  @param readme Database column ReadMe SqlType(VARCHAR), Length(255,true)
   *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0)) */
  case class PeGuestkindRow(kindid: Int, kindname: String, readme: Option[String], orderid: Option[Int] = Some(0))
  /** GetResult implicit for fetching PeGuestkindRow objects using plain SQL queries */

  /** Table description of table PE_GuestKind. Objects of this class serve as prototypes for rows in queries. */
  class PeGuestkind(_tableTag: Tag) extends profile.api.Table[PeGuestkindRow](_tableTag, "PE_GuestKind") {
    def * = (kindid :: kindname :: readme :: orderid :: HNil).mapTo[PeGuestkindRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column KindID SqlType(INTEGER), PrimaryKey */
    val kindid: Rep[Int] = column[Int]("KindID", O.PrimaryKey)
    /** Database column KindName SqlType(VARCHAR), Length(50,true) */
    val kindname: Rep[String] = column[String]("KindName", O.Length(50,varying=true))
    /** Database column ReadMe SqlType(VARCHAR), Length(255,true) */
    val readme: Rep[Option[String]] = column[Option[String]]("ReadMe", O.Length(255,varying=true))
    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))

    /** Index over (orderid) (database name PE_GUESTKIND_ORDERID) */
    val index1 = index("PE_GUESTKIND_ORDERID", orderid :: HNil)
  }
  /** Collection-like TableQuery object for table PeGuestkind */
  lazy val PeGuestkind = new TableQuery(tag => new PeGuestkind(tag))
}
