package models.access
// AUTO-GENERATED Slick data model for table PePage
trait PePageTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PePage
    *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param classname Database column ClassName SqlType(VARCHAR), Length(50,true)
    *  @param pagename Database column PageName SqlType(VARCHAR), Length(160,true)
    *  @param pageintro Database column PageIntro SqlType(VARCHAR), Length(255,true)
    *  @param pageurl Database column PageUrl SqlType(VARCHAR), Length(100,true)
    *  @param pagefilename Database column PageFileName SqlType(VARCHAR), Length(40,true)
    *  @param pagetype Database column PageType SqlType(SMALLINT), Default(Some(0))
    *  @param pagecontent Database column PageContent SqlType(VARCHAR), Length(16777216,true)
    *  @param arrgroupid Database column arrGroupID SqlType(VARCHAR), Length(255,true) */
  case class PePageRow(
    id: Int,
    classname: Option[String],
    pagename: String,
    pageintro: String,
    pageurl: Option[String],
    pagefilename: Option[String],
    pagetype: Option[Short] = Some(0),
    pagecontent: Option[String],
    arrgroupid: Option[String]
  )

  /** GetResult implicit for fetching PePageRow objects using plain SQL queries */
  /** Table description of table PE_Page. Objects of this class serve as prototypes for rows in queries. */
  class PePage(_tableTag: Tag) extends profile.api.Table[PePageRow](_tableTag, "PE_Page") {
    def * = (id :: classname :: pagename :: pageintro :: pageurl :: pagefilename :: pagetype :: pagecontent :: arrgroupid :: HNil).mapTo[PePageRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)

    /** Database column ClassName SqlType(VARCHAR), Length(50,true) */
    val classname: Rep[Option[String]] = column[Option[String]]("ClassName", O.Length(50, varying = true))

    /** Database column PageName SqlType(VARCHAR), Length(160,true) */
    val pagename: Rep[String] = column[String]("PageName", O.Length(160, varying = true))

    /** Database column PageIntro SqlType(VARCHAR), Length(255,true) */
    val pageintro: Rep[String] = column[String]("PageIntro", O.Length(255, varying = true))

    /** Database column PageUrl SqlType(VARCHAR), Length(100,true) */
    val pageurl: Rep[Option[String]] = column[Option[String]]("PageUrl", O.Length(100, varying = true))

    /** Database column PageFileName SqlType(VARCHAR), Length(40,true) */
    val pagefilename: Rep[Option[String]] = column[Option[String]]("PageFileName", O.Length(40, varying = true))

    /** Database column PageType SqlType(SMALLINT), Default(Some(0)) */
    val pagetype: Rep[Option[Short]] = column[Option[Short]]("PageType", O.Default(Some(0)))

    /** Database column PageContent SqlType(VARCHAR), Length(16777216,true) */
    val pagecontent: Rep[Option[String]] = column[Option[String]]("PageContent", O.Length(16777216, varying = true))

    /** Database column arrGroupID SqlType(VARCHAR), Length(255,true) */
    val arrgroupid: Rep[Option[String]] = column[Option[String]]("arrGroupID", O.Length(255, varying = true))

    /** Index over (arrgroupid) (database name PE_PAGE_ARRGROUPID) */
    val index1 = index("PE_PAGE_ARRGROUPID", arrgroupid :: HNil)

    /** Index over (classname) (database name PE_PAGE_GROUPID) */
    val index2 = index("PE_PAGE_GROUPID", classname :: HNil)
  }

  /** Collection-like TableQuery object for table PePage */
  lazy val PePage = new TableQuery(tag => new PePage(tag))
}
