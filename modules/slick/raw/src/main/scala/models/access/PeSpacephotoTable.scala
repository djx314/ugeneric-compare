package models.access
// AUTO-GENERATED Slick data model for table PeSpacephoto
trait PeSpacephotoTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeSpacephoto
    *  @param id Database column ID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param userid Database column UserID SqlType(INTEGER), Default(0)
    *  @param blogid Database column BlogID SqlType(INTEGER), Default(Some(0))
    *  @param title Database column Title SqlType(VARCHAR), Length(50,true)
    *  @param content Database column Content SqlType(VARCHAR), Length(16777216,true)
    *  @param datetime Database column Datetime SqlType(TIMESTAMP)
    *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0))
    *  @param plnum Database column PlNum SqlType(INTEGER), Default(Some(0)) */
  case class PeSpacephotoRow(
    id: Int = 0,
    userid: Int = 0,
    blogid: Option[Int] = Some(0),
    title: String,
    content: Option[String],
    datetime: java.sql.Timestamp,
    hits: Option[Int] = Some(0),
    plnum: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeSpacephotoRow objects using plain SQL queries */
  /** Table description of table PE_SpacePhoto. Objects of this class serve as prototypes for rows in queries. */
  class PeSpacephoto(_tableTag: Tag) extends profile.api.Table[PeSpacephotoRow](_tableTag, "PE_SpacePhoto") {
    def * = (id :: userid :: blogid :: title :: content :: datetime :: hits :: plnum :: HNil).mapTo[PeSpacephotoRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ID SqlType(INTEGER), PrimaryKey, Default(0) */
    val id: Rep[Int] = column[Int]("ID", O.PrimaryKey, O.Default(0))

    /** Database column UserID SqlType(INTEGER), Default(0) */
    val userid: Rep[Int] = column[Int]("UserID", O.Default(0))

    /** Database column BlogID SqlType(INTEGER), Default(Some(0)) */
    val blogid: Rep[Option[Int]] = column[Option[Int]]("BlogID", O.Default(Some(0)))

    /** Database column Title SqlType(VARCHAR), Length(50,true) */
    val title: Rep[String] = column[String]("Title", O.Length(50, varying = true))

    /** Database column Content SqlType(VARCHAR), Length(16777216,true) */
    val content: Rep[Option[String]] = column[Option[String]]("Content", O.Length(16777216, varying = true))

    /** Database column Datetime SqlType(TIMESTAMP) */
    val datetime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("Datetime")

    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))

    /** Database column PlNum SqlType(INTEGER), Default(Some(0)) */
    val plnum: Rep[Option[Int]] = column[Option[Int]]("PlNum", O.Default(Some(0)))

    /** Index over (plnum) (database name PE_SPACEPHOTO_PLNUM) */
    val index1 = index("PE_SPACEPHOTO_PLNUM", plnum :: HNil)

    /** Index over (userid) (database name PE_SPACEPHOTO_USERID) */
    val index2 = index("PE_SPACEPHOTO_USERID", userid :: HNil)

    /** Index over (blogid) (database name PE_SPACEPHOTO_USERID1) */
    val index3 = index("PE_SPACEPHOTO_USERID1", blogid :: HNil)
  }

  /** Collection-like TableQuery object for table PeSpacephoto */
  lazy val PeSpacephoto = new TableQuery(tag => new PeSpacephoto(tag))
}
