package models.access
// AUTO-GENERATED Slick data model for table PeSurveyrecord
trait PeSurveyrecordTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeSurveyrecord
   *  @param recordid Database column RecordID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param surveyid Database column SurveyID SqlType(INTEGER), Default(Some(0))
   *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
   *  @param ip Database column IP SqlType(VARCHAR), Length(20,true)
   *  @param answer Database column Answer SqlType(VARCHAR), Length(16777216,true)
   *  @param submittime Database column SubmitTime SqlType(TIMESTAMP) */
  case class PeSurveyrecordRow(recordid: Int, surveyid: Option[Int] = Some(0), username: Option[String], ip: Option[String], answer: Option[String], submittime: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching PeSurveyrecordRow objects using plain SQL queries */

  /** Table description of table PE_SurveyRecord. Objects of this class serve as prototypes for rows in queries. */
  class PeSurveyrecord(_tableTag: Tag) extends profile.api.Table[PeSurveyrecordRow](_tableTag, "PE_SurveyRecord") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column RecordID SqlType(INTEGER), AutoInc, PrimaryKey */
    val recordid: Rep[Int] = column[Int]("RecordID", O.AutoInc, O.PrimaryKey)
    /** Database column SurveyID SqlType(INTEGER), Default(Some(0)) */
    val surveyid: Rep[Option[Int]] = column[Option[Int]]("SurveyID", O.Default(Some(0)))
    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(50,varying=true))
    /** Database column IP SqlType(VARCHAR), Length(20,true) */
    val ip: Rep[Option[String]] = column[Option[String]]("IP", O.Length(20,varying=true))
    /** Database column Answer SqlType(VARCHAR), Length(16777216,true) */
    val answer: Rep[Option[String]] = column[Option[String]]("Answer", O.Length(16777216,varying=true))
    /** Database column SubmitTime SqlType(TIMESTAMP) */
    val submittime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("SubmitTime")

    /** Index over (surveyid) (database name PE_SURVEYRECORD_SURVEYID) */
    val index1 = index("PE_SURVEYRECORD_SURVEYID", surveyid)
  }
  /** Collection-like TableQuery object for table PeSurveyrecord */
  lazy val PeSurveyrecord = new TableQuery(tag => new PeSurveyrecord(tag))
}
