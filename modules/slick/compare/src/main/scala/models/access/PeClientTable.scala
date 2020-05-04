package models.access
// AUTO-GENERATED Slick data model for table PeClient
trait PeClientTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeClient
    *  @param clientid Database column ClientID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param parentid Database column ParentID SqlType(INTEGER), Default(Some(0))
    *  @param clientnum Database column ClientNum SqlType(VARCHAR), Length(20,true)
    *  @param clienttype Database column ClientType SqlType(INTEGER), Default(Some(0))
    *  @param clientname Database column ClientName SqlType(VARCHAR), Length(100,true)
    *  @param shortedform Database column ShortedForm SqlType(VARCHAR), Length(20,true)
    *  @param area Database column Area SqlType(INTEGER), Default(Some(0))
    *  @param clientfield Database column ClientField SqlType(INTEGER), Default(Some(0))
    *  @param valuelevel Database column ValueLevel SqlType(INTEGER), Default(Some(0))
    *  @param creditlevel Database column CreditLevel SqlType(INTEGER), Default(Some(0))
    *  @param importance Database column Importance SqlType(INTEGER), Default(Some(0))
    *  @param connectionlevel Database column ConnectionLevel SqlType(INTEGER), Default(Some(0))
    *  @param groupid Database column GroupID SqlType(INTEGER), Default(Some(0))
    *  @param sourcetype Database column SourceType SqlType(INTEGER), Default(Some(0))
    *  @param phasetype Database column PhaseType SqlType(INTEGER), Default(Some(0))
    *  @param remark Database column Remark SqlType(VARCHAR), Length(16777216,true)
    *  @param visittimes Database column VisitTimes SqlType(INTEGER), Default(Some(0))
    *  @param servicetimes Database column ServiceTimes SqlType(INTEGER), Default(Some(0))
    *  @param complaintimes Database column ComplainTimes SqlType(INTEGER), Default(Some(0))
    *  @param lastvisittime Database column LastVisitTime SqlType(TIMESTAMP)
    *  @param lastservicetime Database column LastServiceTime SqlType(TIMESTAMP)
    *  @param lastcomplaintime Database column LastComplainTime SqlType(TIMESTAMP)
    *  @param createtime Database column CreateTime SqlType(TIMESTAMP)
    *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP)
    *  @param owner Database column Owner SqlType(VARCHAR), Length(50,true)
    *  @param balance Database column Balance SqlType(DECIMAL), Default(Some(0)) */
  case class PeClientRow(
    clientid: Int = 0,
    parentid: Option[Int] = Some(0),
    clientnum: Option[String],
    clienttype: Option[Int] = Some(0),
    clientname: Option[String],
    shortedform: Option[String],
    area: Option[Int] = Some(0),
    clientfield: Option[Int] = Some(0),
    valuelevel: Option[Int] = Some(0),
    creditlevel: Option[Int] = Some(0),
    importance: Option[Int] = Some(0),
    connectionlevel: Option[Int] = Some(0),
    groupid: Option[Int] = Some(0),
    sourcetype: Option[Int] = Some(0),
    phasetype: Option[Int] = Some(0),
    remark: Option[String],
    visittimes: Option[Int] = Some(0),
    servicetimes: Option[Int] = Some(0),
    complaintimes: Option[Int] = Some(0),
    lastvisittime: Option[java.sql.Timestamp],
    lastservicetime: Option[java.sql.Timestamp],
    lastcomplaintime: Option[java.sql.Timestamp],
    createtime: Option[java.sql.Timestamp],
    updatetime: Option[java.sql.Timestamp],
    owner: Option[String],
    balance: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0"))
  )

  /** GetResult implicit for fetching PeClientRow objects using plain SQL queries */
  /** Table description of table PE_Client. Objects of this class serve as prototypes for rows in queries. */
  class PeClient(_tableTag: Tag) extends profile.api.Table[PeClientRow](_tableTag, "PE_Client") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ClientID SqlType(INTEGER), PrimaryKey, Default(0) */
    val clientid: Rep[Int] = column[Int]("ClientID", O.PrimaryKey, O.Default(0))

    /** Database column ParentID SqlType(INTEGER), Default(Some(0)) */
    val parentid: Rep[Option[Int]] = column[Option[Int]]("ParentID", O.Default(Some(0)))

    /** Database column ClientNum SqlType(VARCHAR), Length(20,true) */
    val clientnum: Rep[Option[String]] = column[Option[String]]("ClientNum", O.Length(20, varying = true))

    /** Database column ClientType SqlType(INTEGER), Default(Some(0)) */
    val clienttype: Rep[Option[Int]] = column[Option[Int]]("ClientType", O.Default(Some(0)))

    /** Database column ClientName SqlType(VARCHAR), Length(100,true) */
    val clientname: Rep[Option[String]] = column[Option[String]]("ClientName", O.Length(100, varying = true))

    /** Database column ShortedForm SqlType(VARCHAR), Length(20,true) */
    val shortedform: Rep[Option[String]] = column[Option[String]]("ShortedForm", O.Length(20, varying = true))

    /** Database column Area SqlType(INTEGER), Default(Some(0)) */
    val area: Rep[Option[Int]] = column[Option[Int]]("Area", O.Default(Some(0)))

    /** Database column ClientField SqlType(INTEGER), Default(Some(0)) */
    val clientfield: Rep[Option[Int]] = column[Option[Int]]("ClientField", O.Default(Some(0)))

    /** Database column ValueLevel SqlType(INTEGER), Default(Some(0)) */
    val valuelevel: Rep[Option[Int]] = column[Option[Int]]("ValueLevel", O.Default(Some(0)))

    /** Database column CreditLevel SqlType(INTEGER), Default(Some(0)) */
    val creditlevel: Rep[Option[Int]] = column[Option[Int]]("CreditLevel", O.Default(Some(0)))

    /** Database column Importance SqlType(INTEGER), Default(Some(0)) */
    val importance: Rep[Option[Int]] = column[Option[Int]]("Importance", O.Default(Some(0)))

    /** Database column ConnectionLevel SqlType(INTEGER), Default(Some(0)) */
    val connectionlevel: Rep[Option[Int]] = column[Option[Int]]("ConnectionLevel", O.Default(Some(0)))

    /** Database column GroupID SqlType(INTEGER), Default(Some(0)) */
    val groupid: Rep[Option[Int]] = column[Option[Int]]("GroupID", O.Default(Some(0)))

    /** Database column SourceType SqlType(INTEGER), Default(Some(0)) */
    val sourcetype: Rep[Option[Int]] = column[Option[Int]]("SourceType", O.Default(Some(0)))

    /** Database column PhaseType SqlType(INTEGER), Default(Some(0)) */
    val phasetype: Rep[Option[Int]] = column[Option[Int]]("PhaseType", O.Default(Some(0)))

    /** Database column Remark SqlType(VARCHAR), Length(16777216,true) */
    val remark: Rep[Option[String]] = column[Option[String]]("Remark", O.Length(16777216, varying = true))

    /** Database column VisitTimes SqlType(INTEGER), Default(Some(0)) */
    val visittimes: Rep[Option[Int]] = column[Option[Int]]("VisitTimes", O.Default(Some(0)))

    /** Database column ServiceTimes SqlType(INTEGER), Default(Some(0)) */
    val servicetimes: Rep[Option[Int]] = column[Option[Int]]("ServiceTimes", O.Default(Some(0)))

    /** Database column ComplainTimes SqlType(INTEGER), Default(Some(0)) */
    val complaintimes: Rep[Option[Int]] = column[Option[Int]]("ComplainTimes", O.Default(Some(0)))

    /** Database column LastVisitTime SqlType(TIMESTAMP) */
    val lastvisittime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastVisitTime")

    /** Database column LastServiceTime SqlType(TIMESTAMP) */
    val lastservicetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastServiceTime")

    /** Database column LastComplainTime SqlType(TIMESTAMP) */
    val lastcomplaintime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastComplainTime")

    /** Database column CreateTime SqlType(TIMESTAMP) */
    val createtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CreateTime")

    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UpdateTime")

    /** Database column Owner SqlType(VARCHAR), Length(50,true) */
    val owner: Rep[Option[String]] = column[Option[String]]("Owner", O.Length(50, varying = true))

    /** Database column Balance SqlType(DECIMAL), Default(Some(0)) */
    val balance: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Balance", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Index over (clientnum) (database name PE_CLIENT_CLIENTNUM) */
    val index1 = index("PE_CLIENT_CLIENTNUM", clientnum)

    /** Index over (groupid) (database name PE_CLIENT_GROUPID) */
    val index2 = index("PE_CLIENT_GROUPID", groupid)

    /** Index over (parentid) (database name PE_CLIENT_PARENTID) */
    val index3 = index("PE_CLIENT_PARENTID", parentid)
  }

  /** Collection-like TableQuery object for table PeClient */
  lazy val PeClient = new TableQuery(tag => new PeClient(tag))
}
