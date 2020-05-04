package models.access
// AUTO-GENERATED Slick data model for table PePositionsupplyinfo
trait PePositionsupplyinfoTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PePositionsupplyinfo
    *  @param positionsupplyinfoid Database column PositionSupplyInfoID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param username Database column UserName SqlType(VARCHAR), Length(50,true)
    *  @param positionid Database column PositionID SqlType(INTEGER), Default(Some(0))
    *  @param subcompanyid Database column SubCompanyID SqlType(INTEGER), Default(Some(0))
    *  @param workplaceid Database column WorkPlaceID SqlType(INTEGER), Default(Some(0))
    *  @param checkstatus Database column CheckStatus SqlType(INTEGER), Default(Some(0))
    *  @param checkdate Database column CheckDate SqlType(TIMESTAMP)
    *  @param supplydate Database column SupplyDate SqlType(TIMESTAMP) */
  case class PePositionsupplyinfoRow(
    positionsupplyinfoid: Int = 0,
    username: Option[String],
    positionid: Option[Int] = Some(0),
    subcompanyid: Option[Int] = Some(0),
    workplaceid: Option[Int] = Some(0),
    checkstatus: Option[Int] = Some(0),
    checkdate: Option[java.sql.Timestamp],
    supplydate: Option[java.sql.Timestamp]
  )

  /** GetResult implicit for fetching PePositionsupplyinfoRow objects using plain SQL queries */
  /** Table description of table PE_PositionSupplyInfo. Objects of this class serve as prototypes for rows in queries. */
  class PePositionsupplyinfo(_tableTag: Tag) extends profile.api.Table[PePositionsupplyinfoRow](_tableTag, "PE_PositionSupplyInfo") {
    def * =
      (positionsupplyinfoid :: username :: positionid :: subcompanyid :: workplaceid :: checkstatus :: checkdate :: supplydate :: HNil).mapTo[PePositionsupplyinfoRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column PositionSupplyInfoID SqlType(INTEGER), PrimaryKey, Default(0) */
    val positionsupplyinfoid: Rep[Int] = column[Int]("PositionSupplyInfoID", O.PrimaryKey, O.Default(0))

    /** Database column UserName SqlType(VARCHAR), Length(50,true) */
    val username: Rep[Option[String]] = column[Option[String]]("UserName", O.Length(50, varying = true))

    /** Database column PositionID SqlType(INTEGER), Default(Some(0)) */
    val positionid: Rep[Option[Int]] = column[Option[Int]]("PositionID", O.Default(Some(0)))

    /** Database column SubCompanyID SqlType(INTEGER), Default(Some(0)) */
    val subcompanyid: Rep[Option[Int]] = column[Option[Int]]("SubCompanyID", O.Default(Some(0)))

    /** Database column WorkPlaceID SqlType(INTEGER), Default(Some(0)) */
    val workplaceid: Rep[Option[Int]] = column[Option[Int]]("WorkPlaceID", O.Default(Some(0)))

    /** Database column CheckStatus SqlType(INTEGER), Default(Some(0)) */
    val checkstatus: Rep[Option[Int]] = column[Option[Int]]("CheckStatus", O.Default(Some(0)))

    /** Database column CheckDate SqlType(TIMESTAMP) */
    val checkdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CheckDate")

    /** Database column SupplyDate SqlType(TIMESTAMP) */
    val supplydate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("SupplyDate")

    /** Index over (username) (database name PE_POSITIONSUPPLYINFO_INTERVIEWEEID) */
    val index1 = index("PE_POSITIONSUPPLYINFO_INTERVIEWEEID", username :: HNil)

    /** Index over (positionid) (database name PE_POSITIONSUPPLYINFO_POSITIONID) */
    val index2 = index("PE_POSITIONSUPPLYINFO_POSITIONID", positionid :: HNil)

    /** Index over (subcompanyid) (database name PE_POSITIONSUPPLYINFO_SUBCOMPANYID) */
    val index3 = index("PE_POSITIONSUPPLYINFO_SUBCOMPANYID", subcompanyid :: HNil)

    /** Index over (workplaceid) (database name PE_POSITIONSUPPLYINFO_WORKPLACEID) */
    val index4 = index("PE_POSITIONSUPPLYINFO_WORKPLACEID", workplaceid :: HNil)
  }

  /** Collection-like TableQuery object for table PePositionsupplyinfo */
  lazy val PePositionsupplyinfo = new TableQuery(tag => new PePositionsupplyinfo(tag))
}
