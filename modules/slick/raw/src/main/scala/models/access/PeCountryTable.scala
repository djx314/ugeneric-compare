package models.access
// AUTO-GENERATED Slick data model for table PeCountry
trait PeCountryTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeCountry
    *  @param countryid Database column CountryID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param country Database column Country SqlType(VARCHAR), Length(255,true) */
  case class PeCountryRow(countryid: Int, country: Option[String])

  /** GetResult implicit for fetching PeCountryRow objects using plain SQL queries */
  /** Table description of table PE_Country. Objects of this class serve as prototypes for rows in queries. */
  class PeCountry(_tableTag: Tag) extends profile.api.Table[PeCountryRow](_tableTag, "PE_Country") {
    def * = (countryid :: country :: HNil).mapTo[PeCountryRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column CountryID SqlType(INTEGER), AutoInc, PrimaryKey */
    val countryid: Rep[Int] = column[Int]("CountryID", O.AutoInc, O.PrimaryKey)

    /** Database column Country SqlType(VARCHAR), Length(255,true) */
    val country: Rep[Option[String]] = column[Option[String]]("Country", O.Length(255, varying = true))
  }

  /** Collection-like TableQuery object for table PeCountry */
  lazy val PeCountry = new TableQuery(tag => new PeCountry(tag))
}
