package models.access
// AUTO-GENERATED Slick data model for table PeResume
trait PeResumeTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeResume
   *  @param resumeid Database column ResumeID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param intervieweename Database column IntervieweeName SqlType(VARCHAR), Length(50,true)
   *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
   *  @param nationality Database column Nationality SqlType(VARCHAR), Length(50,true)
   *  @param politicalfeature Database column PoliticalFeature SqlType(VARCHAR), Length(50,true)
   *  @param age Database column Age SqlType(INTEGER), Default(Some(0))
   *  @param height Database column Height SqlType(VARCHAR), Length(50,true)
   *  @param weight Database column Weight SqlType(VARCHAR), Length(50,true)
   *  @param sex Database column Sex SqlType(INTEGER), Default(Some(0))
   *  @param photo Database column Photo SqlType(VARCHAR), Length(255,true)
   *  @param marital Database column Marital SqlType(INTEGER), Default(Some(0))
   *  @param health Database column Health SqlType(VARCHAR), Length(50,true)
   *  @param birthplace Database column BirthPlace SqlType(VARCHAR), Length(50,true)
   *  @param currentaddress Database column CurrentAddress SqlType(VARCHAR), Length(50,true)
   *  @param qq Database column QQ SqlType(VARCHAR), Length(50,true)
   *  @param telephone Database column Telephone SqlType(VARCHAR), Length(50,true)
   *  @param mobilephone Database column MobilePhone SqlType(VARCHAR), Length(50,true)
   *  @param address Database column Address SqlType(VARCHAR), Length(50,true)
   *  @param eMail Database column E_mail SqlType(VARCHAR), Length(50,true)
   *  @param graduateschool Database column GraduateSchool SqlType(VARCHAR), Length(50,true)
   *  @param education Database column Education SqlType(INTEGER), Default(Some(0))
   *  @param profession Database column Profession SqlType(VARCHAR), Length(50,true)
   *  @param availabledate Database column AvailableDate SqlType(VARCHAR), Length(50,true)
   *  @param workexperience Database column WorkExperience SqlType(VARCHAR), Length(16777216,true)
   *  @param professionalability Database column ProfessionalAbility SqlType(VARCHAR), Length(16777216,true)
   *  @param foreignlanguagekind Database column ForeignLanguageKind SqlType(INTEGER), Default(Some(0))
   *  @param foreignlanguageleval Database column ForeignLanguageLeval SqlType(VARCHAR), Length(50,true)
   *  @param motherlanguageleval Database column MotherLanguageLeval SqlType(VARCHAR), Length(50,true)
   *  @param otherlanguageleval Database column OtherLanguageLeval SqlType(VARCHAR), Length(50,true) */
  case class PeResumeRow(resumeid: Int = 0, intervieweename: Option[String], username: Option[String], nationality: Option[String], politicalfeature: Option[String], age: Option[Int] = Some(0), height: Option[String], weight: Option[String], sex: Option[Int] = Some(0), photo: Option[String], marital: Option[Int] = Some(0), health: Option[String], birthplace: Option[String], currentaddress: Option[String], qq: Option[String], telephone: Option[String], mobilephone: Option[String], address: Option[String], eMail: Option[String], graduateschool: Option[String], education: Option[Int] = Some(0), profession: Option[String], availabledate: Option[String], workexperience: Option[String], professionalability: Option[String], foreignlanguagekind: Option[Int] = Some(0), foreignlanguageleval: Option[String], motherlanguageleval: Option[String], otherlanguageleval: Option[String])
  /** GetResult implicit for fetching PeResumeRow objects using plain SQL queries */

  /** Table description of table PE_Resume. Objects of this class serve as prototypes for rows in queries. */
  class PeResume(_tableTag: Tag) extends profile.api.Table[PeResumeRow](_tableTag, "PE_Resume") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ResumeID SqlType(INTEGER), PrimaryKey, Default(0) */
    val resumeid: Rep[Int] = column[Int]("ResumeID", O.PrimaryKey, O.Default(0))
    /** Database column IntervieweeName SqlType(VARCHAR), Length(50,true) */
    val intervieweename: Rep[Option[String]] = column[Option[String]]("IntervieweeName", O.Length(50,varying=true))
    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(50,varying=true))
    /** Database column Nationality SqlType(VARCHAR), Length(50,true) */
    val nationality: Rep[Option[String]] = column[Option[String]]("Nationality", O.Length(50,varying=true))
    /** Database column PoliticalFeature SqlType(VARCHAR), Length(50,true) */
    val politicalfeature: Rep[Option[String]] = column[Option[String]]("PoliticalFeature", O.Length(50,varying=true))
    /** Database column Age SqlType(INTEGER), Default(Some(0)) */
    val age: Rep[Option[Int]] = column[Option[Int]]("Age", O.Default(Some(0)))
    /** Database column Height SqlType(VARCHAR), Length(50,true) */
    val height: Rep[Option[String]] = column[Option[String]]("Height", O.Length(50,varying=true))
    /** Database column Weight SqlType(VARCHAR), Length(50,true) */
    val weight: Rep[Option[String]] = column[Option[String]]("Weight", O.Length(50,varying=true))
    /** Database column Sex SqlType(INTEGER), Default(Some(0)) */
    val sex: Rep[Option[Int]] = column[Option[Int]]("Sex", O.Default(Some(0)))
    /** Database column Photo SqlType(VARCHAR), Length(255,true) */
    val photo: Rep[Option[String]] = column[Option[String]]("Photo", O.Length(255,varying=true))
    /** Database column Marital SqlType(INTEGER), Default(Some(0)) */
    val marital: Rep[Option[Int]] = column[Option[Int]]("Marital", O.Default(Some(0)))
    /** Database column Health SqlType(VARCHAR), Length(50,true) */
    val health: Rep[Option[String]] = column[Option[String]]("Health", O.Length(50,varying=true))
    /** Database column BirthPlace SqlType(VARCHAR), Length(50,true) */
    val birthplace: Rep[Option[String]] = column[Option[String]]("BirthPlace", O.Length(50,varying=true))
    /** Database column CurrentAddress SqlType(VARCHAR), Length(50,true) */
    val currentaddress: Rep[Option[String]] = column[Option[String]]("CurrentAddress", O.Length(50,varying=true))
    /** Database column QQ SqlType(VARCHAR), Length(50,true) */
    val qq: Rep[Option[String]] = column[Option[String]]("QQ", O.Length(50,varying=true))
    /** Database column Telephone SqlType(VARCHAR), Length(50,true) */
    val telephone: Rep[Option[String]] = column[Option[String]]("Telephone", O.Length(50,varying=true))
    /** Database column MobilePhone SqlType(VARCHAR), Length(50,true) */
    val mobilephone: Rep[Option[String]] = column[Option[String]]("MobilePhone", O.Length(50,varying=true))
    /** Database column Address SqlType(VARCHAR), Length(50,true) */
    val address: Rep[Option[String]] = column[Option[String]]("Address", O.Length(50,varying=true))
    /** Database column E_mail SqlType(VARCHAR), Length(50,true) */
    val eMail: Rep[Option[String]] = column[Option[String]]("E_mail", O.Length(50,varying=true))
    /** Database column GraduateSchool SqlType(VARCHAR), Length(50,true) */
    val graduateschool: Rep[Option[String]] = column[Option[String]]("GraduateSchool", O.Length(50,varying=true))
    /** Database column Education SqlType(INTEGER), Default(Some(0)) */
    val education: Rep[Option[Int]] = column[Option[Int]]("Education", O.Default(Some(0)))
    /** Database column Profession SqlType(VARCHAR), Length(50,true) */
    val profession: Rep[Option[String]] = column[Option[String]]("Profession", O.Length(50,varying=true))
    /** Database column AvailableDate SqlType(VARCHAR), Length(50,true) */
    val availabledate: Rep[Option[String]] = column[Option[String]]("AvailableDate", O.Length(50,varying=true))
    /** Database column WorkExperience SqlType(VARCHAR), Length(16777216,true) */
    val workexperience: Rep[Option[String]] = column[Option[String]]("WorkExperience", O.Length(16777216,varying=true))
    /** Database column ProfessionalAbility SqlType(VARCHAR), Length(16777216,true) */
    val professionalability: Rep[Option[String]] = column[Option[String]]("ProfessionalAbility", O.Length(16777216,varying=true))
    /** Database column ForeignLanguageKind SqlType(INTEGER), Default(Some(0)) */
    val foreignlanguagekind: Rep[Option[Int]] = column[Option[Int]]("ForeignLanguageKind", O.Default(Some(0)))
    /** Database column ForeignLanguageLeval SqlType(VARCHAR), Length(50,true) */
    val foreignlanguageleval: Rep[Option[String]] = column[Option[String]]("ForeignLanguageLeval", O.Length(50,varying=true))
    /** Database column MotherLanguageLeval SqlType(VARCHAR), Length(50,true) */
    val motherlanguageleval: Rep[Option[String]] = column[Option[String]]("MotherLanguageLeval", O.Length(50,varying=true))
    /** Database column OtherLanguageLeval SqlType(VARCHAR), Length(50,true) */
    val otherlanguageleval: Rep[Option[String]] = column[Option[String]]("OtherLanguageLeval", O.Length(50,varying=true))
  }
  /** Collection-like TableQuery object for table PeResume */
  lazy val PeResume = new TableQuery(tag => new PeResume(tag))
}
