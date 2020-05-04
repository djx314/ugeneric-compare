package models.access
// AUTO-GENERATED Slick data model for table PeSurveyquestion
trait PeSurveyquestionTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeSurveyquestion
    *  @param questionid Database column QuestionID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param surveyid Database column SurveyID SqlType(INTEGER), Default(Some(0))
    *  @param questioncontent Database column QuestionContent SqlType(VARCHAR), Length(255,true)
    *  @param questiontype Database column QuestionType SqlType(SMALLINT), Default(Some(1))
    *  @param inputtype Database column InputType SqlType(SMALLINT), Default(Some(0))
    *  @param notempty Database column NotEmpty SqlType(INTEGER), Default(Some(0))
    *  @param dataright Database column DataRight SqlType(INTEGER), Default(Some(0))
    *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0))
    *  @param contentlength Database column ContentLength SqlType(INTEGER), Default(Some(0)) */
  case class PeSurveyquestionRow(
    questionid: Int,
    surveyid: Option[Int] = Some(0),
    questioncontent: Option[String],
    questiontype: Option[Short] = Some(1),
    inputtype: Option[Short] = Some(0),
    notempty: Option[Int] = Some(0),
    dataright: Option[Int] = Some(0),
    orderid: Option[Int] = Some(0),
    contentlength: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeSurveyquestionRow objects using plain SQL queries */
  /** Table description of table PE_SurveyQuestion. Objects of this class serve as prototypes for rows in queries. */
  class PeSurveyquestion(_tableTag: Tag) extends profile.api.Table[PeSurveyquestionRow](_tableTag, "PE_SurveyQuestion") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column QuestionID SqlType(INTEGER), AutoInc, PrimaryKey */
    val questionid: Rep[Int] = column[Int]("QuestionID", O.AutoInc, O.PrimaryKey)

    /** Database column SurveyID SqlType(INTEGER), Default(Some(0)) */
    val surveyid: Rep[Option[Int]] = column[Option[Int]]("SurveyID", O.Default(Some(0)))

    /** Database column QuestionContent SqlType(VARCHAR), Length(255,true) */
    val questioncontent: Rep[Option[String]] = column[Option[String]]("QuestionContent", O.Length(255, varying = true))

    /** Database column QuestionType SqlType(SMALLINT), Default(Some(1)) */
    val questiontype: Rep[Option[Short]] = column[Option[Short]]("QuestionType", O.Default(Some(1)))

    /** Database column InputType SqlType(SMALLINT), Default(Some(0)) */
    val inputtype: Rep[Option[Short]] = column[Option[Short]]("InputType", O.Default(Some(0)))

    /** Database column NotEmpty SqlType(INTEGER), Default(Some(0)) */
    val notempty: Rep[Option[Int]] = column[Option[Int]]("NotEmpty", O.Default(Some(0)))

    /** Database column DataRight SqlType(INTEGER), Default(Some(0)) */
    val dataright: Rep[Option[Int]] = column[Option[Int]]("DataRight", O.Default(Some(0)))

    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))

    /** Database column ContentLength SqlType(INTEGER), Default(Some(0)) */
    val contentlength: Rep[Option[Int]] = column[Option[Int]]("ContentLength", O.Default(Some(0)))

    /** Index over (surveyid) (database name PE_SURVEYQUESTION_I_ID) */
    val index1 = index("PE_SURVEYQUESTION_I_ID", surveyid)

    /** Index over (orderid) (database name PE_SURVEYQUESTION_ORDERID) */
    val index2 = index("PE_SURVEYQUESTION_ORDERID", orderid)
  }

  /** Collection-like TableQuery object for table PeSurveyquestion */
  lazy val PeSurveyquestion = new TableQuery(tag => new PeSurveyquestion(tag))
}
