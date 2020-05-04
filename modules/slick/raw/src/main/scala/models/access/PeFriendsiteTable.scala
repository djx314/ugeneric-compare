package models.access
// AUTO-GENERATED Slick data model for table PeFriendsite
trait PeFriendsiteTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeFriendsite
    *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param kindid Database column KindID SqlType(INTEGER), Default(Some(0))
    *  @param specialid Database column SpecialID SqlType(INTEGER), Default(Some(0))
    *  @param linktype Database column LinkType SqlType(INTEGER)
    *  @param sitename Database column SiteName SqlType(VARCHAR), Length(100,true)
    *  @param siteurl Database column SiteUrl SqlType(VARCHAR), Length(255,true)
    *  @param siteintro Database column SiteIntro SqlType(VARCHAR), Length(16777216,true)
    *  @param logourl Database column LogoUrl SqlType(VARCHAR), Length(255,true)
    *  @param siteadmin Database column SiteAdmin SqlType(VARCHAR), Length(50,true)
    *  @param siteemail Database column SiteEmail SqlType(VARCHAR), Length(100,true)
    *  @param sitepassword Database column SitePassword SqlType(VARCHAR), Length(50,true)
    *  @param stars Database column Stars SqlType(INTEGER)
    *  @param hits Database column Hits SqlType(INTEGER)
    *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP)
    *  @param elite Database column Elite SqlType(BOOLEAN)
    *  @param passed Database column Passed SqlType(BOOLEAN)
    *  @param orderid Database column OrderID SqlType(INTEGER), Default(0) */
  case class PeFriendsiteRow(
    id: Int,
    kindid: Option[Int] = Some(0),
    specialid: Option[Int] = Some(0),
    linktype: Option[Int],
    sitename: Option[String],
    siteurl: Option[String],
    siteintro: Option[String],
    logourl: Option[String],
    siteadmin: Option[String],
    siteemail: Option[String],
    sitepassword: Option[String],
    stars: Option[Int],
    hits: Option[Int],
    updatetime: Option[java.sql.Timestamp],
    elite: Boolean,
    passed: Boolean,
    orderid: Int = 0
  )

  /** GetResult implicit for fetching PeFriendsiteRow objects using plain SQL queries */
  /** Table description of table PE_FriendSite. Objects of this class serve as prototypes for rows in queries. */
  class PeFriendsite(_tableTag: Tag) extends profile.api.Table[PeFriendsiteRow](_tableTag, "PE_FriendSite") {
    def * =
      (id :: kindid :: specialid :: linktype :: sitename :: siteurl :: siteintro :: logourl :: siteadmin :: siteemail :: sitepassword :: stars :: hits :: updatetime :: elite :: passed :: orderid :: HNil)
        .mapTo[PeFriendsiteRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)

    /** Database column KindID SqlType(INTEGER), Default(Some(0)) */
    val kindid: Rep[Option[Int]] = column[Option[Int]]("KindID", O.Default(Some(0)))

    /** Database column SpecialID SqlType(INTEGER), Default(Some(0)) */
    val specialid: Rep[Option[Int]] = column[Option[Int]]("SpecialID", O.Default(Some(0)))

    /** Database column LinkType SqlType(INTEGER) */
    val linktype: Rep[Option[Int]] = column[Option[Int]]("LinkType")

    /** Database column SiteName SqlType(VARCHAR), Length(100,true) */
    val sitename: Rep[Option[String]] = column[Option[String]]("SiteName", O.Length(100, varying = true))

    /** Database column SiteUrl SqlType(VARCHAR), Length(255,true) */
    val siteurl: Rep[Option[String]] = column[Option[String]]("SiteUrl", O.Length(255, varying = true))

    /** Database column SiteIntro SqlType(VARCHAR), Length(16777216,true) */
    val siteintro: Rep[Option[String]] = column[Option[String]]("SiteIntro", O.Length(16777216, varying = true))

    /** Database column LogoUrl SqlType(VARCHAR), Length(255,true) */
    val logourl: Rep[Option[String]] = column[Option[String]]("LogoUrl", O.Length(255, varying = true))

    /** Database column SiteAdmin SqlType(VARCHAR), Length(50,true) */
    val siteadmin: Rep[Option[String]] = column[Option[String]]("SiteAdmin", O.Length(50, varying = true))

    /** Database column SiteEmail SqlType(VARCHAR), Length(100,true) */
    val siteemail: Rep[Option[String]] = column[Option[String]]("SiteEmail", O.Length(100, varying = true))

    /** Database column SitePassword SqlType(VARCHAR), Length(50,true) */
    val sitepassword: Rep[Option[String]] = column[Option[String]]("SitePassword", O.Length(50, varying = true))

    /** Database column Stars SqlType(INTEGER) */
    val stars: Rep[Option[Int]] = column[Option[Int]]("Stars")

    /** Database column Hits SqlType(INTEGER) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits")

    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UpdateTime")

    /** Database column Elite SqlType(BOOLEAN) */
    val elite: Rep[Boolean] = column[Boolean]("Elite")

    /** Database column Passed SqlType(BOOLEAN) */
    val passed: Rep[Boolean] = column[Boolean]("Passed")

    /** Database column OrderID SqlType(INTEGER), Default(0) */
    val orderid: Rep[Int] = column[Int]("OrderID", O.Default(0))

    /** Index over (hits) (database name PE_FRIENDSITE_HITS) */
    val index1 = index("PE_FRIENDSITE_HITS", hits :: HNil)

    /** Index over (elite) (database name PE_FRIENDSITE_ISGOOD) */
    val index2 = index("PE_FRIENDSITE_ISGOOD", elite :: HNil)

    /** Index over (passed) (database name PE_FRIENDSITE_ISOK) */
    val index3 = index("PE_FRIENDSITE_ISOK", passed :: HNil)

    /** Index over (kindid) (database name PE_FRIENDSITE_KINDID) */
    val index4 = index("PE_FRIENDSITE_KINDID", kindid :: HNil)

    /** Index over (orderid) (database name PE_FRIENDSITE_ORDERID) */
    val index5 = index("PE_FRIENDSITE_ORDERID", orderid :: HNil)

    /** Index over (specialid) (database name PE_FRIENDSITE_SPECIALID) */
    val index6 = index("PE_FRIENDSITE_SPECIALID", specialid :: HNil)

    /** Index over (updatetime) (database name PE_FRIENDSITE_UPDATETIME) */
    val index7 = index("PE_FRIENDSITE_UPDATETIME", updatetime :: HNil)
  }

  /** Collection-like TableQuery object for table PeFriendsite */
  lazy val PeFriendsite = new TableQuery(tag => new PeFriendsite(tag))
}
