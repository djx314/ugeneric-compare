package models.access
// AUTO-GENERATED Slick data model for table PeSpecial
trait PeSpecialTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeSpecial
    *  @param specialid Database column SpecialID SqlType(INTEGER), PrimaryKey
    *  @param channelid Database column ChannelID SqlType(INTEGER)
    *  @param specialname Database column SpecialName SqlType(VARCHAR), Length(50,true)
    *  @param opentype Database column OpenType SqlType(INTEGER)
    *  @param specialpicurl Database column SpecialPicUrl SqlType(VARCHAR), Length(255,true)
    *  @param orderid Database column OrderID SqlType(INTEGER)
    *  @param tips Database column Tips SqlType(VARCHAR), Length(255,true)
    *  @param readme Database column ReadMe SqlType(VARCHAR), Length(16777216,true)
    *  @param skinid Database column SkinID SqlType(INTEGER)
    *  @param templateid Database column TemplateID SqlType(INTEGER)
    *  @param specialdir Database column SpecialDir SqlType(VARCHAR), Length(50,true)
    *  @param maxperpage Database column MaxPerPage SqlType(INTEGER)
    *  @param iselite Database column IsElite SqlType(BOOLEAN)
    *  @param customContent Database column Custom_Content SqlType(VARCHAR), Length(16777216,true) */
  case class PeSpecialRow(
    specialid: Int,
    channelid: Int,
    specialname: String,
    opentype: Int,
    specialpicurl: Option[String],
    orderid: Int,
    tips: Option[String],
    readme: Option[String],
    skinid: Int,
    templateid: Int,
    specialdir: String,
    maxperpage: Option[Int],
    iselite: Option[Boolean],
    customContent: Option[String]
  )

  /** GetResult implicit for fetching PeSpecialRow objects using plain SQL queries */
  /** Table description of table PE_Special. Objects of this class serve as prototypes for rows in queries. */
  class PeSpecial(_tableTag: Tag) extends profile.api.Table[PeSpecialRow](_tableTag, "PE_Special") {
    def * =
      (specialid :: channelid :: specialname :: opentype :: specialpicurl :: orderid :: tips :: readme :: skinid :: templateid :: specialdir :: maxperpage :: iselite :: customContent :: HNil)
        .mapTo[PeSpecialRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column SpecialID SqlType(INTEGER), PrimaryKey */
    val specialid: Rep[Int] = column[Int]("SpecialID", O.PrimaryKey)

    /** Database column ChannelID SqlType(INTEGER) */
    val channelid: Rep[Int] = column[Int]("ChannelID")

    /** Database column SpecialName SqlType(VARCHAR), Length(50,true) */
    val specialname: Rep[String] = column[String]("SpecialName", O.Length(50, varying = true))

    /** Database column OpenType SqlType(INTEGER) */
    val opentype: Rep[Int] = column[Int]("OpenType")

    /** Database column SpecialPicUrl SqlType(VARCHAR), Length(255,true) */
    val specialpicurl: Rep[Option[String]] = column[Option[String]]("SpecialPicUrl", O.Length(255, varying = true))

    /** Database column OrderID SqlType(INTEGER) */
    val orderid: Rep[Int] = column[Int]("OrderID")

    /** Database column Tips SqlType(VARCHAR), Length(255,true) */
    val tips: Rep[Option[String]] = column[Option[String]]("Tips", O.Length(255, varying = true))

    /** Database column ReadMe SqlType(VARCHAR), Length(16777216,true) */
    val readme: Rep[Option[String]] = column[Option[String]]("ReadMe", O.Length(16777216, varying = true))

    /** Database column SkinID SqlType(INTEGER) */
    val skinid: Rep[Int] = column[Int]("SkinID")

    /** Database column TemplateID SqlType(INTEGER) */
    val templateid: Rep[Int] = column[Int]("TemplateID")

    /** Database column SpecialDir SqlType(VARCHAR), Length(50,true) */
    val specialdir: Rep[String] = column[String]("SpecialDir", O.Length(50, varying = true))

    /** Database column MaxPerPage SqlType(INTEGER) */
    val maxperpage: Rep[Option[Int]] = column[Option[Int]]("MaxPerPage")

    /** Database column IsElite SqlType(BOOLEAN) */
    val iselite: Rep[Option[Boolean]] = column[Option[Boolean]]("IsElite")

    /** Database column Custom_Content SqlType(VARCHAR), Length(16777216,true) */
    val customContent: Rep[Option[String]] = column[Option[String]]("Custom_Content", O.Length(16777216, varying = true))

    /** Index over (channelid) (database name PE_SPECIAL_CHANNELID) */
    val index1 = index("PE_SPECIAL_CHANNELID", channelid :: HNil)

    /** Index over (orderid) (database name PE_SPECIAL_ORDERID) */
    val index2 = index("PE_SPECIAL_ORDERID", orderid :: HNil)

    /** Index over (skinid) (database name PE_SPECIAL_SKINID) */
    val index3 = index("PE_SPECIAL_SKINID", skinid :: HNil)

    /** Index over (templateid) (database name PE_SPECIAL_TEMPLATEID) */
    val index4 = index("PE_SPECIAL_TEMPLATEID", templateid :: HNil)
  }

  /** Collection-like TableQuery object for table PeSpecial */
  lazy val PeSpecial = new TableQuery(tag => new PeSpecial(tag))
}
