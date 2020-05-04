package models.access
// AUTO-GENERATED Slick data model for table PeGuestbook
trait PeGuestbookTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeGuestbook
    *  @param guestid Database column GuestID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param kindid Database column KindID SqlType(INTEGER), Default(Some(0))
    *  @param topicid Database column TopicID SqlType(INTEGER), Default(Some(0))
    *  @param guestmaxid Database column GuestMaxID SqlType(INTEGER)
    *  @param guesttype Database column GuestType SqlType(INTEGER)
    *  @param guestname Database column GuestName SqlType(VARCHAR), Length(50,true)
    *  @param guestsex Database column GuestSex SqlType(VARCHAR), Length(10,true)
    *  @param guestoicq Database column GuestOicq SqlType(VARCHAR), Length(20,true)
    *  @param guestmsn Database column GuestMsn SqlType(VARCHAR), Length(50,true)
    *  @param guesticq Database column GuestIcq SqlType(VARCHAR), Length(20,true)
    *  @param guestemail Database column GuestEmail SqlType(VARCHAR), Length(255,true)
    *  @param guesthomepage Database column GuestHomepage SqlType(VARCHAR), Length(255,true)
    *  @param guestimages Database column GuestImages SqlType(VARCHAR), Length(10,true)
    *  @param guestface Database column GuestFace SqlType(VARCHAR), Length(10,true)
    *  @param guestip Database column GuestIP SqlType(VARCHAR), Length(50,true)
    *  @param guesttitle Database column GuestTitle SqlType(VARCHAR), Length(255,true)
    *  @param guestcontent Database column GuestContent SqlType(VARCHAR), Length(16777216,true)
    *  @param guestdatetime Database column GuestDatetime SqlType(TIMESTAMP)
    *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0))
    *  @param replynum Database column ReplyNum SqlType(INTEGER), Default(Some(0))
    *  @param lastreplycontent Database column LastReplyContent SqlType(VARCHAR), Length(16777216,true)
    *  @param lastreplyguest Database column LastReplyGuest SqlType(VARCHAR), Length(50,true)
    *  @param lastreplytime Database column LastReplyTime SqlType(TIMESTAMP)
    *  @param lastreplytitle Database column LastReplyTitle SqlType(VARCHAR), Length(255,true)
    *  @param guestreply Database column GuestReply SqlType(VARCHAR), Length(16777216,true)
    *  @param guestreplyadmin Database column GuestReplyAdmin SqlType(VARCHAR), Length(50,true)
    *  @param guestreplydatetime Database column GuestReplyDatetime SqlType(TIMESTAMP)
    *  @param quintessence Database column Quintessence SqlType(INTEGER), Default(Some(0))
    *  @param guestispassed Database column GuestIsPassed SqlType(BOOLEAN)
    *  @param guestisprivate Database column GuestIsPrivate SqlType(BOOLEAN)
    *  @param ontop Database column OnTop SqlType(INTEGER), Default(Some(0))
    *  @param replyisprivate Database column ReplyIsPrivate SqlType(BOOLEAN)
    *  @param guestcontentlength Database column GuestContentLength SqlType(INTEGER), Default(Some(0)) */
  case class PeGuestbookRow(
    guestid: Int = 0,
    kindid: Option[Int] = Some(0),
    topicid: Option[Int] = Some(0),
    guestmaxid: Option[Int],
    guesttype: Option[Int],
    guestname: Option[String],
    guestsex: Option[String],
    guestoicq: Option[String],
    guestmsn: Option[String],
    guesticq: Option[String],
    guestemail: Option[String],
    guesthomepage: Option[String],
    guestimages: Option[String],
    guestface: Option[String],
    guestip: Option[String],
    guesttitle: Option[String],
    guestcontent: Option[String],
    guestdatetime: Option[java.sql.Timestamp],
    hits: Option[Int] = Some(0),
    replynum: Option[Int] = Some(0),
    lastreplycontent: Option[String],
    lastreplyguest: Option[String],
    lastreplytime: Option[java.sql.Timestamp],
    lastreplytitle: Option[String],
    guestreply: Option[String],
    guestreplyadmin: Option[String],
    guestreplydatetime: Option[java.sql.Timestamp],
    quintessence: Option[Int] = Some(0),
    guestispassed: Boolean,
    guestisprivate: Boolean,
    ontop: Option[Int] = Some(0),
    replyisprivate: Boolean,
    guestcontentlength: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PeGuestbookRow objects using plain SQL queries */
  /** Table description of table PE_GuestBook. Objects of this class serve as prototypes for rows in queries. */
  class PeGuestbook(_tableTag: Tag) extends profile.api.Table[PeGuestbookRow](_tableTag, "PE_GuestBook") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column GuestID SqlType(INTEGER), PrimaryKey, Default(0) */
    val guestid: Rep[Int] = column[Int]("GuestID", O.PrimaryKey, O.Default(0))

    /** Database column KindID SqlType(INTEGER), Default(Some(0)) */
    val kindid: Rep[Option[Int]] = column[Option[Int]]("KindID", O.Default(Some(0)))

    /** Database column TopicID SqlType(INTEGER), Default(Some(0)) */
    val topicid: Rep[Option[Int]] = column[Option[Int]]("TopicID", O.Default(Some(0)))

    /** Database column GuestMaxID SqlType(INTEGER) */
    val guestmaxid: Rep[Option[Int]] = column[Option[Int]]("GuestMaxID")

    /** Database column GuestType SqlType(INTEGER) */
    val guesttype: Rep[Option[Int]] = column[Option[Int]]("GuestType")

    /** Database column GuestName SqlType(VARCHAR), Length(50,true) */
    val guestname: Rep[Option[String]] = column[Option[String]]("GuestName", O.Length(50, varying = true))

    /** Database column GuestSex SqlType(VARCHAR), Length(10,true) */
    val guestsex: Rep[Option[String]] = column[Option[String]]("GuestSex", O.Length(10, varying = true))

    /** Database column GuestOicq SqlType(VARCHAR), Length(20,true) */
    val guestoicq: Rep[Option[String]] = column[Option[String]]("GuestOicq", O.Length(20, varying = true))

    /** Database column GuestMsn SqlType(VARCHAR), Length(50,true) */
    val guestmsn: Rep[Option[String]] = column[Option[String]]("GuestMsn", O.Length(50, varying = true))

    /** Database column GuestIcq SqlType(VARCHAR), Length(20,true) */
    val guesticq: Rep[Option[String]] = column[Option[String]]("GuestIcq", O.Length(20, varying = true))

    /** Database column GuestEmail SqlType(VARCHAR), Length(255,true) */
    val guestemail: Rep[Option[String]] = column[Option[String]]("GuestEmail", O.Length(255, varying = true))

    /** Database column GuestHomepage SqlType(VARCHAR), Length(255,true) */
    val guesthomepage: Rep[Option[String]] = column[Option[String]]("GuestHomepage", O.Length(255, varying = true))

    /** Database column GuestImages SqlType(VARCHAR), Length(10,true) */
    val guestimages: Rep[Option[String]] = column[Option[String]]("GuestImages", O.Length(10, varying = true))

    /** Database column GuestFace SqlType(VARCHAR), Length(10,true) */
    val guestface: Rep[Option[String]] = column[Option[String]]("GuestFace", O.Length(10, varying = true))

    /** Database column GuestIP SqlType(VARCHAR), Length(50,true) */
    val guestip: Rep[Option[String]] = column[Option[String]]("GuestIP", O.Length(50, varying = true))

    /** Database column GuestTitle SqlType(VARCHAR), Length(255,true) */
    val guesttitle: Rep[Option[String]] = column[Option[String]]("GuestTitle", O.Length(255, varying = true))

    /** Database column GuestContent SqlType(VARCHAR), Length(16777216,true) */
    val guestcontent: Rep[Option[String]] = column[Option[String]]("GuestContent", O.Length(16777216, varying = true))

    /** Database column GuestDatetime SqlType(TIMESTAMP) */
    val guestdatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("GuestDatetime")

    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))

    /** Database column ReplyNum SqlType(INTEGER), Default(Some(0)) */
    val replynum: Rep[Option[Int]] = column[Option[Int]]("ReplyNum", O.Default(Some(0)))

    /** Database column LastReplyContent SqlType(VARCHAR), Length(16777216,true) */
    val lastreplycontent: Rep[Option[String]] = column[Option[String]]("LastReplyContent", O.Length(16777216, varying = true))

    /** Database column LastReplyGuest SqlType(VARCHAR), Length(50,true) */
    val lastreplyguest: Rep[Option[String]] = column[Option[String]]("LastReplyGuest", O.Length(50, varying = true))

    /** Database column LastReplyTime SqlType(TIMESTAMP) */
    val lastreplytime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastReplyTime")

    /** Database column LastReplyTitle SqlType(VARCHAR), Length(255,true) */
    val lastreplytitle: Rep[Option[String]] = column[Option[String]]("LastReplyTitle", O.Length(255, varying = true))

    /** Database column GuestReply SqlType(VARCHAR), Length(16777216,true) */
    val guestreply: Rep[Option[String]] = column[Option[String]]("GuestReply", O.Length(16777216, varying = true))

    /** Database column GuestReplyAdmin SqlType(VARCHAR), Length(50,true) */
    val guestreplyadmin: Rep[Option[String]] = column[Option[String]]("GuestReplyAdmin", O.Length(50, varying = true))

    /** Database column GuestReplyDatetime SqlType(TIMESTAMP) */
    val guestreplydatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("GuestReplyDatetime")

    /** Database column Quintessence SqlType(INTEGER), Default(Some(0)) */
    val quintessence: Rep[Option[Int]] = column[Option[Int]]("Quintessence", O.Default(Some(0)))

    /** Database column GuestIsPassed SqlType(BOOLEAN) */
    val guestispassed: Rep[Boolean] = column[Boolean]("GuestIsPassed")

    /** Database column GuestIsPrivate SqlType(BOOLEAN) */
    val guestisprivate: Rep[Boolean] = column[Boolean]("GuestIsPrivate")

    /** Database column OnTop SqlType(INTEGER), Default(Some(0)) */
    val ontop: Rep[Option[Int]] = column[Option[Int]]("OnTop", O.Default(Some(0)))

    /** Database column ReplyIsPrivate SqlType(BOOLEAN) */
    val replyisprivate: Rep[Boolean] = column[Boolean]("ReplyIsPrivate")

    /** Database column GuestContentLength SqlType(INTEGER), Default(Some(0)) */
    val guestcontentlength: Rep[Option[Int]] = column[Option[Int]]("GuestContentLength", O.Default(Some(0)))

    /** Index over (guestispassed) (database name PE_GUESTBOOK_GUESTISPASSED) */
    val index1 = index("PE_GUESTBOOK_GUESTISPASSED", guestispassed)

    /** Index over (guestmaxid) (database name PE_GUESTBOOK_GUESTMAXID) */
    val index2 = index("PE_GUESTBOOK_GUESTMAXID", guestmaxid)

    /** Index over (guesttype) (database name PE_GUESTBOOK_GUESTTYPE) */
    val index3 = index("PE_GUESTBOOK_GUESTTYPE", guesttype)

    /** Index over (kindid) (database name PE_GUESTBOOK_KINDID) */
    val index4 = index("PE_GUESTBOOK_KINDID", kindid)

    /** Index over (ontop) (database name PE_GUESTBOOK_ONTOP) */
    val index5 = index("PE_GUESTBOOK_ONTOP", ontop)

    /** Index over (quintessence) (database name PE_GUESTBOOK_QUINTESSENCE) */
    val index6 = index("PE_GUESTBOOK_QUINTESSENCE", quintessence)

    /** Index over (replynum) (database name PE_GUESTBOOK_REPLYNUM) */
    val index7 = index("PE_GUESTBOOK_REPLYNUM", replynum)

    /** Index over (topicid) (database name PE_GUESTBOOK_TOPICID) */
    val index8 = index("PE_GUESTBOOK_TOPICID", topicid)
  }

  /** Collection-like TableQuery object for table PeGuestbook */
  lazy val PeGuestbook = new TableQuery(tag => new PeGuestbook(tag))
}
