package models.access
// AUTO-GENERATED Slick data model for table PeSurveyinput
trait PeSurveyinputTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeSurveyinput
    *  @param questionid Database column QuestionID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param inputcontent Database column InputContent SqlType(VARCHAR), Length(16777216,true)
    *  @param surveyid Database column SurveyID SqlType(INTEGER), Default(Some(0)) */
  case class PeSurveyinputRow(questionid: Int = 0, inputcontent: Option[String], surveyid: Option[Int] = Some(0))

  /** GetResult implicit for fetching PeSurveyinputRow objects using plain SQL queries */
  /** Table description of table PE_SurveyInput. Objects of this class serve as prototypes for rows in queries. */
  class PeSurveyinput(_tableTag: Tag) extends profile.api.Table[PeSurveyinputRow](_tableTag, "PE_SurveyInput") {
    def * = (questionid :: inputcontent :: surveyid :: HNil).mapTo[PeSurveyinputRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column QuestionID SqlType(INTEGER), PrimaryKey, Default(0) */
    val questionid: Rep[Int] = column[Int]("QuestionID", O.PrimaryKey, O.Default(0))

    /** Database column InputContent SqlType(VARCHAR), Length(16777216,true) */
    val inputcontent: Rep[Option[String]] = column[Option[String]]("InputContent", O.Length(16777216, varying = true))

    /** Database column SurveyID SqlType(INTEGER), Default(Some(0)) */
    val surveyid: Rep[Option[Int]] = column[Option[Int]]("SurveyID", O.Default(Some(0)))

    /** Index over (surveyid) (database name PE_SURVEYINPUT_SURVEYID) */
    val index1 = index("PE_SURVEYINPUT_SURVEYID", surveyid :: HNil)
  }

  /** Collection-like TableQuery object for table PeSurveyinput */
  lazy val PeSurveyinput = new TableQuery(tag => new PeSurveyinput(tag))
}
