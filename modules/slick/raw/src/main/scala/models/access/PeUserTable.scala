package models.access
// AUTO-GENERATED Slick data model for table PeUser
trait PeUserTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeUser
    *  @param userid Database column UserID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param groupid Database column GroupID SqlType(INTEGER)
    *  @param clientid Database column ClientID SqlType(INTEGER), Default(Some(0))
    *  @param contacterid Database column ContacterID SqlType(INTEGER), Default(Some(0))
    *  @param companyid Database column CompanyID SqlType(INTEGER), Default(Some(0))
    *  @param usertype Database column UserType SqlType(INTEGER), Default(Some(0))
    *  @param username Database column UserName SqlType(VARCHAR), Length(20,true)
    *  @param userpassword Database column UserPassword SqlType(VARCHAR), Length(16,true)
    *  @param lastpassword Database column LastPassword SqlType(VARCHAR), Length(16,true)
    *  @param question Database column Question SqlType(VARCHAR), Length(50,true)
    *  @param answer Database column Answer SqlType(VARCHAR), Length(50,true)
    *  @param email Database column Email SqlType(VARCHAR), Length(100,true)
    *  @param userface Database column UserFace SqlType(VARCHAR), Length(255,true)
    *  @param facewidth Database column FaceWidth SqlType(SMALLINT)
    *  @param faceheight Database column FaceHeight SqlType(SMALLINT)
    *  @param sign Database column Sign SqlType(VARCHAR), Length(16777216,true)
    *  @param regtime Database column RegTime SqlType(TIMESTAMP)
    *  @param jointime Database column JoinTime SqlType(TIMESTAMP)
    *  @param lastlogintime Database column LastLoginTime SqlType(TIMESTAMP)
    *  @param lastpresenttime Database column LastPresentTime SqlType(TIMESTAMP)
    *  @param lastloginip Database column LastLoginIP SqlType(VARCHAR), Length(15,true)
    *  @param balance Database column Balance SqlType(DECIMAL)
    *  @param userpoint Database column UserPoint SqlType(INTEGER)
    *  @param userexp Database column UserExp SqlType(INTEGER)
    *  @param consumepoint Database column ConsumePoint SqlType(INTEGER)
    *  @param postitems Database column PostItems SqlType(INTEGER)
    *  @param passeditems Database column PassedItems SqlType(INTEGER)
    *  @param delitems Database column DelItems SqlType(INTEGER)
    *  @param unsigneditems Database column UnsignedItems SqlType(VARCHAR), Length(16777216,true)
    *  @param unreadmsg Database column UnreadMsg SqlType(SMALLINT)
    *  @param begintime Database column BeginTime SqlType(TIMESTAMP)
    *  @param validnum Database column ValidNum SqlType(SMALLINT)
    *  @param validunit Database column ValidUnit SqlType(SMALLINT)
    *  @param islocked Database column IsLocked SqlType(BOOLEAN)
    *  @param specialpermission Database column SpecialPermission SqlType(BOOLEAN)
    *  @param arrclassBrowse Database column arrClass_Browse SqlType(VARCHAR), Length(16777216,true)
    *  @param arrclassView Database column arrClass_View SqlType(VARCHAR), Length(16777216,true)
    *  @param arrclassInput Database column arrClass_Input SqlType(VARCHAR), Length(16777216,true)
    *  @param privacy Database column Privacy SqlType(SMALLINT)
    *  @param userfriendgroup Database column UserFriendGroup SqlType(VARCHAR), Length(255,true)
    *  @param usersetting Database column UserSetting SqlType(VARCHAR), Length(16777216,true)
    *  @param checknum Database column CheckNum SqlType(INTEGER), Default(Some(0))
    *  @param blog Database column Blog SqlType(BOOLEAN)
    *  @param logintimes Database column LoginTimes SqlType(INTEGER) */
  case class PeUserRow(
    userid: Int = 0,
    groupid: Option[Int],
    clientid: Option[Int] = Some(0),
    contacterid: Option[Int] = Some(0),
    companyid: Option[Int] = Some(0),
    usertype: Option[Int] = Some(0),
    username: Option[String],
    userpassword: Option[String],
    lastpassword: Option[String],
    question: Option[String],
    answer: Option[String],
    email: Option[String],
    userface: Option[String],
    facewidth: Option[Short],
    faceheight: Option[Short],
    sign: Option[String],
    regtime: Option[java.sql.Timestamp],
    jointime: Option[java.sql.Timestamp],
    lastlogintime: Option[java.sql.Timestamp],
    lastpresenttime: Option[java.sql.Timestamp],
    lastloginip: Option[String],
    balance: Option[scala.math.BigDecimal],
    userpoint: Option[Int],
    userexp: Option[Int],
    consumepoint: Option[Int],
    postitems: Option[Int],
    passeditems: Option[Int],
    delitems: Option[Int],
    unsigneditems: Option[String],
    unreadmsg: Option[Short],
    begintime: Option[java.sql.Timestamp],
    validnum: Option[Short],
    validunit: Option[Short],
    islocked: Option[Boolean],
    specialpermission: Option[Boolean],
    arrclassBrowse: Option[String],
    arrclassView: Option[String],
    arrclassInput: Option[String],
    privacy: Option[Short],
    userfriendgroup: Option[String],
    usersetting: Option[String],
    checknum: Option[Int] = Some(0),
    blog: Option[Boolean],
    logintimes: Option[Int]
  )

  /** GetResult implicit for fetching PeUserRow objects using plain SQL queries */
  /** Table description of table PE_User. Objects of this class serve as prototypes for rows in queries. */
  class PeUser(_tableTag: Tag) extends profile.api.Table[PeUserRow](_tableTag, "PE_User") {
    def * =
      (userid :: groupid :: clientid :: contacterid :: companyid :: usertype :: username :: userpassword :: lastpassword :: question :: answer :: email :: userface :: facewidth :: faceheight :: sign :: regtime :: jointime :: lastlogintime :: lastpresenttime :: lastloginip :: balance :: userpoint :: userexp :: consumepoint :: postitems :: passeditems :: delitems :: unsigneditems :: unreadmsg :: begintime :: validnum :: validunit :: islocked :: specialpermission :: arrclassBrowse :: arrclassView :: arrclassInput :: privacy :: userfriendgroup :: usersetting :: checknum :: blog :: logintimes :: HNil)
        .mapTo[PeUserRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column UserID SqlType(INTEGER), PrimaryKey, Default(0) */
    val userid: Rep[Int] = column[Int]("UserID", O.PrimaryKey, O.Default(0))

    /** Database column GroupID SqlType(INTEGER) */
    val groupid: Rep[Option[Int]] = column[Option[Int]]("GroupID")

    /** Database column ClientID SqlType(INTEGER), Default(Some(0)) */
    val clientid: Rep[Option[Int]] = column[Option[Int]]("ClientID", O.Default(Some(0)))

    /** Database column ContacterID SqlType(INTEGER), Default(Some(0)) */
    val contacterid: Rep[Option[Int]] = column[Option[Int]]("ContacterID", O.Default(Some(0)))

    /** Database column CompanyID SqlType(INTEGER), Default(Some(0)) */
    val companyid: Rep[Option[Int]] = column[Option[Int]]("CompanyID", O.Default(Some(0)))

    /** Database column UserType SqlType(INTEGER), Default(Some(0)) */
    val usertype: Rep[Option[Int]] = column[Option[Int]]("UserType", O.Default(Some(0)))

    /** Database column UserName SqlType(VARCHAR), Length(20,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(20, varying = true))

    /** Database column UserPassword SqlType(VARCHAR), Length(16,true) */
    val userpassword: Rep[Option[String]] = column[Option[String]]("UserPassword", O.Length(16, varying = true))

    /** Database column LastPassword SqlType(VARCHAR), Length(16,true) */
    val lastpassword: Rep[Option[String]] = column[Option[String]]("LastPassword", O.Length(16, varying = true))

    /** Database column Question SqlType(VARCHAR), Length(50,true) */
    val question: Rep[Option[String]] = column[Option[String]]("Question", O.Length(50, varying = true))

    /** Database column Answer SqlType(VARCHAR), Length(50,true) */
    val answer: Rep[Option[String]] = column[Option[String]]("Answer", O.Length(50, varying = true))

    /** Database column Email SqlType(VARCHAR), Length(100,true) */
    val email: Rep[Option[String]] = column[Option[String]]("Email", O.Length(100, varying = true))

    /** Database column UserFace SqlType(VARCHAR), Length(255,true) */
    val userface: Rep[Option[String]] = column[Option[String]]("UserFace", O.Length(255, varying = true))

    /** Database column FaceWidth SqlType(SMALLINT) */
    val facewidth: Rep[Option[Short]] = column[Option[Short]]("FaceWidth")

    /** Database column FaceHeight SqlType(SMALLINT) */
    val faceheight: Rep[Option[Short]] = column[Option[Short]]("FaceHeight")

    /** Database column Sign SqlType(VARCHAR), Length(16777216,true) */
    val sign: Rep[Option[String]] = column[Option[String]]("Sign", O.Length(16777216, varying = true))

    /** Database column RegTime SqlType(TIMESTAMP) */
    val regtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("RegTime")

    /** Database column JoinTime SqlType(TIMESTAMP) */
    val jointime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("JoinTime")

    /** Database column LastLoginTime SqlType(TIMESTAMP) */
    val lastlogintime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastLoginTime")

    /** Database column LastPresentTime SqlType(TIMESTAMP) */
    val lastpresenttime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastPresentTime")

    /** Database column LastLoginIP SqlType(VARCHAR), Length(15,true) */
    val lastloginip: Rep[Option[String]] = column[Option[String]]("LastLoginIP", O.Length(15, varying = true))

    /** Database column Balance SqlType(DECIMAL) */
    val balance: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Balance")

    /** Database column UserPoint SqlType(INTEGER) */
    val userpoint: Rep[Option[Int]] = column[Option[Int]]("UserPoint")

    /** Database column UserExp SqlType(INTEGER) */
    val userexp: Rep[Option[Int]] = column[Option[Int]]("UserExp")

    /** Database column ConsumePoint SqlType(INTEGER) */
    val consumepoint: Rep[Option[Int]] = column[Option[Int]]("ConsumePoint")

    /** Database column PostItems SqlType(INTEGER) */
    val postitems: Rep[Option[Int]] = column[Option[Int]]("PostItems")

    /** Database column PassedItems SqlType(INTEGER) */
    val passeditems: Rep[Option[Int]] = column[Option[Int]]("PassedItems")

    /** Database column DelItems SqlType(INTEGER) */
    val delitems: Rep[Option[Int]] = column[Option[Int]]("DelItems")

    /** Database column UnsignedItems SqlType(VARCHAR), Length(16777216,true) */
    val unsigneditems: Rep[Option[String]] = column[Option[String]]("UnsignedItems", O.Length(16777216, varying = true))

    /** Database column UnreadMsg SqlType(SMALLINT) */
    val unreadmsg: Rep[Option[Short]] = column[Option[Short]]("UnreadMsg")

    /** Database column BeginTime SqlType(TIMESTAMP) */
    val begintime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("BeginTime")

    /** Database column ValidNum SqlType(SMALLINT) */
    val validnum: Rep[Option[Short]] = column[Option[Short]]("ValidNum")

    /** Database column ValidUnit SqlType(SMALLINT) */
    val validunit: Rep[Option[Short]] = column[Option[Short]]("ValidUnit")

    /** Database column IsLocked SqlType(BOOLEAN) */
    val islocked: Rep[Option[Boolean]] = column[Option[Boolean]]("IsLocked")

    /** Database column SpecialPermission SqlType(BOOLEAN) */
    val specialpermission: Rep[Option[Boolean]] = column[Option[Boolean]]("SpecialPermission")

    /** Database column arrClass_Browse SqlType(VARCHAR), Length(16777216,true) */
    val arrclassBrowse: Rep[Option[String]] = column[Option[String]]("arrClass_Browse", O.Length(16777216, varying = true))

    /** Database column arrClass_View SqlType(VARCHAR), Length(16777216,true) */
    val arrclassView: Rep[Option[String]] = column[Option[String]]("arrClass_View", O.Length(16777216, varying = true))

    /** Database column arrClass_Input SqlType(VARCHAR), Length(16777216,true) */
    val arrclassInput: Rep[Option[String]] = column[Option[String]]("arrClass_Input", O.Length(16777216, varying = true))

    /** Database column Privacy SqlType(SMALLINT) */
    val privacy: Rep[Option[Short]] = column[Option[Short]]("Privacy")

    /** Database column UserFriendGroup SqlType(VARCHAR), Length(255,true) */
    val userfriendgroup: Rep[Option[String]] = column[Option[String]]("UserFriendGroup", O.Length(255, varying = true))

    /** Database column UserSetting SqlType(VARCHAR), Length(16777216,true) */
    val usersetting: Rep[Option[String]] = column[Option[String]]("UserSetting", O.Length(16777216, varying = true))

    /** Database column CheckNum SqlType(INTEGER), Default(Some(0)) */
    val checknum: Rep[Option[Int]] = column[Option[Int]]("CheckNum", O.Default(Some(0)))

    /** Database column Blog SqlType(BOOLEAN) */
    val blog: Rep[Option[Boolean]] = column[Option[Boolean]]("Blog")

    /** Database column LoginTimes SqlType(INTEGER) */
    val logintimes: Rep[Option[Int]] = column[Option[Int]]("LoginTimes")

    /** Index over (checknum) (database name PE_USER_CHECKNUM) */
    val index1 = index("PE_USER_CHECKNUM", checknum :: HNil)

    /** Index over (clientid) (database name PE_USER_CLIENTID) */
    val index2 = index("PE_USER_CLIENTID", clientid :: HNil)

    /** Index over (companyid) (database name PE_USER_COMPANYID) */
    val index3 = index("PE_USER_COMPANYID", companyid :: HNil)

    /** Index over (contacterid) (database name PE_USER_CONTACTERID) */
    val index4 = index("PE_USER_CONTACTERID", contacterid :: HNil)

    /** Index over (groupid) (database name PE_USER_USERGROUPID) */
    val index5 = index("PE_USER_USERGROUPID", groupid :: HNil)

    /** Index over (validnum) (database name PE_USER_VALIDNUM) */
    val index6 = index("PE_USER_VALIDNUM", validnum :: HNil)
  }

  /** Collection-like TableQuery object for table PeUser */
  lazy val PeUser = new TableQuery(tag => new PeUser(tag))
}
