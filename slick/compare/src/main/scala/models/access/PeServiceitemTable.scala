package models.access
// AUTO-GENERATED Slick data model for table PeServiceitem
trait PeServiceitemTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeServiceitem
   *  @param itemid Database column ItemID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param clientid Database column ClientID SqlType(INTEGER), Default(Some(0))
   *  @param contacterid Database column ContacterID SqlType(INTEGER), Default(Some(0))
   *  @param orderformid Database column OrderFormID SqlType(INTEGER), Default(Some(0))
   *  @param servicetime Database column ServiceTime SqlType(TIMESTAMP)
   *  @param servicetype Database column ServiceType SqlType(VARCHAR), Length(50,true)
   *  @param servicemode Database column ServiceMode SqlType(VARCHAR), Length(50,true)
   *  @param servicetitle Database column ServiceTitle SqlType(VARCHAR), Length(50,true)
   *  @param servicecontent Database column ServiceContent SqlType(VARCHAR), Length(16777216,true)
   *  @param serviceresult Database column ServiceResult SqlType(INTEGER), Default(Some(0))
   *  @param taketime Database column TakeTime SqlType(INTEGER), Default(Some(0))
   *  @param processor Database column Processor SqlType(VARCHAR), Length(50,true)
   *  @param inputer Database column Inputer SqlType(VARCHAR), Length(50,true)
   *  @param feedback Database column Feedback SqlType(VARCHAR), Length(16777216,true)
   *  @param confirmtime Database column ConfirmTime SqlType(TIMESTAMP)
   *  @param confirmcaller Database column ConfirmCaller SqlType(VARCHAR), Length(50,true)
   *  @param confirmscore Database column ConfirmScore SqlType(INTEGER), Default(Some(0))
   *  @param confirmfeedback Database column ConfirmFeedback SqlType(VARCHAR), Length(16777216,true)
   *  @param remark Database column Remark SqlType(VARCHAR), Length(16777216,true) */
  case class PeServiceitemRow(itemid: Int, clientid: Option[Int] = Some(0), contacterid: Option[Int] = Some(0), orderformid: Option[Int] = Some(0), servicetime: Option[java.sql.Timestamp], servicetype: Option[String], servicemode: Option[String], servicetitle: Option[String], servicecontent: Option[String], serviceresult: Option[Int] = Some(0), taketime: Option[Int] = Some(0), processor: Option[String], inputer: Option[String], feedback: Option[String], confirmtime: Option[java.sql.Timestamp], confirmcaller: Option[String], confirmscore: Option[Int] = Some(0), confirmfeedback: Option[String], remark: Option[String])
  /** GetResult implicit for fetching PeServiceitemRow objects using plain SQL queries */

  /** Table description of table PE_ServiceItem. Objects of this class serve as prototypes for rows in queries. */
  class PeServiceitem(_tableTag: Tag) extends profile.api.Table[PeServiceitemRow](_tableTag, "PE_ServiceItem") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ItemID SqlType(INTEGER), AutoInc, PrimaryKey */
    val itemid: Rep[Int] = column[Int]("ItemID", O.AutoInc, O.PrimaryKey)
    /** Database column ClientID SqlType(INTEGER), Default(Some(0)) */
    val clientid: Rep[Option[Int]] = column[Option[Int]]("ClientID", O.Default(Some(0)))
    /** Database column ContacterID SqlType(INTEGER), Default(Some(0)) */
    val contacterid: Rep[Option[Int]] = column[Option[Int]]("ContacterID", O.Default(Some(0)))
    /** Database column OrderFormID SqlType(INTEGER), Default(Some(0)) */
    val orderformid: Rep[Option[Int]] = column[Option[Int]]("OrderFormID", O.Default(Some(0)))
    /** Database column ServiceTime SqlType(TIMESTAMP) */
    val servicetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ServiceTime")
    /** Database column ServiceType SqlType(VARCHAR), Length(50,true) */
    val servicetype: Rep[Option[String]] = column[Option[String]]("ServiceType", O.Length(50,varying=true))
    /** Database column ServiceMode SqlType(VARCHAR), Length(50,true) */
    val servicemode: Rep[Option[String]] = column[Option[String]]("ServiceMode", O.Length(50,varying=true))
    /** Database column ServiceTitle SqlType(VARCHAR), Length(50,true) */
    val servicetitle: Rep[Option[String]] = column[Option[String]]("ServiceTitle", O.Length(50,varying=true))
    /** Database column ServiceContent SqlType(VARCHAR), Length(16777216,true) */
    val servicecontent: Rep[Option[String]] = column[Option[String]]("ServiceContent", O.Length(16777216,varying=true))
    /** Database column ServiceResult SqlType(INTEGER), Default(Some(0)) */
    val serviceresult: Rep[Option[Int]] = column[Option[Int]]("ServiceResult", O.Default(Some(0)))
    /** Database column TakeTime SqlType(INTEGER), Default(Some(0)) */
    val taketime: Rep[Option[Int]] = column[Option[Int]]("TakeTime", O.Default(Some(0)))
    /** Database column Processor SqlType(VARCHAR), Length(50,true) */
    val processor: Rep[Option[String]] = column[Option[String]]("Processor", O.Length(50,varying=true))
    /** Database column Inputer SqlType(VARCHAR), Length(50,true) */
    val inputer: Rep[Option[String]] = column[Option[String]]("Inputer", O.Length(50,varying=true))
    /** Database column Feedback SqlType(VARCHAR), Length(16777216,true) */
    val feedback: Rep[Option[String]] = column[Option[String]]("Feedback", O.Length(16777216,varying=true))
    /** Database column ConfirmTime SqlType(TIMESTAMP) */
    val confirmtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ConfirmTime")
    /** Database column ConfirmCaller SqlType(VARCHAR), Length(50,true) */
    val confirmcaller: Rep[Option[String]] = column[Option[String]]("ConfirmCaller", O.Length(50,varying=true))
    /** Database column ConfirmScore SqlType(INTEGER), Default(Some(0)) */
    val confirmscore: Rep[Option[Int]] = column[Option[Int]]("ConfirmScore", O.Default(Some(0)))
    /** Database column ConfirmFeedback SqlType(VARCHAR), Length(16777216,true) */
    val confirmfeedback: Rep[Option[String]] = column[Option[String]]("ConfirmFeedback", O.Length(16777216,varying=true))
    /** Database column Remark SqlType(VARCHAR), Length(16777216,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(16777216,varying=true))

    /** Index over (clientid) (database name PE_SERVICEITEM_CLIENTID) */
    val index1 = index("PE_SERVICEITEM_CLIENTID", clientid)
    /** Index over (contacterid) (database name PE_SERVICEITEM_CONTACTERID) */
    val index2 = index("PE_SERVICEITEM_CONTACTERID", contacterid)
    /** Index over (orderformid) (database name PE_SERVICEITEM_ORDERFORMID) */
    val index3 = index("PE_SERVICEITEM_ORDERFORMID", orderformid)
  }
  /** Collection-like TableQuery object for table PeServiceitem */
  lazy val PeServiceitem = new TableQuery(tag => new PeServiceitem(tag))
}
