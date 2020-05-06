package models.access
// AUTO-GENERATED Slick data model for table PeSpacelink
trait PeSpacelinkTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeSpacelink
   *  @param id Database column ID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param userid Database column UserID SqlType(INTEGER), Default(0)
   *  @param blogid Database column BlogID SqlType(INTEGER), Default(Some(0))
   *  @param title Database column Title SqlType(VARCHAR), Length(50,true)
   *  @param content Database column Content SqlType(VARCHAR), Length(16777216,true)
   *  @param datetime Database column Datetime SqlType(TIMESTAMP)
   *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0))
   *  @param plnum Database column PlNum SqlType(INTEGER), Default(Some(0)) */
  case class PeSpacelinkRow(id: Int = 0, userid: Int = 0, blogid: Option[Int] = Some(0), title: String, content: Option[String], datetime: java.sql.Timestamp, hits: Option[Int] = Some(0), plnum: Option[Int] = Some(0))
  /** GetResult implicit for fetching PeSpacelinkRow objects using plain SQL queries */

  /** Table description of table PE_SpaceLink. Objects of this class serve as prototypes for rows in queries. */
  class PeSpacelink(_tableTag: Tag) extends profile.api.Table[PeSpacelinkRow](_tableTag, "PE_SpaceLink") {
    def * = (id :: userid :: blogid :: title :: content :: datetime :: hits :: plnum :: HNil).mapTo[PeSpacelinkRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), PrimaryKey, Default(0) */
    val id: Rep[Int] = column[Int]("ID", O.PrimaryKey, O.Default(0))
    /** Database column UserID SqlType(INTEGER), Default(0) */
    val userid: Rep[Int] = column[Int]("UserID", O.Default(0))
    /** Database column BlogID SqlType(INTEGER), Default(Some(0)) */
    val blogid: Rep[Option[Int]] = column[Option[Int]]("BlogID", O.Default(Some(0)))
    /** Database column Title SqlType(VARCHAR), Length(50,true) */
    val title: Rep[String] = column[String]("Title", O.Length(50,varying=true))
    /** Database column Content SqlType(VARCHAR), Length(16777216,true) */
    val content: Rep[Option[String]] = column[Option[String]]("Content", O.Length(16777216,varying=true))
    /** Database column Datetime SqlType(TIMESTAMP) */
    val datetime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("Datetime")
    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))
    /** Database column PlNum SqlType(INTEGER), Default(Some(0)) */
    val plnum: Rep[Option[Int]] = column[Option[Int]]("PlNum", O.Default(Some(0)))

    /** Index over (plnum) (database name PE_SPACELINK_PLNUM) */
    val index1 = index("PE_SPACELINK_PLNUM", plnum :: HNil)
    /** Index over (userid) (database name PE_SPACELINK_USERID) */
    val index2 = index("PE_SPACELINK_USERID", userid :: HNil)
    /** Index over (blogid) (database name PE_SPACELINK_USERID1) */
    val index3 = index("PE_SPACELINK_USERID1", blogid :: HNil)
  }
  /** Collection-like TableQuery object for table PeSpacelink */
  lazy val PeSpacelink = new TableQuery(tag => new PeSpacelink(tag))
}
