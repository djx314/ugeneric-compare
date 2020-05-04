package models.access
// AUTO-GENERATED Slick data model for table PeComplainitem
trait PeComplainitemTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeComplainitem
    *  @param itemid Database column ItemID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param clientid Database column ClientID SqlType(INTEGER), Default(Some(0))
    *  @param contacterid Database column ContacterID SqlType(INTEGER), Default(Some(0))
    *  @param complaintype Database column ComplainType SqlType(INTEGER), Default(Some(0))
    *  @param complainmode Database column ComplainMode SqlType(INTEGER), Default(Some(0))
    *  @param title Database column Title SqlType(VARCHAR), Length(50,true)
    *  @param content Database column Content SqlType(VARCHAR), Length(16777216,true)
    *  @param firstreceiver Database column FirstReceiver SqlType(VARCHAR), Length(50,true)
    *  @param dateandtime Database column DateAndTime SqlType(TIMESTAMP)
    *  @param magnitudeofexigence Database column MagnitudeOfExigence SqlType(INTEGER), Default(Some(0))
    *  @param process Database column Process SqlType(VARCHAR), Length(16777216,true)
    *  @param processor Database column Processor SqlType(VARCHAR), Length(50,true)
    *  @param result Database column Result SqlType(VARCHAR), Length(50,true)
    *  @param endtime Database column EndTime SqlType(TIMESTAMP)
    *  @param feedback Database column Feedback SqlType(VARCHAR), Length(255,true)
    *  @param confirmtime Database column ConfirmTime SqlType(TIMESTAMP)
    *  @param confirmcaller Database column ConfirmCaller SqlType(VARCHAR), Length(50,true)
    *  @param confirmscore Database column ConfirmScore SqlType(INTEGER), Default(Some(0))
    *  @param confirmfeedback Database column ConfirmFeedback SqlType(VARCHAR), Length(255,true)
    *  @param status Database column Status SqlType(INTEGER), Default(Some(0))
    *  @param currentowner Database column CurrentOwner SqlType(VARCHAR), Length(50,true)
    *  @param remark Database column Remark SqlType(VARCHAR), Length(255,true)
    *  @param defendant Database column Defendant SqlType(VARCHAR), Length(50,true) */
  case class PeComplainitemRow(
    itemid: Int,
    clientid: Option[Int] = Some(0),
    contacterid: Option[Int] = Some(0),
    complaintype: Option[Int] = Some(0),
    complainmode: Option[Int] = Some(0),
    title: Option[String],
    content: Option[String],
    firstreceiver: Option[String],
    dateandtime: Option[java.sql.Timestamp],
    magnitudeofexigence: Option[Int] = Some(0),
    process: Option[String],
    processor: Option[String],
    result: Option[String],
    endtime: Option[java.sql.Timestamp],
    feedback: Option[String],
    confirmtime: Option[java.sql.Timestamp],
    confirmcaller: Option[String],
    confirmscore: Option[Int] = Some(0),
    confirmfeedback: Option[String],
    status: Option[Int] = Some(0),
    currentowner: Option[String],
    remark: Option[String],
    defendant: Option[String]
  )

  /** GetResult implicit for fetching PeComplainitemRow objects using plain SQL queries */
  /** Table description of table PE_ComplainItem. Objects of this class serve as prototypes for rows in queries. */
  class PeComplainitem(_tableTag: Tag) extends profile.api.Table[PeComplainitemRow](_tableTag, "PE_ComplainItem") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ItemID SqlType(INTEGER), AutoInc, PrimaryKey */
    val itemid: Rep[Int] = column[Int]("ItemID", O.AutoInc, O.PrimaryKey)

    /** Database column ClientID SqlType(INTEGER), Default(Some(0)) */
    val clientid: Rep[Option[Int]] = column[Option[Int]]("ClientID", O.Default(Some(0)))

    /** Database column ContacterID SqlType(INTEGER), Default(Some(0)) */
    val contacterid: Rep[Option[Int]] = column[Option[Int]]("ContacterID", O.Default(Some(0)))

    /** Database column ComplainType SqlType(INTEGER), Default(Some(0)) */
    val complaintype: Rep[Option[Int]] = column[Option[Int]]("ComplainType", O.Default(Some(0)))

    /** Database column ComplainMode SqlType(INTEGER), Default(Some(0)) */
    val complainmode: Rep[Option[Int]] = column[Option[Int]]("ComplainMode", O.Default(Some(0)))

    /** Database column Title SqlType(VARCHAR), Length(50,true) */
    val title: Rep[Option[String]] = column[Option[String]]("Title", O.Length(50, varying = true))

    /** Database column Content SqlType(VARCHAR), Length(16777216,true) */
    val content: Rep[Option[String]] = column[Option[String]]("Content", O.Length(16777216, varying = true))

    /** Database column FirstReceiver SqlType(VARCHAR), Length(50,true) */
    val firstreceiver: Rep[Option[String]] = column[Option[String]]("FirstReceiver", O.Length(50, varying = true))

    /** Database column DateAndTime SqlType(TIMESTAMP) */
    val dateandtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("DateAndTime")

    /** Database column MagnitudeOfExigence SqlType(INTEGER), Default(Some(0)) */
    val magnitudeofexigence: Rep[Option[Int]] = column[Option[Int]]("MagnitudeOfExigence", O.Default(Some(0)))

    /** Database column Process SqlType(VARCHAR), Length(16777216,true) */
    val process: Rep[Option[String]] = column[Option[String]]("Process", O.Length(16777216, varying = true))

    /** Database column Processor SqlType(VARCHAR), Length(50,true) */
    val processor: Rep[Option[String]] = column[Option[String]]("Processor", O.Length(50, varying = true))

    /** Database column Result SqlType(VARCHAR), Length(50,true) */
    val result: Rep[Option[String]] = column[Option[String]]("Result", O.Length(50, varying = true))

    /** Database column EndTime SqlType(TIMESTAMP) */
    val endtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EndTime")

    /** Database column Feedback SqlType(VARCHAR), Length(255,true) */
    val feedback: Rep[Option[String]] = column[Option[String]]("Feedback", O.Length(255, varying = true))

    /** Database column ConfirmTime SqlType(TIMESTAMP) */
    val confirmtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ConfirmTime")

    /** Database column ConfirmCaller SqlType(VARCHAR), Length(50,true) */
    val confirmcaller: Rep[Option[String]] = column[Option[String]]("ConfirmCaller", O.Length(50, varying = true))

    /** Database column ConfirmScore SqlType(INTEGER), Default(Some(0)) */
    val confirmscore: Rep[Option[Int]] = column[Option[Int]]("ConfirmScore", O.Default(Some(0)))

    /** Database column ConfirmFeedback SqlType(VARCHAR), Length(255,true) */
    val confirmfeedback: Rep[Option[String]] = column[Option[String]]("ConfirmFeedback", O.Length(255, varying = true))

    /** Database column Status SqlType(INTEGER), Default(Some(0)) */
    val status: Rep[Option[Int]] = column[Option[Int]]("Status", O.Default(Some(0)))

    /** Database column CurrentOwner SqlType(VARCHAR), Length(50,true) */
    val currentowner: Rep[Option[String]] = column[Option[String]]("CurrentOwner", O.Length(50, varying = true))

    /** Database column Remark SqlType(VARCHAR), Length(255,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(255, varying = true))

    /** Database column Defendant SqlType(VARCHAR), Length(50,true) */
    val defendant: Rep[Option[String]] = column[Option[String]]("Defendant", O.Length(50, varying = true))

    /** Index over (contacterid) (database name PE_COMPLAINITEM_CONTACTERID) */
    val index1 = index("PE_COMPLAINITEM_CONTACTERID", contacterid)

    /** Index over (clientid) (database name PE_COMPLAINITEM_USERID) */
    val index2 = index("PE_COMPLAINITEM_USERID", clientid)
  }

  /** Collection-like TableQuery object for table PeComplainitem */
  lazy val PeComplainitem = new TableQuery(tag => new PeComplainitem(tag))
}
