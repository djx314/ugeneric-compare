package models.access
// AUTO-GENERATED Slick data model for table PeAdmin
trait PeAdminTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeAdmin
    *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param adminname Database column AdminName SqlType(VARCHAR), Length(50,true)
    *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
    *  @param password Database column Password SqlType(VARCHAR), Length(50,true)
    *  @param purview Database column Purview SqlType(INTEGER)
    *  @param rolename Database column RoleName SqlType(VARCHAR), Length(50,true)
    *  @param lastloginip Database column LastLoginIP SqlType(VARCHAR), Length(15,true)
    *  @param lastlogintime Database column LastLoginTime SqlType(TIMESTAMP)
    *  @param lastlogouttime Database column LastLogoutTime SqlType(TIMESTAMP)
    *  @param logintimes Database column LoginTimes SqlType(INTEGER), Default(Some(0))
    *  @param rndpassword Database column RndPassword SqlType(VARCHAR), Length(16,true)
    *  @param enablemultilogin Database column EnableMultiLogin SqlType(BOOLEAN)
    *  @param adminpurviewArticle Database column AdminPurview_Article SqlType(INTEGER), Default(Some(0))
    *  @param adminpurviewSoft Database column AdminPurview_Soft SqlType(INTEGER), Default(Some(0))
    *  @param adminpurviewPhoto Database column AdminPurview_Photo SqlType(INTEGER), Default(Some(0))
    *  @param adminpurviewGuestbook Database column AdminPurview_GuestBook SqlType(INTEGER), Default(Some(0))
    *  @param adminpurviewSupply Database column AdminPurview_Supply SqlType(INTEGER)
    *  @param adminpurviewHouse Database column AdminPurview_House SqlType(INTEGER), Default(Some(0))
    *  @param adminpurviewJob Database column AdminPurview_Job SqlType(INTEGER)
    *  @param adminpurviewShop Database column AdminPurview_Shop SqlType(INTEGER), Default(Some(0))
    *  @param adminpurviewOthers Database column AdminPurview_Others SqlType(VARCHAR), Length(16777216,true)
    *  @param arrclassView Database column arrClass_View SqlType(VARCHAR), Length(16777216,true)
    *  @param arrclassInput Database column arrClass_Input SqlType(VARCHAR), Length(16777216,true)
    *  @param arrclassCheck Database column arrClass_Check SqlType(VARCHAR), Length(16777216,true)
    *  @param arrclassManage Database column arrClass_Manage SqlType(VARCHAR), Length(16777216,true)
    *  @param arrclassHouse Database column arrClass_House SqlType(VARCHAR), Length(16777216,true)
    *  @param arrclassGuestbook Database column arrClass_GuestBook SqlType(VARCHAR), Length(16777216,true)
    *  @param countAdd Database column Count_Add SqlType(INTEGER), Default(Some(0))
    *  @param countCheck Database column Count_Check SqlType(INTEGER), Default(Some(0))
    *  @param countReject Database column Count_Reject SqlType(INTEGER), Default(Some(0)) */
  case class PeAdminRow(
    id: Int,
    adminname: Option[String],
    username: String,
    password: String,
    purview: Int,
    rolename: Option[String],
    lastloginip: Option[String],
    lastlogintime: Option[java.sql.Timestamp],
    lastlogouttime: Option[java.sql.Timestamp],
    logintimes: Option[Int] = Some(0),
    rndpassword: Option[String],
    enablemultilogin: Boolean,
    adminpurviewArticle: Option[Int] = Some(0),
    adminpurviewSoft: Option[Int] = Some(0),
    adminpurviewPhoto: Option[Int] = Some(0),
    adminpurviewGuestbook: Option[Int] = Some(0),
    adminpurviewSupply: Option[Int],
    adminpurviewHouse: Option[Int] = Some(0),
    adminpurviewJob: Option[Int],
    adminpurviewShop: Option[Int] = Some(0),
    adminpurviewOthers: Option[String],
    arrclassView: Option[String],
    arrclassInput: Option[String],
    arrclassCheck: Option[String],
    arrclassManage: Option[String],
    arrclassHouse: Option[String],
    arrclassGuestbook: Option[String],
    countAdd: Option[Int] = Some(0),
    countCheck: Option[Int] = Some(0),
    countReject: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeAdminRow objects using plain SQL queries */
  /** Table description of table PE_Admin. Objects of this class serve as prototypes for rows in queries. */
  class PeAdmin(_tableTag: Tag) extends profile.api.Table[PeAdminRow](_tableTag, "PE_Admin") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)

    /** Database column AdminName SqlType(VARCHAR), Length(50,true) */
    val adminname: Rep[Option[String]] = column[Option[String]]("AdminName", O.Length(50, varying = true))

    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[String] = column[String]("UserName", O.Length(50, varying = true))

    /** Database column Password SqlType(VARCHAR), Length(50,true) */
    val password: Rep[String] = column[String]("Password", O.Length(50, varying = true))

    /** Database column Purview SqlType(INTEGER) */
    val purview: Rep[Int] = column[Int]("Purview")

    /** Database column RoleName SqlType(VARCHAR), Length(50,true) */
    val rolename: Rep[Option[String]] = column[Option[String]]("RoleName", O.Length(50, varying = true))

    /** Database column LastLoginIP SqlType(VARCHAR), Length(15,true) */
    val lastloginip: Rep[Option[String]] = column[Option[String]]("LastLoginIP", O.Length(15, varying = true))

    /** Database column LastLoginTime SqlType(TIMESTAMP) */
    val lastlogintime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastLoginTime")

    /** Database column LastLogoutTime SqlType(TIMESTAMP) */
    val lastlogouttime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastLogoutTime")

    /** Database column LoginTimes SqlType(INTEGER), Default(Some(0)) */
    val logintimes: Rep[Option[Int]] = column[Option[Int]]("LoginTimes", O.Default(Some(0)))

    /** Database column RndPassword SqlType(VARCHAR), Length(16,true) */
    val rndpassword: Rep[Option[String]] = column[Option[String]]("RndPassword", O.Length(16, varying = true))

    /** Database column EnableMultiLogin SqlType(BOOLEAN) */
    val enablemultilogin: Rep[Boolean] = column[Boolean]("EnableMultiLogin")

    /** Database column AdminPurview_Article SqlType(INTEGER), Default(Some(0)) */
    val adminpurviewArticle: Rep[Option[Int]] = column[Option[Int]]("AdminPurview_Article", O.Default(Some(0)))

    /** Database column AdminPurview_Soft SqlType(INTEGER), Default(Some(0)) */
    val adminpurviewSoft: Rep[Option[Int]] = column[Option[Int]]("AdminPurview_Soft", O.Default(Some(0)))

    /** Database column AdminPurview_Photo SqlType(INTEGER), Default(Some(0)) */
    val adminpurviewPhoto: Rep[Option[Int]] = column[Option[Int]]("AdminPurview_Photo", O.Default(Some(0)))

    /** Database column AdminPurview_GuestBook SqlType(INTEGER), Default(Some(0)) */
    val adminpurviewGuestbook: Rep[Option[Int]] = column[Option[Int]]("AdminPurview_GuestBook", O.Default(Some(0)))

    /** Database column AdminPurview_Supply SqlType(INTEGER) */
    val adminpurviewSupply: Rep[Option[Int]] = column[Option[Int]]("AdminPurview_Supply")

    /** Database column AdminPurview_House SqlType(INTEGER), Default(Some(0)) */
    val adminpurviewHouse: Rep[Option[Int]] = column[Option[Int]]("AdminPurview_House", O.Default(Some(0)))

    /** Database column AdminPurview_Job SqlType(INTEGER) */
    val adminpurviewJob: Rep[Option[Int]] = column[Option[Int]]("AdminPurview_Job")

    /** Database column AdminPurview_Shop SqlType(INTEGER), Default(Some(0)) */
    val adminpurviewShop: Rep[Option[Int]] = column[Option[Int]]("AdminPurview_Shop", O.Default(Some(0)))

    /** Database column AdminPurview_Others SqlType(VARCHAR), Length(16777216,true) */
    val adminpurviewOthers: Rep[Option[String]] = column[Option[String]]("AdminPurview_Others", O.Length(16777216, varying = true))

    /** Database column arrClass_View SqlType(VARCHAR), Length(16777216,true) */
    val arrclassView: Rep[Option[String]] = column[Option[String]]("arrClass_View", O.Length(16777216, varying = true))

    /** Database column arrClass_Input SqlType(VARCHAR), Length(16777216,true) */
    val arrclassInput: Rep[Option[String]] = column[Option[String]]("arrClass_Input", O.Length(16777216, varying = true))

    /** Database column arrClass_Check SqlType(VARCHAR), Length(16777216,true) */
    val arrclassCheck: Rep[Option[String]] = column[Option[String]]("arrClass_Check", O.Length(16777216, varying = true))

    /** Database column arrClass_Manage SqlType(VARCHAR), Length(16777216,true) */
    val arrclassManage: Rep[Option[String]] = column[Option[String]]("arrClass_Manage", O.Length(16777216, varying = true))

    /** Database column arrClass_House SqlType(VARCHAR), Length(16777216,true) */
    val arrclassHouse: Rep[Option[String]] = column[Option[String]]("arrClass_House", O.Length(16777216, varying = true))

    /** Database column arrClass_GuestBook SqlType(VARCHAR), Length(16777216,true) */
    val arrclassGuestbook: Rep[Option[String]] = column[Option[String]]("arrClass_GuestBook", O.Length(16777216, varying = true))

    /** Database column Count_Add SqlType(INTEGER), Default(Some(0)) */
    val countAdd: Rep[Option[Int]] = column[Option[Int]]("Count_Add", O.Default(Some(0)))

    /** Database column Count_Check SqlType(INTEGER), Default(Some(0)) */
    val countCheck: Rep[Option[Int]] = column[Option[Int]]("Count_Check", O.Default(Some(0)))

    /** Database column Count_Reject SqlType(INTEGER), Default(Some(0)) */
    val countReject: Rep[Option[Int]] = column[Option[Int]]("Count_Reject", O.Default(Some(0)))

    /** Index over (password) (database name PE_ADMIN_PASSWORD) */
    val index1 = index("PE_ADMIN_PASSWORD", password)

    /** Index over (username) (database name PE_ADMIN_USERNAME) */
    val index2 = index("PE_ADMIN_USERNAME", username)
  }

  /** Collection-like TableQuery object for table PeAdmin */
  lazy val PeAdmin = new TableQuery(tag => new PeAdmin(tag))
}
