package models.access
// AUTO-GENERATED Slick data model for table PePosition
trait PePositionTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PePosition
    *  @param positionid Database column PositionID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param jobcategoryid Database column JobCategoryID SqlType(INTEGER), Default(Some(0))
    *  @param subcompanyid Database column SubCompanyID SqlType(INTEGER), Default(Some(0))
    *  @param workplaceid Database column WorkPlaceID SqlType(INTEGER), Default(Some(0))
    *  @param releasedate Database column ReleaseDate SqlType(TIMESTAMP)
    *  @param positionname Database column PositionName SqlType(VARCHAR), Length(50,true)
    *  @param positionnum Database column PositionNum SqlType(INTEGER), Default(Some(0))
    *  @param validdate Database column ValidDate SqlType(INTEGER), Default(Some(0))
    *  @param positionkeyword Database column PositionKeyword SqlType(VARCHAR), Length(50,true)
    *  @param positiondescription Database column PositionDescription SqlType(VARCHAR), Length(16777216,true)
    *  @param dutyrequest Database column DutyRequest SqlType(VARCHAR), Length(16777216,true)
    *  @param positionstatus Database column PositionStatus SqlType(INTEGER), Default(Some(0))
    *  @param subcompanyname Database column SubCompanyName SqlType(VARCHAR), Length(50,true)
    *  @param urgent Database column Urgent SqlType(INTEGER), Default(Some(0)) */
  case class PePositionRow(
    positionid: Int = 0,
    jobcategoryid: Option[Int] = Some(0),
    subcompanyid: Option[Int] = Some(0),
    workplaceid: Option[Int] = Some(0),
    releasedate: Option[java.sql.Timestamp],
    positionname: Option[String],
    positionnum: Option[Int] = Some(0),
    validdate: Option[Int] = Some(0),
    positionkeyword: Option[String],
    positiondescription: Option[String],
    dutyrequest: Option[String],
    positionstatus: Option[Int] = Some(0),
    subcompanyname: Option[String],
    urgent: Option[Int] = Some(0)
  )

  /** GetResult implicit for fetching PePositionRow objects using plain SQL queries */
  /** Table description of table PE_Position. Objects of this class serve as prototypes for rows in queries. */
  class PePosition(_tableTag: Tag) extends profile.api.Table[PePositionRow](_tableTag, "PE_Position") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column PositionID SqlType(INTEGER), PrimaryKey, Default(0) */
    val positionid: Rep[Int] = column[Int]("PositionID", O.PrimaryKey, O.Default(0))

    /** Database column JobCategoryID SqlType(INTEGER), Default(Some(0)) */
    val jobcategoryid: Rep[Option[Int]] = column[Option[Int]]("JobCategoryID", O.Default(Some(0)))

    /** Database column SubCompanyID SqlType(INTEGER), Default(Some(0)) */
    val subcompanyid: Rep[Option[Int]] = column[Option[Int]]("SubCompanyID", O.Default(Some(0)))

    /** Database column WorkPlaceID SqlType(INTEGER), Default(Some(0)) */
    val workplaceid: Rep[Option[Int]] = column[Option[Int]]("WorkPlaceID", O.Default(Some(0)))

    /** Database column ReleaseDate SqlType(TIMESTAMP) */
    val releasedate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ReleaseDate")

    /** Database column PositionName SqlType(VARCHAR), Length(50,true) */
    val positionname: Rep[Option[String]] = column[Option[String]]("PositionName", O.Length(50, varying = true))

    /** Database column PositionNum SqlType(INTEGER), Default(Some(0)) */
    val positionnum: Rep[Option[Int]] = column[Option[Int]]("PositionNum", O.Default(Some(0)))

    /** Database column ValidDate SqlType(INTEGER), Default(Some(0)) */
    val validdate: Rep[Option[Int]] = column[Option[Int]]("ValidDate", O.Default(Some(0)))

    /** Database column PositionKeyword SqlType(VARCHAR), Length(50,true) */
    val positionkeyword: Rep[Option[String]] = column[Option[String]]("PositionKeyword", O.Length(50, varying = true))

    /** Database column PositionDescription SqlType(VARCHAR), Length(16777216,true) */
    val positiondescription: Rep[Option[String]] = column[Option[String]]("PositionDescription", O.Length(16777216, varying = true))

    /** Database column DutyRequest SqlType(VARCHAR), Length(16777216,true) */
    val dutyrequest: Rep[Option[String]] = column[Option[String]]("DutyRequest", O.Length(16777216, varying = true))

    /** Database column PositionStatus SqlType(INTEGER), Default(Some(0)) */
    val positionstatus: Rep[Option[Int]] = column[Option[Int]]("PositionStatus", O.Default(Some(0)))

    /** Database column SubCompanyName SqlType(VARCHAR), Length(50,true) */
    val subcompanyname: Rep[Option[String]] = column[Option[String]]("SubCompanyName", O.Length(50, varying = true))

    /** Database column Urgent SqlType(INTEGER), Default(Some(0)) */
    val urgent: Rep[Option[Int]] = column[Option[Int]]("Urgent", O.Default(Some(0)))

    /** Index over (jobcategoryid) (database name PE_POSITION_JOBCATEGORYID) */
    val index1 = index("PE_POSITION_JOBCATEGORYID", jobcategoryid)

    /** Index over (positionnum) (database name PE_POSITION_POSITIONNUM) */
    val index2 = index("PE_POSITION_POSITIONNUM", positionnum)

    /** Index over (subcompanyid) (database name PE_POSITION_SUBCOMPANYID) */
    val index3 = index("PE_POSITION_SUBCOMPANYID", subcompanyid)

    /** Index over (workplaceid) (database name PE_POSITION_WORKPLACEID) */
    val index4 = index("PE_POSITION_WORKPLACEID", workplaceid)
  }

  /** Collection-like TableQuery object for table PePosition */
  lazy val PePosition = new TableQuery(tag => new PePosition(tag))
}
