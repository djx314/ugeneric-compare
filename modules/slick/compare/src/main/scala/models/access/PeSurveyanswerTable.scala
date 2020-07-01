package models.access
// AUTO-GENERATED Slick data model for table PeSurveyanswer
trait PeSurveyanswerTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeSurveyanswer
   *  @param answerid Database column AnswerID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param questionid Database column QuestionID SqlType(INTEGER), Default(Some(0))
   *  @param voteamount Database column VoteAmount SqlType(INTEGER), Default(Some(0))
   *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0))
   *  @param answercontent Database column AnswerContent SqlType(VARCHAR), Length(255,true) */
  case class PeSurveyanswerRow(answerid: Int, questionid: Option[Int] = Some(0), voteamount: Option[Int] = Some(0), orderid: Option[Int] = Some(0), answercontent: Option[String])
  /** GetResult implicit for fetching PeSurveyanswerRow objects using plain SQL queries */

  /** Table description of table PE_SurveyAnswer. Objects of this class serve as prototypes for rows in queries. */
  class PeSurveyanswer(_tableTag: Tag) extends profile.api.Table[PeSurveyanswerRow](_tableTag, "PE_SurveyAnswer") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(implicit e => _.mapWithTable(this))
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column AnswerID SqlType(INTEGER), AutoInc, PrimaryKey */
    val answerid: Rep[Int] = column[Int]("AnswerID", O.AutoInc, O.PrimaryKey)
    /** Database column QuestionID SqlType(INTEGER), Default(Some(0)) */
    val questionid: Rep[Option[Int]] = column[Option[Int]]("QuestionID", O.Default(Some(0)))
    /** Database column VoteAmount SqlType(INTEGER), Default(Some(0)) */
    val voteamount: Rep[Option[Int]] = column[Option[Int]]("VoteAmount", O.Default(Some(0)))
    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))
    /** Database column AnswerContent SqlType(VARCHAR), Length(255,true) */
    val answercontent: Rep[Option[String]] = column[Option[String]]("AnswerContent", O.Length(255,varying=true))

    /** Index over (questionid) (database name PE_SURVEYANSWER_ITEM_ID) */
    val index1 = index("PE_SURVEYANSWER_ITEM_ID", questionid)
    /** Index over (orderid) (database name PE_SURVEYANSWER_ORDERID) */
    val index2 = index("PE_SURVEYANSWER_ORDERID", orderid)
  }
  /** Collection-like TableQuery object for table PeSurveyanswer */
  lazy val PeSurveyanswer = new TableQuery(tag => new PeSurveyanswer(tag))
}
