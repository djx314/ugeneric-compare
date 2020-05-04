package models.access
// AUTO-GENERATED Slick data model for table PeUseddetail
trait PeUseddetailTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeUseddetail
   *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param equipmentid Database column EquipmentID SqlType(INTEGER), Default(Some(0))
   *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
   *  @param usertype Database column UserType SqlType(INTEGER), Default(Some(0))
   *  @param useryear Database column UserYear SqlType(INTEGER)
   *  @param userclass Database column UserClass SqlType(VARCHAR), Length(50,true)
   *  @param lessoninfo Database column LessonInfo SqlType(VARCHAR), Length(16777216,true)
   *  @param lessonnumber Database column LessonNumber SqlType(INTEGER)
   *  @param lessonyear Database column LessonYear SqlType(INTEGER), Default(Some(0))
   *  @param lessonmonth Database column LessonMonth SqlType(INTEGER), Default(Some(0))
   *  @param lessonday Database column LessonDay SqlType(INTEGER), Default(Some(0))
   *  @param registertime Database column RegisterTime SqlType(TIMESTAMP)
   *  @param registerip Database column RegisterIP SqlType(VARCHAR), Length(50,true)
   *  @param used Database column Used SqlType(INTEGER), Default(Some(0)) */
  case class PeUseddetailRow(id: Int, equipmentid: Option[Int] = Some(0), username: Option[String], usertype: Option[Int] = Some(0), useryear: Option[Int], userclass: Option[String], lessoninfo: Option[String], lessonnumber: Option[Int], lessonyear: Option[Int] = Some(0), lessonmonth: Option[Int] = Some(0), lessonday: Option[Int] = Some(0), registertime: Option[java.sql.Timestamp], registerip: Option[String], used: Option[Int] = Some(0))
  /** GetResult implicit for fetching PeUseddetailRow objects using plain SQL queries */

  /** Table description of table PE_UsedDetail. Objects of this class serve as prototypes for rows in queries. */
  class PeUseddetail(_tableTag: Tag) extends profile.api.Table[PeUseddetailRow](_tableTag, "PE_UsedDetail") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column EquipmentID SqlType(INTEGER), Default(Some(0)) */
    val equipmentid: Rep[Option[Int]] = column[Option[Int]]("EquipmentID", O.Default(Some(0)))
    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(50,varying=true))
    /** Database column UserType SqlType(INTEGER), Default(Some(0)) */
    val usertype: Rep[Option[Int]] = column[Option[Int]]("UserType", O.Default(Some(0)))
    /** Database column UserYear SqlType(INTEGER) */
    val useryear: Rep[Option[Int]] = column[Option[Int]]("UserYear")
    /** Database column UserClass SqlType(VARCHAR), Length(50,true) */
    val userclass: Rep[Option[String]] = column[Option[String]]("UserClass", O.Length(50,varying=true))
    /** Database column LessonInfo SqlType(VARCHAR), Length(16777216,true) */
    val lessoninfo: Rep[Option[String]] = column[Option[String]]("LessonInfo", O.Length(16777216,varying=true))
    /** Database column LessonNumber SqlType(INTEGER) */
    val lessonnumber: Rep[Option[Int]] = column[Option[Int]]("LessonNumber")
    /** Database column LessonYear SqlType(INTEGER), Default(Some(0)) */
    val lessonyear: Rep[Option[Int]] = column[Option[Int]]("LessonYear", O.Default(Some(0)))
    /** Database column LessonMonth SqlType(INTEGER), Default(Some(0)) */
    val lessonmonth: Rep[Option[Int]] = column[Option[Int]]("LessonMonth", O.Default(Some(0)))
    /** Database column LessonDay SqlType(INTEGER), Default(Some(0)) */
    val lessonday: Rep[Option[Int]] = column[Option[Int]]("LessonDay", O.Default(Some(0)))
    /** Database column RegisterTime SqlType(TIMESTAMP) */
    val registertime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("RegisterTime")
    /** Database column RegisterIP SqlType(VARCHAR), Length(50,true) */
    val registerip: Rep[Option[String]] = column[Option[String]]("RegisterIP", O.Length(50,varying=true))
    /** Database column Used SqlType(INTEGER), Default(Some(0)) */
    val used: Rep[Option[Int]] = column[Option[Int]]("Used", O.Default(Some(0)))

    /** Index over (equipmentid) (database name PE_USEDDETAIL_FACILITYNUM) */
    val index1 = index("PE_USEDDETAIL_FACILITYNUM", equipmentid)
    /** Index over (lessonnumber) (database name PE_USEDDETAIL_LESSIONNUM) */
    val index2 = index("PE_USEDDETAIL_LESSIONNUM", lessonnumber)
  }
  /** Collection-like TableQuery object for table PeUseddetail */
  lazy val PeUseddetail = new TableQuery(tag => new PeUseddetail(tag))
}
