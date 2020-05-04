package models.access
// AUTO-GENERATED Slick data model for table PeDelivertype
trait PeDelivertypeTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeDelivertype
    *  @param typeid Database column TypeID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param typename Database column TypeName SqlType(VARCHAR), Length(50,true)
    *  @param intro Database column Intro SqlType(VARCHAR), Length(50,true)
    *  @param chargetype Database column ChargeType SqlType(INTEGER), Default(Some(0))
    *  @param isdefault Database column IsDefault SqlType(BOOLEAN)
    *  @param isdisabled Database column IsDisabled SqlType(BOOLEAN)
    *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0))
    *  @param releasetype Database column ReleaseType SqlType(INTEGER), Default(Some(0))
    *  @param minmoney1 Database column MinMoney1 SqlType(DECIMAL), Default(Some(0))
    *  @param releasecharge Database column ReleaseCharge SqlType(DECIMAL), Default(Some(0))
    *  @param minmoney2 Database column MinMoney2 SqlType(DECIMAL), Default(Some(0))
    *  @param maxcharge Database column MaxCharge SqlType(DECIMAL), Default(Some(0))
    *  @param minmoney3 Database column MinMoney3 SqlType(DECIMAL), Default(Some(0))
    *  @param chargeMin Database column Charge_Min SqlType(DECIMAL), Default(Some(0))
    *  @param chargeMax Database column Charge_Max SqlType(DECIMAL), Default(Some(0))
    *  @param chargePercent Database column Charge_Percent SqlType(SMALLINT), Default(Some(0)) */
  case class PeDelivertypeRow(
    typeid: Int = 0,
    typename: Option[String],
    intro: Option[String],
    chargetype: Option[Int] = Some(0),
    isdefault: Option[Boolean],
    isdisabled: Option[Boolean],
    orderid: Option[Int] = Some(0),
    releasetype: Option[Int] = Some(0),
    minmoney1: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    releasecharge: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    minmoney2: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    maxcharge: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    minmoney3: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    chargeMin: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    chargeMax: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    chargePercent: Option[Short] = Some(0)
  )

  /** GetResult implicit for fetching PeDelivertypeRow objects using plain SQL queries */
  /** Table description of table PE_DeliverType. Objects of this class serve as prototypes for rows in queries. */
  class PeDelivertype(_tableTag: Tag) extends profile.api.Table[PeDelivertypeRow](_tableTag, "PE_DeliverType") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column TypeID SqlType(INTEGER), PrimaryKey, Default(0) */
    val typeid: Rep[Int] = column[Int]("TypeID", O.PrimaryKey, O.Default(0))

    /** Database column TypeName SqlType(VARCHAR), Length(50,true) */
    val typename: Rep[Option[String]] = column[Option[String]]("TypeName", O.Length(50, varying = true))

    /** Database column Intro SqlType(VARCHAR), Length(50,true) */
    val intro: Rep[Option[String]] = column[Option[String]]("Intro", O.Length(50, varying = true))

    /** Database column ChargeType SqlType(INTEGER), Default(Some(0)) */
    val chargetype: Rep[Option[Int]] = column[Option[Int]]("ChargeType", O.Default(Some(0)))

    /** Database column IsDefault SqlType(BOOLEAN) */
    val isdefault: Rep[Option[Boolean]] = column[Option[Boolean]]("IsDefault")

    /** Database column IsDisabled SqlType(BOOLEAN) */
    val isdisabled: Rep[Option[Boolean]] = column[Option[Boolean]]("IsDisabled")

    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))

    /** Database column ReleaseType SqlType(INTEGER), Default(Some(0)) */
    val releasetype: Rep[Option[Int]] = column[Option[Int]]("ReleaseType", O.Default(Some(0)))

    /** Database column MinMoney1 SqlType(DECIMAL), Default(Some(0)) */
    val minmoney1: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MinMoney1", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column ReleaseCharge SqlType(DECIMAL), Default(Some(0)) */
    val releasecharge: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ReleaseCharge", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column MinMoney2 SqlType(DECIMAL), Default(Some(0)) */
    val minmoney2: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MinMoney2", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column MaxCharge SqlType(DECIMAL), Default(Some(0)) */
    val maxcharge: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MaxCharge", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column MinMoney3 SqlType(DECIMAL), Default(Some(0)) */
    val minmoney3: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MinMoney3", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column Charge_Min SqlType(DECIMAL), Default(Some(0)) */
    val chargeMin: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Charge_Min", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column Charge_Max SqlType(DECIMAL), Default(Some(0)) */
    val chargeMax: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Charge_Max", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column Charge_Percent SqlType(SMALLINT), Default(Some(0)) */
    val chargePercent: Rep[Option[Short]] = column[Option[Short]]("Charge_Percent", O.Default(Some(0)))

    /** Index over (orderid) (database name PE_DELIVERTYPE_ORDERID) */
    val index1 = index("PE_DELIVERTYPE_ORDERID", orderid)
  }

  /** Collection-like TableQuery object for table PeDelivertype */
  lazy val PeDelivertype = new TableQuery(tag => new PeDelivertype(tag))
}
