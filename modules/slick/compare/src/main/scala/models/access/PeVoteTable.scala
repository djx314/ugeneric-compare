package models.access
// AUTO-GENERATED Slick data model for table PeVote
trait PeVoteTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeVote
   *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param title Database column Title SqlType(VARCHAR), Length(16777216,true)
   *  @param select1 Database column Select1 SqlType(VARCHAR), Length(255,true)
   *  @param answer1 Database column Answer1 SqlType(INTEGER)
   *  @param select2 Database column Select2 SqlType(VARCHAR), Length(255,true)
   *  @param answer2 Database column Answer2 SqlType(INTEGER)
   *  @param select3 Database column Select3 SqlType(VARCHAR), Length(255,true)
   *  @param answer3 Database column Answer3 SqlType(INTEGER)
   *  @param select4 Database column Select4 SqlType(VARCHAR), Length(255,true)
   *  @param answer4 Database column Answer4 SqlType(INTEGER)
   *  @param select5 Database column Select5 SqlType(VARCHAR), Length(255,true)
   *  @param answer5 Database column Answer5 SqlType(INTEGER)
   *  @param select6 Database column Select6 SqlType(VARCHAR), Length(255,true)
   *  @param answer6 Database column Answer6 SqlType(INTEGER)
   *  @param select7 Database column Select7 SqlType(VARCHAR), Length(255,true)
   *  @param answer7 Database column Answer7 SqlType(INTEGER)
   *  @param select8 Database column Select8 SqlType(VARCHAR), Length(255,true)
   *  @param answer8 Database column Answer8 SqlType(INTEGER)
   *  @param votetime Database column VoteTime SqlType(TIMESTAMP)
   *  @param endtime Database column EndTime SqlType(TIMESTAMP)
   *  @param votetype Database column VoteType SqlType(VARCHAR), Length(10,true)
   *  @param isselected Database column IsSelected SqlType(BOOLEAN)
   *  @param channelid Database column ChannelID SqlType(INTEGER)
   *  @param isitem Database column IsItem SqlType(BOOLEAN)
   *  @param select9 Database column Select9 SqlType(VARCHAR), Length(255,true)
   *  @param select10 Database column Select10 SqlType(VARCHAR), Length(255,true)
   *  @param select11 Database column Select11 SqlType(VARCHAR), Length(255,true)
   *  @param select12 Database column Select12 SqlType(VARCHAR), Length(255,true)
   *  @param select13 Database column Select13 SqlType(VARCHAR), Length(255,true)
   *  @param select14 Database column Select14 SqlType(VARCHAR), Length(255,true)
   *  @param select15 Database column Select15 SqlType(VARCHAR), Length(255,true)
   *  @param select16 Database column Select16 SqlType(VARCHAR), Length(255,true)
   *  @param select17 Database column Select17 SqlType(VARCHAR), Length(255,true)
   *  @param select18 Database column Select18 SqlType(VARCHAR), Length(255,true)
   *  @param select19 Database column Select19 SqlType(VARCHAR), Length(255,true)
   *  @param select20 Database column Select20 SqlType(VARCHAR), Length(255,true)
   *  @param answer9 Database column Answer9 SqlType(INTEGER)
   *  @param answer10 Database column Answer10 SqlType(INTEGER)
   *  @param answer11 Database column Answer11 SqlType(INTEGER)
   *  @param answer12 Database column Answer12 SqlType(INTEGER)
   *  @param answer13 Database column Answer13 SqlType(INTEGER)
   *  @param answer14 Database column Answer14 SqlType(INTEGER)
   *  @param answer15 Database column Answer15 SqlType(INTEGER)
   *  @param answer16 Database column Answer16 SqlType(INTEGER)
   *  @param answer17 Database column Answer17 SqlType(INTEGER)
   *  @param answer18 Database column Answer18 SqlType(INTEGER)
   *  @param answer19 Database column Answer19 SqlType(INTEGER)
   *  @param answer20 Database column Answer20 SqlType(INTEGER)
   *  @param votenum Database column VoteNum SqlType(INTEGER) */
  case class PeVoteRow(id: Int, title: Option[String], select1: Option[String], answer1: Option[Int], select2: Option[String], answer2: Option[Int], select3: Option[String], answer3: Option[Int], select4: Option[String], answer4: Option[Int], select5: Option[String], answer5: Option[Int], select6: Option[String], answer6: Option[Int], select7: Option[String], answer7: Option[Int], select8: Option[String], answer8: Option[Int], votetime: Option[java.sql.Timestamp], endtime: Option[java.sql.Timestamp], votetype: Option[String], isselected: Boolean, channelid: Option[Int], isitem: Option[Boolean], select9: Option[String], select10: Option[String], select11: Option[String], select12: Option[String], select13: Option[String], select14: Option[String], select15: Option[String], select16: Option[String], select17: Option[String], select18: Option[String], select19: Option[String], select20: Option[String], answer9: Option[Int], answer10: Option[Int], answer11: Option[Int], answer12: Option[Int], answer13: Option[Int], answer14: Option[Int], answer15: Option[Int], answer16: Option[Int], answer17: Option[Int], answer18: Option[Int], answer19: Option[Int], answer20: Option[Int], votenum: Int)
  /** GetResult implicit for fetching PeVoteRow objects using plain SQL queries */

  /** Table description of table PE_Vote. Objects of this class serve as prototypes for rows in queries. */
  class PeVote(_tableTag: Tag) extends profile.api.Table[PeVoteRow](_tableTag, "PE_Vote") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column Title SqlType(VARCHAR), Length(16777216,true) */
    val title: Rep[Option[String]] = column[Option[String]]("Title", O.Length(16777216,varying=true))
    /** Database column Select1 SqlType(VARCHAR), Length(255,true) */
    val select1: Rep[Option[String]] = column[Option[String]]("Select1", O.Length(255,varying=true))
    /** Database column Answer1 SqlType(INTEGER) */
    val answer1: Rep[Option[Int]] = column[Option[Int]]("Answer1")
    /** Database column Select2 SqlType(VARCHAR), Length(255,true) */
    val select2: Rep[Option[String]] = column[Option[String]]("Select2", O.Length(255,varying=true))
    /** Database column Answer2 SqlType(INTEGER) */
    val answer2: Rep[Option[Int]] = column[Option[Int]]("Answer2")
    /** Database column Select3 SqlType(VARCHAR), Length(255,true) */
    val select3: Rep[Option[String]] = column[Option[String]]("Select3", O.Length(255,varying=true))
    /** Database column Answer3 SqlType(INTEGER) */
    val answer3: Rep[Option[Int]] = column[Option[Int]]("Answer3")
    /** Database column Select4 SqlType(VARCHAR), Length(255,true) */
    val select4: Rep[Option[String]] = column[Option[String]]("Select4", O.Length(255,varying=true))
    /** Database column Answer4 SqlType(INTEGER) */
    val answer4: Rep[Option[Int]] = column[Option[Int]]("Answer4")
    /** Database column Select5 SqlType(VARCHAR), Length(255,true) */
    val select5: Rep[Option[String]] = column[Option[String]]("Select5", O.Length(255,varying=true))
    /** Database column Answer5 SqlType(INTEGER) */
    val answer5: Rep[Option[Int]] = column[Option[Int]]("Answer5")
    /** Database column Select6 SqlType(VARCHAR), Length(255,true) */
    val select6: Rep[Option[String]] = column[Option[String]]("Select6", O.Length(255,varying=true))
    /** Database column Answer6 SqlType(INTEGER) */
    val answer6: Rep[Option[Int]] = column[Option[Int]]("Answer6")
    /** Database column Select7 SqlType(VARCHAR), Length(255,true) */
    val select7: Rep[Option[String]] = column[Option[String]]("Select7", O.Length(255,varying=true))
    /** Database column Answer7 SqlType(INTEGER) */
    val answer7: Rep[Option[Int]] = column[Option[Int]]("Answer7")
    /** Database column Select8 SqlType(VARCHAR), Length(255,true) */
    val select8: Rep[Option[String]] = column[Option[String]]("Select8", O.Length(255,varying=true))
    /** Database column Answer8 SqlType(INTEGER) */
    val answer8: Rep[Option[Int]] = column[Option[Int]]("Answer8")
    /** Database column VoteTime SqlType(TIMESTAMP) */
    val votetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("VoteTime")
    /** Database column EndTime SqlType(TIMESTAMP) */
    val endtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EndTime")
    /** Database column VoteType SqlType(VARCHAR), Length(10,true) */
    val votetype: Rep[Option[String]] = column[Option[String]]("VoteType", O.Length(10,varying=true))
    /** Database column IsSelected SqlType(BOOLEAN) */
    val isselected: Rep[Boolean] = column[Boolean]("IsSelected")
    /** Database column ChannelID SqlType(INTEGER) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID")
    /** Database column IsItem SqlType(BOOLEAN) */
    val isitem: Rep[Option[Boolean]] = column[Option[Boolean]]("IsItem")
    /** Database column Select9 SqlType(VARCHAR), Length(255,true) */
    val select9: Rep[Option[String]] = column[Option[String]]("Select9", O.Length(255,varying=true))
    /** Database column Select10 SqlType(VARCHAR), Length(255,true) */
    val select10: Rep[Option[String]] = column[Option[String]]("Select10", O.Length(255,varying=true))
    /** Database column Select11 SqlType(VARCHAR), Length(255,true) */
    val select11: Rep[Option[String]] = column[Option[String]]("Select11", O.Length(255,varying=true))
    /** Database column Select12 SqlType(VARCHAR), Length(255,true) */
    val select12: Rep[Option[String]] = column[Option[String]]("Select12", O.Length(255,varying=true))
    /** Database column Select13 SqlType(VARCHAR), Length(255,true) */
    val select13: Rep[Option[String]] = column[Option[String]]("Select13", O.Length(255,varying=true))
    /** Database column Select14 SqlType(VARCHAR), Length(255,true) */
    val select14: Rep[Option[String]] = column[Option[String]]("Select14", O.Length(255,varying=true))
    /** Database column Select15 SqlType(VARCHAR), Length(255,true) */
    val select15: Rep[Option[String]] = column[Option[String]]("Select15", O.Length(255,varying=true))
    /** Database column Select16 SqlType(VARCHAR), Length(255,true) */
    val select16: Rep[Option[String]] = column[Option[String]]("Select16", O.Length(255,varying=true))
    /** Database column Select17 SqlType(VARCHAR), Length(255,true) */
    val select17: Rep[Option[String]] = column[Option[String]]("Select17", O.Length(255,varying=true))
    /** Database column Select18 SqlType(VARCHAR), Length(255,true) */
    val select18: Rep[Option[String]] = column[Option[String]]("Select18", O.Length(255,varying=true))
    /** Database column Select19 SqlType(VARCHAR), Length(255,true) */
    val select19: Rep[Option[String]] = column[Option[String]]("Select19", O.Length(255,varying=true))
    /** Database column Select20 SqlType(VARCHAR), Length(255,true) */
    val select20: Rep[Option[String]] = column[Option[String]]("Select20", O.Length(255,varying=true))
    /** Database column Answer9 SqlType(INTEGER) */
    val answer9: Rep[Option[Int]] = column[Option[Int]]("Answer9")
    /** Database column Answer10 SqlType(INTEGER) */
    val answer10: Rep[Option[Int]] = column[Option[Int]]("Answer10")
    /** Database column Answer11 SqlType(INTEGER) */
    val answer11: Rep[Option[Int]] = column[Option[Int]]("Answer11")
    /** Database column Answer12 SqlType(INTEGER) */
    val answer12: Rep[Option[Int]] = column[Option[Int]]("Answer12")
    /** Database column Answer13 SqlType(INTEGER) */
    val answer13: Rep[Option[Int]] = column[Option[Int]]("Answer13")
    /** Database column Answer14 SqlType(INTEGER) */
    val answer14: Rep[Option[Int]] = column[Option[Int]]("Answer14")
    /** Database column Answer15 SqlType(INTEGER) */
    val answer15: Rep[Option[Int]] = column[Option[Int]]("Answer15")
    /** Database column Answer16 SqlType(INTEGER) */
    val answer16: Rep[Option[Int]] = column[Option[Int]]("Answer16")
    /** Database column Answer17 SqlType(INTEGER) */
    val answer17: Rep[Option[Int]] = column[Option[Int]]("Answer17")
    /** Database column Answer18 SqlType(INTEGER) */
    val answer18: Rep[Option[Int]] = column[Option[Int]]("Answer18")
    /** Database column Answer19 SqlType(INTEGER) */
    val answer19: Rep[Option[Int]] = column[Option[Int]]("Answer19")
    /** Database column Answer20 SqlType(INTEGER) */
    val answer20: Rep[Option[Int]] = column[Option[Int]]("Answer20")
    /** Database column VoteNum SqlType(INTEGER) */
    val votenum: Rep[Int] = column[Int]("VoteNum")

    /** Index over (channelid) (database name PE_VOTE_CHANNELID) */
    val index1 = index("PE_VOTE_CHANNELID", channelid)
  }
  /** Collection-like TableQuery object for table PeVote */
  lazy val PeVote = new TableQuery(tag => new PeVote(tag))
}
