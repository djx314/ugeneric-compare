package models.access
// AUTO-GENERATED Slick data model for table PeSurvey
trait PeSurveyTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeSurvey
    *  @param surveyid Database column SurveyID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param surveyname Database column SurveyName SqlType(VARCHAR), Length(50,true)
    *  @param description Database column Description SqlType(VARCHAR), Length(16777216,true)
    *  @param filename Database column FileName SqlType(VARCHAR), Length(50,true)
    *  @param iprepeat Database column IPRepeat SqlType(INTEGER), Default(Some(0))
    *  @param createdate Database column CreateDate SqlType(TIMESTAMP)
    *  @param endtime Database column EndTime SqlType(TIMESTAMP)
    *  @param isopen Database column IsOpen SqlType(INTEGER), Default(Some(0))
    *  @param needlogin Database column NeedLogin SqlType(INTEGER), Default(Some(0))
    *  @param presentpoint Database column PresentPoint SqlType(INTEGER), Default(Some(0))
    *  @param lockiptype Database column LockIPType SqlType(INTEGER), Default(Some(0))
    *  @param setiplock Database column SetIPLock SqlType(VARCHAR), Length(16777216,true)
    *  @param lockurl Database column LockUrl SqlType(VARCHAR), Length(16777216,true)
    *  @param setpassword Database column SetPassword SqlType(VARCHAR), Length(50,true)
    *  @param templateid Database column TemplateID SqlType(INTEGER), Default(Some(0)) */
  case class PeSurveyRow(
    surveyid: Int,
    surveyname: Option[String],
    description: Option[String],
    filename: Option[String],
    iprepeat: Option[Int] = Some(0),
    createdate: Option[java.sql.Timestamp],
    endtime: Option[java.sql.Timestamp],
    isopen: Option[Int] = Some(0),
    needlogin: Option[Int] = Some(0),
    presentpoint: Option[Int] = Some(0),
    lockiptype: Option[Int] = Some(0),
    setiplock: Option[String],
    lockurl: Option[String],
    setpassword: Option[String],
    templateid: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeSurveyRow objects using plain SQL queries */
  /** Table description of table PE_Survey. Objects of this class serve as prototypes for rows in queries. */
  class PeSurvey(_tableTag: Tag) extends profile.api.Table[PeSurveyRow](_tableTag, "PE_Survey") {
    def * =
      (surveyid :: surveyname :: description :: filename :: iprepeat :: createdate :: endtime :: isopen :: needlogin :: presentpoint :: lockiptype :: setiplock :: lockurl :: setpassword :: templateid :: HNil)
        .mapTo[PeSurveyRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column SurveyID SqlType(INTEGER), AutoInc, PrimaryKey */
    val surveyid: Rep[Int] = column[Int]("SurveyID", O.AutoInc, O.PrimaryKey)

    /** Database column SurveyName SqlType(VARCHAR), Length(50,true) */
    val surveyname: Rep[Option[String]] = column[Option[String]]("SurveyName", O.Length(50, varying = true))

    /** Database column Description SqlType(VARCHAR), Length(16777216,true) */
    val description: Rep[Option[String]] = column[Option[String]]("Description", O.Length(16777216, varying = true))

    /** Database column FileName SqlType(VARCHAR), Length(50,true) */
    val filename: Rep[Option[String]] = column[Option[String]]("FileName", O.Length(50, varying = true))

    /** Database column IPRepeat SqlType(INTEGER), Default(Some(0)) */
    val iprepeat: Rep[Option[Int]] = column[Option[Int]]("IPRepeat", O.Default(Some(0)))

    /** Database column CreateDate SqlType(TIMESTAMP) */
    val createdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CreateDate")

    /** Database column EndTime SqlType(TIMESTAMP) */
    val endtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EndTime")

    /** Database column IsOpen SqlType(INTEGER), Default(Some(0)) */
    val isopen: Rep[Option[Int]] = column[Option[Int]]("IsOpen", O.Default(Some(0)))

    /** Database column NeedLogin SqlType(INTEGER), Default(Some(0)) */
    val needlogin: Rep[Option[Int]] = column[Option[Int]]("NeedLogin", O.Default(Some(0)))

    /** Database column PresentPoint SqlType(INTEGER), Default(Some(0)) */
    val presentpoint: Rep[Option[Int]] = column[Option[Int]]("PresentPoint", O.Default(Some(0)))

    /** Database column LockIPType SqlType(INTEGER), Default(Some(0)) */
    val lockiptype: Rep[Option[Int]] = column[Option[Int]]("LockIPType", O.Default(Some(0)))

    /** Database column SetIPLock SqlType(VARCHAR), Length(16777216,true) */
    val setiplock: Rep[Option[String]] = column[Option[String]]("SetIPLock", O.Length(16777216, varying = true))

    /** Database column LockUrl SqlType(VARCHAR), Length(16777216,true) */
    val lockurl: Rep[Option[String]] = column[Option[String]]("LockUrl", O.Length(16777216, varying = true))

    /** Database column SetPassword SqlType(VARCHAR), Length(50,true) */
    val setpassword: Rep[Option[String]] = column[Option[String]]("SetPassword", O.Length(50, varying = true))

    /** Database column TemplateID SqlType(INTEGER), Default(Some(0)) */
    val templateid: Rep[Option[Int]] = column[Option[Int]]("TemplateID", O.Default(Some(0)))

    /** Index over (templateid) (database name PE_SURVEY_TEMPLATEID) */
    val index1 = index("PE_SURVEY_TEMPLATEID", templateid :: HNil)
  }

  /** Collection-like TableQuery object for table PeSurvey */
  lazy val PeSurvey = new TableQuery(tag => new PeSurvey(tag))
}
