package models.access
// AUTO-GENERATED Slick data model for table PeProducer
trait PeProducerTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeProducer
   *  @param producerid Database column ProducerID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(0))
   *  @param producername Database column ProducerName SqlType(VARCHAR), Length(200,true)
   *  @param producershortname Database column ProducerShortName SqlType(VARCHAR), Length(50,true)
   *  @param producerphoto Database column ProducerPhoto SqlType(VARCHAR), Length(255,true)
   *  @param birthday Database column BirthDay SqlType(TIMESTAMP)
   *  @param address Database column Address SqlType(VARCHAR), Length(255,true)
   *  @param postcode Database column Postcode SqlType(VARCHAR), Length(10,true)
   *  @param phone Database column Phone SqlType(VARCHAR), Length(50,true)
   *  @param fax Database column Fax SqlType(VARCHAR), Length(50,true)
   *  @param email Database column Email SqlType(VARCHAR), Length(50,true)
   *  @param homepage Database column Homepage SqlType(VARCHAR), Length(50,true)
   *  @param producerintro Database column ProducerIntro SqlType(VARCHAR), Length(16777216,true)
   *  @param lastusetime Database column LastUseTime SqlType(TIMESTAMP)
   *  @param passed Database column Passed SqlType(BOOLEAN)
   *  @param ontop Database column onTop SqlType(BOOLEAN)
   *  @param iselite Database column IsElite SqlType(BOOLEAN)
   *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0))
   *  @param producertype Database column ProducerType SqlType(SMALLINT), Default(Some(0)) */
  case class PeProducerRow(producerid: Int, channelid: Option[Int] = Some(0), producername: Option[String], producershortname: Option[String], producerphoto: Option[String], birthday: Option[java.sql.Timestamp], address: Option[String], postcode: Option[String], phone: Option[String], fax: Option[String], email: Option[String], homepage: Option[String], producerintro: Option[String], lastusetime: Option[java.sql.Timestamp], passed: Option[Boolean], ontop: Option[Boolean], iselite: Option[Boolean], hits: Option[Int] = Some(0), producertype: Option[Short] = Some(0))
  /** GetResult implicit for fetching PeProducerRow objects using plain SQL queries */

  /** Table description of table PE_Producer. Objects of this class serve as prototypes for rows in queries. */
  class PeProducer(_tableTag: Tag) extends profile.api.Table[PeProducerRow](_tableTag, "PE_Producer") {
    def * = org.scalax.ugeneric.slick.USlick.mapWithTable(this)
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column ProducerID SqlType(INTEGER), AutoInc, PrimaryKey */
    val producerid: Rep[Int] = column[Int]("ProducerID", O.AutoInc, O.PrimaryKey)
    /** Database column ChannelID SqlType(INTEGER), Default(Some(0)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(0)))
    /** Database column ProducerName SqlType(VARCHAR), Length(200,true) */
    val producername: Rep[Option[String]] = column[Option[String]]("ProducerName", O.Length(200,varying=true))
    /** Database column ProducerShortName SqlType(VARCHAR), Length(50,true) */
    val producershortname: Rep[Option[String]] = column[Option[String]]("ProducerShortName", O.Length(50,varying=true))
    /** Database column ProducerPhoto SqlType(VARCHAR), Length(255,true) */
    val producerphoto: Rep[Option[String]] = column[Option[String]]("ProducerPhoto", O.Length(255,varying=true))
    /** Database column BirthDay SqlType(TIMESTAMP) */
    val birthday: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("BirthDay")
    /** Database column Address SqlType(VARCHAR), Length(255,true) */
    val address: Rep[Option[String]] = column[Option[String]]("Address", O.Length(255,varying=true))
    /** Database column Postcode SqlType(VARCHAR), Length(10,true) */
    val postcode: Rep[Option[String]] = column[Option[String]]("Postcode", O.Length(10,varying=true))
    /** Database column Phone SqlType(VARCHAR), Length(50,true) */
    val phone: Rep[Option[String]] = column[Option[String]]("Phone", O.Length(50,varying=true))
    /** Database column Fax SqlType(VARCHAR), Length(50,true) */
    val fax: Rep[Option[String]] = column[Option[String]]("Fax", O.Length(50,varying=true))
    /** Database column Email SqlType(VARCHAR), Length(50,true) */
    val email: Rep[Option[String]] = column[Option[String]]("Email", O.Length(50,varying=true))
    /** Database column Homepage SqlType(VARCHAR), Length(50,true) */
    val homepage: Rep[Option[String]] = column[Option[String]]("Homepage", O.Length(50,varying=true))
    /** Database column ProducerIntro SqlType(VARCHAR), Length(16777216,true) */
    val producerintro: Rep[Option[String]] = column[Option[String]]("ProducerIntro", O.Length(16777216,varying=true))
    /** Database column LastUseTime SqlType(TIMESTAMP) */
    val lastusetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastUseTime")
    /** Database column Passed SqlType(BOOLEAN) */
    val passed: Rep[Option[Boolean]] = column[Option[Boolean]]("Passed")
    /** Database column onTop SqlType(BOOLEAN) */
    val ontop: Rep[Option[Boolean]] = column[Option[Boolean]]("onTop")
    /** Database column IsElite SqlType(BOOLEAN) */
    val iselite: Rep[Option[Boolean]] = column[Option[Boolean]]("IsElite")
    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))
    /** Database column ProducerType SqlType(SMALLINT), Default(Some(0)) */
    val producertype: Rep[Option[Short]] = column[Option[Short]]("ProducerType", O.Default(Some(0)))

    /** Index over (channelid) (database name PE_PRODUCER_CHANNELID) */
    val index1 = index("PE_PRODUCER_CHANNELID", channelid)
    /** Index over (postcode) (database name PE_PRODUCER_POSTCODE) */
    val index2 = index("PE_PRODUCER_POSTCODE", postcode)
  }
  /** Collection-like TableQuery object for table PeProducer */
  lazy val PeProducer = new TableQuery(tag => new PeProducer(tag))
}
