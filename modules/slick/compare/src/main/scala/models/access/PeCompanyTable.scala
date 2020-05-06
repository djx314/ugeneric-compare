package models.access
// AUTO-GENERATED Slick data model for table PeCompany
trait PeCompanyTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeCompany
   *  @param companyid Database column CompanyID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param clientid Database column ClientID SqlType(INTEGER), Default(Some(0))
   *  @param companyname Database column CompanyName SqlType(VARCHAR), Length(200,true)
   *  @param country Database column Country SqlType(VARCHAR), Length(50,true)
   *  @param province Database column Province SqlType(VARCHAR), Length(30,true)
   *  @param city Database column City SqlType(VARCHAR), Length(30,true)
   *  @param address Database column Address SqlType(VARCHAR), Length(255,true)
   *  @param zipcode Database column ZipCode SqlType(VARCHAR), Length(10,true)
   *  @param phone Database column Phone SqlType(VARCHAR), Length(50,true)
   *  @param fax Database column Fax SqlType(VARCHAR), Length(30,true)
   *  @param homepage Database column Homepage SqlType(VARCHAR), Length(255,true)
   *  @param bankofdeposit Database column BankOfDeposit SqlType(VARCHAR), Length(50,true)
   *  @param bankaccount Database column BankAccount SqlType(VARCHAR), Length(50,true)
   *  @param taxnum Database column TaxNum SqlType(VARCHAR), Length(50,true)
   *  @param statusinfield Database column StatusInField SqlType(INTEGER), Default(Some(0))
   *  @param companysize Database column CompanySize SqlType(INTEGER), Default(Some(0))
   *  @param businessscope Database column BusinessScope SqlType(VARCHAR), Length(200,true)
   *  @param annualsales Database column AnnualSales SqlType(VARCHAR), Length(50,true)
   *  @param managementforms Database column ManagementForms SqlType(INTEGER), Default(Some(0))
   *  @param registeredcapital Database column RegisteredCapital SqlType(VARCHAR), Length(50,true)
   *  @param companyintro Database column CompanyIntro SqlType(VARCHAR), Length(16777216,true)
   *  @param compamypic Database column CompamyPic SqlType(VARCHAR), Length(255,true) */
  case class PeCompanyRow(companyid: Int = 0, clientid: Option[Int] = Some(0), companyname: Option[String], country: Option[String], province: Option[String], city: Option[String], address: Option[String], zipcode: Option[String], phone: Option[String], fax: Option[String], homepage: Option[String], bankofdeposit: Option[String], bankaccount: Option[String], taxnum: Option[String], statusinfield: Option[Int] = Some(0), companysize: Option[Int] = Some(0), businessscope: Option[String], annualsales: Option[String], managementforms: Option[Int] = Some(0), registeredcapital: Option[String], companyintro: Option[String], compamypic: Option[String])
  /** GetResult implicit for fetching PeCompanyRow objects using plain SQL queries */

  /** Table description of table PE_Company. Objects of this class serve as prototypes for rows in queries. */
  class PeCompany(_tableTag: Tag) extends profile.api.Table[PeCompanyRow](_tableTag, "PE_Company") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column CompanyID SqlType(INTEGER), PrimaryKey, Default(0) */
    val companyid: Rep[Int] = column[Int]("CompanyID", O.PrimaryKey, O.Default(0))
    /** Database column ClientID SqlType(INTEGER), Default(Some(0)) */
    val clientid: Rep[Option[Int]] = column[Option[Int]]("ClientID", O.Default(Some(0)))
    /** Database column CompanyName SqlType(VARCHAR), Length(200,true) */
    val companyname: Rep[Option[String]] = column[Option[String]]("CompanyName", O.Length(200,varying=true))
    /** Database column Country SqlType(VARCHAR), Length(50,true) */
    val country: Rep[Option[String]] = column[Option[String]]("Country", O.Length(50,varying=true))
    /** Database column Province SqlType(VARCHAR), Length(30,true) */
    val province: Rep[Option[String]] = column[Option[String]]("Province", O.Length(30,varying=true))
    /** Database column City SqlType(VARCHAR), Length(30,true) */
    val city: Rep[Option[String]] = column[Option[String]]("City", O.Length(30,varying=true))
    /** Database column Address SqlType(VARCHAR), Length(255,true) */
    val address: Rep[Option[String]] = column[Option[String]]("Address", O.Length(255,varying=true))
    /** Database column ZipCode SqlType(VARCHAR), Length(10,true) */
    val zipcode: Rep[Option[String]] = column[Option[String]]("ZipCode", O.Length(10,varying=true))
    /** Database column Phone SqlType(VARCHAR), Length(50,true) */
    val phone: Rep[Option[String]] = column[Option[String]]("Phone", O.Length(50,varying=true))
    /** Database column Fax SqlType(VARCHAR), Length(30,true) */
    val fax: Rep[Option[String]] = column[Option[String]]("Fax", O.Length(30,varying=true))
    /** Database column Homepage SqlType(VARCHAR), Length(255,true) */
    val homepage: Rep[Option[String]] = column[Option[String]]("Homepage", O.Length(255,varying=true))
    /** Database column BankOfDeposit SqlType(VARCHAR), Length(50,true) */
    val bankofdeposit: Rep[Option[String]] = column[Option[String]]("BankOfDeposit", O.Length(50,varying=true))
    /** Database column BankAccount SqlType(VARCHAR), Length(50,true) */
    val bankaccount: Rep[Option[String]] = column[Option[String]]("BankAccount", O.Length(50,varying=true))
    /** Database column TaxNum SqlType(VARCHAR), Length(50,true) */
    val taxnum: Rep[Option[String]] = column[Option[String]]("TaxNum", O.Length(50,varying=true))
    /** Database column StatusInField SqlType(INTEGER), Default(Some(0)) */
    val statusinfield: Rep[Option[Int]] = column[Option[Int]]("StatusInField", O.Default(Some(0)))
    /** Database column CompanySize SqlType(INTEGER), Default(Some(0)) */
    val companysize: Rep[Option[Int]] = column[Option[Int]]("CompanySize", O.Default(Some(0)))
    /** Database column BusinessScope SqlType(VARCHAR), Length(200,true) */
    val businessscope: Rep[Option[String]] = column[Option[String]]("BusinessScope", O.Length(200,varying=true))
    /** Database column AnnualSales SqlType(VARCHAR), Length(50,true) */
    val annualsales: Rep[Option[String]] = column[Option[String]]("AnnualSales", O.Length(50,varying=true))
    /** Database column ManagementForms SqlType(INTEGER), Default(Some(0)) */
    val managementforms: Rep[Option[Int]] = column[Option[Int]]("ManagementForms", O.Default(Some(0)))
    /** Database column RegisteredCapital SqlType(VARCHAR), Length(50,true) */
    val registeredcapital: Rep[Option[String]] = column[Option[String]]("RegisteredCapital", O.Length(50,varying=true))
    /** Database column CompanyIntro SqlType(VARCHAR), Length(16777216,true) */
    val companyintro: Rep[Option[String]] = column[Option[String]]("CompanyIntro", O.Length(16777216,varying=true))
    /** Database column CompamyPic SqlType(VARCHAR), Length(255,true) */
    val compamypic: Rep[Option[String]] = column[Option[String]]("CompamyPic", O.Length(255,varying=true))

    /** Index over (clientid) (database name PE_COMPANY_CLIENTID) */
    val index1 = index("PE_COMPANY_CLIENTID", clientid)
    /** Index over (taxnum) (database name PE_COMPANY_TAXNUM) */
    val index2 = index("PE_COMPANY_TAXNUM", taxnum)
    /** Index over (zipcode) (database name PE_COMPANY_ZIPCODE) */
    val index3 = index("PE_COMPANY_ZIPCODE", zipcode)
  }
  /** Collection-like TableQuery object for table PeCompany */
  lazy val PeCompany = new TableQuery(tag => new PeCompany(tag))
}
