package models.access
// AUTO-GENERATED Slick data model for table PeSupplyCompany
trait PeSupplyCompanyTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeSupplyCompany
    *  @param classid Database column ClassID SqlType(INTEGER), PrimaryKey, Default(0)
    *  @param companyid Database column CompanyID SqlType(INTEGER), Default(Some(0)) */
  case class PeSupplyCompanyRow(classid: Int = 0, companyid: Option[Int] = Some(0))

  /** GetResult implicit for fetching PeSupplyCompanyRow objects using plain SQL queries */
  /** Table description of table PE_Supply_Company. Objects of this class serve as prototypes for rows in queries. */
  class PeSupplyCompany(_tableTag: Tag) extends profile.api.Table[PeSupplyCompanyRow](_tableTag, "PE_Supply_Company") {
    def * = (classid :: companyid :: HNil).mapTo[PeSupplyCompanyRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ClassID SqlType(INTEGER), PrimaryKey, Default(0) */
    val classid: Rep[Int] = column[Int]("ClassID", O.PrimaryKey, O.Default(0))

    /** Database column CompanyID SqlType(INTEGER), Default(Some(0)) */
    val companyid: Rep[Option[Int]] = column[Option[Int]]("CompanyID", O.Default(Some(0)))

    /** Index over (companyid) (database name PE_SUPPLY_COMPANY_COMPANYID) */
    val index1 = index("PE_SUPPLY_COMPANY_COMPANYID", companyid :: HNil)
  }

  /** Collection-like TableQuery object for table PeSupplyCompany */
  lazy val PeSupplyCompany = new TableQuery(tag => new PeSupplyCompany(tag))
}
