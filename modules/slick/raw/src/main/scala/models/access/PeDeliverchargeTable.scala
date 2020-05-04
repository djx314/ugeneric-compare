package models.access
// AUTO-GENERATED Slick data model for table PeDelivercharge
trait PeDeliverchargeTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeDelivercharge
    *  @param id Database column ID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param delivertypeid Database column DeliverTypeID SqlType(INTEGER), Default(Some(0))
    *  @param areatype Database column AreaType SqlType(INTEGER), Default(Some(0))
    *  @param arrarea Database column arrArea SqlType(VARCHAR), Length(16777216,true)
    *  @param chargeMin Database column Charge_Min SqlType(DECIMAL), Default(Some(0))
    *  @param weightMin Database column Weight_Min SqlType(DOUBLE), Default(Some(0.0))
    *  @param chargeperunit Database column ChargePerUnit SqlType(DECIMAL), Default(Some(0))
    *  @param weightperunit Database column WeightPerUnit SqlType(DOUBLE), Default(Some(0.0))
    *  @param chargeMax Database column Charge_Max SqlType(DECIMAL), Default(Some(0)) */
  case class PeDeliverchargeRow(
    id: Int,
    delivertypeid: Option[Int] = Some(0),
    areatype: Option[Int] = Some(0),
    arrarea: Option[String],
    chargeMin: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    weightMin: Option[Double] = Some(0.0),
    chargeperunit: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")),
    weightperunit: Option[Double] = Some(0.0),
    chargeMax: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0"))
  )

  /** GetResult implicit for fetching PeDeliverchargeRow objects using plain SQL queries */
  /** Table description of table PE_DeliverCharge. Objects of this class serve as prototypes for rows in queries. */
  class PeDelivercharge(_tableTag: Tag) extends profile.api.Table[PeDeliverchargeRow](_tableTag, "PE_DeliverCharge") {
    def * = (id :: delivertypeid :: areatype :: arrarea :: chargeMin :: weightMin :: chargeperunit :: weightperunit :: chargeMax :: HNil).mapTo[PeDeliverchargeRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.AutoInc, O.PrimaryKey)

    /** Database column DeliverTypeID SqlType(INTEGER), Default(Some(0)) */
    val delivertypeid: Rep[Option[Int]] = column[Option[Int]]("DeliverTypeID", O.Default(Some(0)))

    /** Database column AreaType SqlType(INTEGER), Default(Some(0)) */
    val areatype: Rep[Option[Int]] = column[Option[Int]]("AreaType", O.Default(Some(0)))

    /** Database column arrArea SqlType(VARCHAR), Length(16777216,true) */
    val arrarea: Rep[Option[String]] = column[Option[String]]("arrArea", O.Length(16777216, varying = true))

    /** Database column Charge_Min SqlType(DECIMAL), Default(Some(0)) */
    val chargeMin: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Charge_Min", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column Weight_Min SqlType(DOUBLE), Default(Some(0.0)) */
    val weightMin: Rep[Option[Double]] = column[Option[Double]]("Weight_Min", O.Default(Some(0.0)))

    /** Database column ChargePerUnit SqlType(DECIMAL), Default(Some(0)) */
    val chargeperunit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ChargePerUnit", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Database column WeightPerUnit SqlType(DOUBLE), Default(Some(0.0)) */
    val weightperunit: Rep[Option[Double]] = column[Option[Double]]("WeightPerUnit", O.Default(Some(0.0)))

    /** Database column Charge_Max SqlType(DECIMAL), Default(Some(0)) */
    val chargeMax: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("Charge_Max", O.Default(Some(scala.math.BigDecimal("0"))))

    /** Index over (areatype) (database name PE_DELIVERCHARGE_AREATYPE) */
    val index1 = index("PE_DELIVERCHARGE_AREATYPE", areatype :: HNil)

    /** Index over (delivertypeid) (database name PE_DELIVERCHARGE_DELIVERTYPEID) */
    val index2 = index("PE_DELIVERCHARGE_DELIVERTYPEID", delivertypeid :: HNil)
  }

  /** Collection-like TableQuery object for table PeDelivercharge */
  lazy val PeDelivercharge = new TableQuery(tag => new PeDelivercharge(tag))
}
