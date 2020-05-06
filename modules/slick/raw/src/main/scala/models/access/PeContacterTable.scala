package models.access
// AUTO-GENERATED Slick data model for table PeContacter
trait PeContacterTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeContacter
   *  @param contacterid Database column ContacterID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param clientid Database column ClientID SqlType(INTEGER), Default(Some(0))
   *  @param parentid Database column ParentID SqlType(INTEGER), Default(Some(0))
   *  @param usertype Database column UserType SqlType(SMALLINT)
   *  @param truename Database column TrueName SqlType(VARCHAR), Length(20,true)
   *  @param sex Database column Sex SqlType(SMALLINT)
   *  @param title Database column Title SqlType(VARCHAR), Length(50,true)
   *  @param company Database column Company SqlType(VARCHAR), Length(100,true)
   *  @param department Database column Department SqlType(VARCHAR), Length(50,true)
   *  @param position Database column Position SqlType(VARCHAR), Length(50,true)
   *  @param operation Database column Operation SqlType(VARCHAR), Length(50,true)
   *  @param companyaddress Database column CompanyAddress SqlType(VARCHAR), Length(200,true)
   *  @param email Database column Email SqlType(VARCHAR), Length(100,true)
   *  @param homepage Database column Homepage SqlType(VARCHAR), Length(255,true)
   *  @param qq Database column QQ SqlType(VARCHAR), Length(20,true)
   *  @param icq Database column ICQ SqlType(VARCHAR), Length(25,true)
   *  @param msn Database column MSN SqlType(VARCHAR), Length(100,true)
   *  @param yahoo Database column Yahoo SqlType(VARCHAR), Length(100,true)
   *  @param uc Database column UC SqlType(VARCHAR), Length(100,true)
   *  @param aim Database column Aim SqlType(VARCHAR), Length(100,true)
   *  @param officephone Database column OfficePhone SqlType(VARCHAR), Length(30,true)
   *  @param homephone Database column HomePhone SqlType(VARCHAR), Length(30,true)
   *  @param phs Database column PHS SqlType(VARCHAR), Length(30,true)
   *  @param fax Database column Fax SqlType(VARCHAR), Length(30,true)
   *  @param mobile Database column Mobile SqlType(VARCHAR), Length(30,true)
   *  @param country Database column Country SqlType(VARCHAR), Length(50,true)
   *  @param province Database column Province SqlType(VARCHAR), Length(30,true)
   *  @param city Database column City SqlType(VARCHAR), Length(30,true)
   *  @param address Database column Address SqlType(VARCHAR), Length(255,true)
   *  @param zipcode Database column ZipCode SqlType(VARCHAR), Length(10,true)
   *  @param nativeplace Database column NativePlace SqlType(VARCHAR), Length(50,true)
   *  @param nation Database column Nation SqlType(VARCHAR), Length(50,true)
   *  @param birthday Database column Birthday SqlType(TIMESTAMP)
   *  @param idcard Database column IDCard SqlType(VARCHAR), Length(20,true)
   *  @param marriage Database column Marriage SqlType(SMALLINT)
   *  @param family Database column Family SqlType(VARCHAR), Length(16777216,true)
   *  @param income Database column Income SqlType(INTEGER)
   *  @param education Database column Education SqlType(INTEGER), Default(Some(0))
   *  @param graduatefrom Database column GraduateFrom SqlType(VARCHAR), Length(255,true)
   *  @param interestsoflife Database column InterestsOfLife SqlType(VARCHAR), Length(255,true)
   *  @param interestsofculture Database column InterestsOfCulture SqlType(VARCHAR), Length(255,true)
   *  @param interestsofamusement Database column InterestsOfAmusement SqlType(VARCHAR), Length(255,true)
   *  @param interestsofsport Database column InterestsOfSport SqlType(VARCHAR), Length(255,true)
   *  @param interestsofother Database column InterestsOfOther SqlType(VARCHAR), Length(255,true)
   *  @param createtime Database column CreateTime SqlType(TIMESTAMP)
   *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP)
   *  @param owner Database column Owner SqlType(VARCHAR), Length(50,true)
   *  @param arrchannelid Database column arrChannelID SqlType(VARCHAR), Length(255,true) */
  case class PeContacterRow(contacterid: Int = 0, clientid: Option[Int] = Some(0), parentid: Option[Int] = Some(0), usertype: Option[Short], truename: Option[String], sex: Option[Short], title: Option[String], company: Option[String], department: Option[String], position: Option[String], operation: Option[String], companyaddress: Option[String], email: Option[String], homepage: Option[String], qq: Option[String], icq: Option[String], msn: Option[String], yahoo: Option[String], uc: Option[String], aim: Option[String], officephone: Option[String], homephone: Option[String], phs: Option[String], fax: Option[String], mobile: Option[String], country: Option[String], province: Option[String], city: Option[String], address: Option[String], zipcode: Option[String], nativeplace: Option[String], nation: Option[String], birthday: Option[java.sql.Timestamp], idcard: Option[String], marriage: Option[Short], family: Option[String], income: Option[Int], education: Option[Int] = Some(0), graduatefrom: Option[String], interestsoflife: Option[String], interestsofculture: Option[String], interestsofamusement: Option[String], interestsofsport: Option[String], interestsofother: Option[String], createtime: Option[java.sql.Timestamp], updatetime: Option[java.sql.Timestamp], owner: Option[String], arrchannelid: Option[String])
  /** GetResult implicit for fetching PeContacterRow objects using plain SQL queries */

  /** Table description of table PE_Contacter. Objects of this class serve as prototypes for rows in queries. */
  class PeContacter(_tableTag: Tag) extends profile.api.Table[PeContacterRow](_tableTag, "PE_Contacter") {
    def * = (contacterid :: clientid :: parentid :: usertype :: truename :: sex :: title :: company :: department :: position :: operation :: companyaddress :: email :: homepage :: qq :: icq :: msn :: yahoo :: uc :: aim :: officephone :: homephone :: phs :: fax :: mobile :: country :: province :: city :: address :: zipcode :: nativeplace :: nation :: birthday :: idcard :: marriage :: family :: income :: education :: graduatefrom :: interestsoflife :: interestsofculture :: interestsofamusement :: interestsofsport :: interestsofother :: createtime :: updatetime :: owner :: arrchannelid :: HNil).mapTo[PeContacterRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ContacterID SqlType(INTEGER), PrimaryKey, Default(0) */
    val contacterid: Rep[Int] = column[Int]("ContacterID", O.PrimaryKey, O.Default(0))
    /** Database column ClientID SqlType(INTEGER), Default(Some(0)) */
    val clientid: Rep[Option[Int]] = column[Option[Int]]("ClientID", O.Default(Some(0)))
    /** Database column ParentID SqlType(INTEGER), Default(Some(0)) */
    val parentid: Rep[Option[Int]] = column[Option[Int]]("ParentID", O.Default(Some(0)))
    /** Database column UserType SqlType(SMALLINT) */
    val usertype: Rep[Option[Short]] = column[Option[Short]]("UserType")
    /** Database column TrueName SqlType(VARCHAR), Length(20,true) */
    val truename: Rep[Option[String]] = column[Option[String]]("TrueName", O.Length(20,varying=true))
    /** Database column Sex SqlType(SMALLINT) */
    val sex: Rep[Option[Short]] = column[Option[Short]]("Sex")
    /** Database column Title SqlType(VARCHAR), Length(50,true) */
    val title: Rep[Option[String]] = column[Option[String]]("Title", O.Length(50,varying=true))
    /** Database column Company SqlType(VARCHAR), Length(100,true) */
    val company: Rep[Option[String]] = column[Option[String]]("Company", O.Length(100,varying=true))
    /** Database column Department SqlType(VARCHAR), Length(50,true) */
    val department: Rep[Option[String]] = column[Option[String]]("Department", O.Length(50,varying=true))
    /** Database column Position SqlType(VARCHAR), Length(50,true) */
    val position: Rep[Option[String]] = column[Option[String]]("Position", O.Length(50,varying=true))
    /** Database column Operation SqlType(VARCHAR), Length(50,true) */
    val operation: Rep[Option[String]] = column[Option[String]]("Operation", O.Length(50,varying=true))
    /** Database column CompanyAddress SqlType(VARCHAR), Length(200,true) */
    val companyaddress: Rep[Option[String]] = column[Option[String]]("CompanyAddress", O.Length(200,varying=true))
    /** Database column Email SqlType(VARCHAR), Length(100,true) */
    val email: Rep[Option[String]] = column[Option[String]]("Email", O.Length(100,varying=true))
    /** Database column Homepage SqlType(VARCHAR), Length(255,true) */
    val homepage: Rep[Option[String]] = column[Option[String]]("Homepage", O.Length(255,varying=true))
    /** Database column QQ SqlType(VARCHAR), Length(20,true) */
    val qq: Rep[Option[String]] = column[Option[String]]("QQ", O.Length(20,varying=true))
    /** Database column ICQ SqlType(VARCHAR), Length(25,true) */
    val icq: Rep[Option[String]] = column[Option[String]]("ICQ", O.Length(25,varying=true))
    /** Database column MSN SqlType(VARCHAR), Length(100,true) */
    val msn: Rep[Option[String]] = column[Option[String]]("MSN", O.Length(100,varying=true))
    /** Database column Yahoo SqlType(VARCHAR), Length(100,true) */
    val yahoo: Rep[Option[String]] = column[Option[String]]("Yahoo", O.Length(100,varying=true))
    /** Database column UC SqlType(VARCHAR), Length(100,true) */
    val uc: Rep[Option[String]] = column[Option[String]]("UC", O.Length(100,varying=true))
    /** Database column Aim SqlType(VARCHAR), Length(100,true) */
    val aim: Rep[Option[String]] = column[Option[String]]("Aim", O.Length(100,varying=true))
    /** Database column OfficePhone SqlType(VARCHAR), Length(30,true) */
    val officephone: Rep[Option[String]] = column[Option[String]]("OfficePhone", O.Length(30,varying=true))
    /** Database column HomePhone SqlType(VARCHAR), Length(30,true) */
    val homephone: Rep[Option[String]] = column[Option[String]]("HomePhone", O.Length(30,varying=true))
    /** Database column PHS SqlType(VARCHAR), Length(30,true) */
    val phs: Rep[Option[String]] = column[Option[String]]("PHS", O.Length(30,varying=true))
    /** Database column Fax SqlType(VARCHAR), Length(30,true) */
    val fax: Rep[Option[String]] = column[Option[String]]("Fax", O.Length(30,varying=true))
    /** Database column Mobile SqlType(VARCHAR), Length(30,true) */
    val mobile: Rep[Option[String]] = column[Option[String]]("Mobile", O.Length(30,varying=true))
    /** Database column Country SqlType(VARCHAR), Length(50,true) */
    val country: Rep[Option[String]] = column[Option[String]]("Country", O.Length(50,varying=true))
    /** Database column Province SqlType(VARCHAR), Length(30,true) */
    val province: Rep[Option[String]] = column[Option[String]]("Province", O.Length(30,varying=true))
    /** Database column City SqlType(VARCHAR), Length(30,true) */
    val city: Rep[Option[String]] = column[Option[String]]("City", O.Length(30,varying=true))
    /** Database column Address SqlType(VARCHAR), Length(255,true) */
    val address: Rep[Option[String]] = column[Option[String]]("Address", O.Length(255,varying=true))
    /** Database column ZipCode SqlType(VARCHAR), Length(10,true) */
    val zipcode: Rep[Option[String]] = column[Option[String]]("ZipCode", O.Length(10,varying=true))
    /** Database column NativePlace SqlType(VARCHAR), Length(50,true) */
    val nativeplace: Rep[Option[String]] = column[Option[String]]("NativePlace", O.Length(50,varying=true))
    /** Database column Nation SqlType(VARCHAR), Length(50,true) */
    val nation: Rep[Option[String]] = column[Option[String]]("Nation", O.Length(50,varying=true))
    /** Database column Birthday SqlType(TIMESTAMP) */
    val birthday: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("Birthday")
    /** Database column IDCard SqlType(VARCHAR), Length(20,true) */
    val idcard: Rep[Option[String]] = column[Option[String]]("IDCard", O.Length(20,varying=true))
    /** Database column Marriage SqlType(SMALLINT) */
    val marriage: Rep[Option[Short]] = column[Option[Short]]("Marriage")
    /** Database column Family SqlType(VARCHAR), Length(16777216,true) */
    val family: Rep[Option[String]] = column[Option[String]]("Family", O.Length(16777216,varying=true))
    /** Database column Income SqlType(INTEGER) */
    val income: Rep[Option[Int]] = column[Option[Int]]("Income")
    /** Database column Education SqlType(INTEGER), Default(Some(0)) */
    val education: Rep[Option[Int]] = column[Option[Int]]("Education", O.Default(Some(0)))
    /** Database column GraduateFrom SqlType(VARCHAR), Length(255,true) */
    val graduatefrom: Rep[Option[String]] = column[Option[String]]("GraduateFrom", O.Length(255,varying=true))
    /** Database column InterestsOfLife SqlType(VARCHAR), Length(255,true) */
    val interestsoflife: Rep[Option[String]] = column[Option[String]]("InterestsOfLife", O.Length(255,varying=true))
    /** Database column InterestsOfCulture SqlType(VARCHAR), Length(255,true) */
    val interestsofculture: Rep[Option[String]] = column[Option[String]]("InterestsOfCulture", O.Length(255,varying=true))
    /** Database column InterestsOfAmusement SqlType(VARCHAR), Length(255,true) */
    val interestsofamusement: Rep[Option[String]] = column[Option[String]]("InterestsOfAmusement", O.Length(255,varying=true))
    /** Database column InterestsOfSport SqlType(VARCHAR), Length(255,true) */
    val interestsofsport: Rep[Option[String]] = column[Option[String]]("InterestsOfSport", O.Length(255,varying=true))
    /** Database column InterestsOfOther SqlType(VARCHAR), Length(255,true) */
    val interestsofother: Rep[Option[String]] = column[Option[String]]("InterestsOfOther", O.Length(255,varying=true))
    /** Database column CreateTime SqlType(TIMESTAMP) */
    val createtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CreateTime")
    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UpdateTime")
    /** Database column Owner SqlType(VARCHAR), Length(50,true) */
    val owner: Rep[Option[String]] = column[Option[String]]("Owner", O.Length(50,varying=true))
    /** Database column arrChannelID SqlType(VARCHAR), Length(255,true) */
    val arrchannelid: Rep[Option[String]] = column[Option[String]]("arrChannelID", O.Length(255,varying=true))

    /** Index over (clientid) (database name PE_CONTACTER_CLIENTID) */
    val index1 = index("PE_CONTACTER_CLIENTID", clientid :: HNil)
    /** Index over (idcard) (database name PE_CONTACTER_IDCARD) */
    val index2 = index("PE_CONTACTER_IDCARD", idcard :: HNil)
    /** Index over (parentid) (database name PE_CONTACTER_PARENTID) */
    val index3 = index("PE_CONTACTER_PARENTID", parentid :: HNil)
    /** Index over (zipcode) (database name PE_CONTACTER_ZIPCODE) */
    val index4 = index("PE_CONTACTER_ZIPCODE", zipcode :: HNil)
  }
  /** Collection-like TableQuery object for table PeContacter */
  lazy val PeContacter = new TableQuery(tag => new PeContacter(tag))
}
