package models.access
// AUTO-GENERATED Slick data model for table PeSpace
trait PeSpaceTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeSpace
    *  @param id Database column ID SqlType(INTEGER), PrimaryKey
    *  @param userid Database column UserID SqlType(INTEGER), Default(Some(0))
    *  @param classid Database column ClassID SqlType(INTEGER), Default(Some(0))
    *  @param name Database column Name SqlType(VARCHAR), Length(50,true)
    *  @param birthday Database column BirthDay SqlType(TIMESTAMP)
    *  @param photo Database column Photo SqlType(VARCHAR), Length(255,true)
    *  @param intro Database column Intro SqlType(VARCHAR), Length(16777216,true)
    *  @param address Database column Address SqlType(VARCHAR), Length(50,true)
    *  @param tel Database column Tel SqlType(VARCHAR), Length(50,true)
    *  @param fax Database column Fax SqlType(VARCHAR), Length(50,true)
    *  @param company Database column Company SqlType(VARCHAR), Length(50,true)
    *  @param department Database column Department SqlType(VARCHAR), Length(50,true)
    *  @param zipcode Database column ZipCode SqlType(VARCHAR), Length(50,true)
    *  @param homepage Database column HomePage SqlType(VARCHAR), Length(50,true)
    *  @param email Database column Email SqlType(VARCHAR), Length(50,true)
    *  @param qq Database column QQ SqlType(INTEGER), Default(Some(0))
    *  @param `type` Database column Type SqlType(SMALLINT), Default(Some(0))
    *  @param lastusetime Database column LastUseTime SqlType(TIMESTAMP)
    *  @param ontop Database column onTop SqlType(BOOLEAN)
    *  @param passed Database column Passed SqlType(BOOLEAN)
    *  @param iselite Database column IsElite SqlType(BOOLEAN)
    *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0))
    *  @param orderid Database column OrderID SqlType(INTEGER), Default(Some(0))
    *  @param linkurl Database column LinkUrl SqlType(VARCHAR), Length(255,true)
    *  @param listnum Database column listnum SqlType(SMALLINT), Default(Some(10)) */
  case class PeSpaceRow(
    id: Int,
    userid: Option[Int] = Some(0),
    classid: Option[Int] = Some(0),
    name: String,
    birthday: Option[java.sql.Timestamp],
    photo: Option[String],
    intro: Option[String],
    address: Option[String],
    tel: Option[String],
    fax: Option[String],
    company: Option[String],
    department: Option[String],
    zipcode: Option[String],
    homepage: Option[String],
    email: Option[String],
    qq: Option[Int] = Some(0),
    `type`: Option[Short] = Some(0),
    lastusetime: Option[java.sql.Timestamp],
    ontop: Option[Boolean],
    passed: Option[Boolean],
    iselite: Option[Boolean],
    hits: Option[Int] = Some(0),
    orderid: Option[Int] = Some(0),
    linkurl: Option[String],
    listnum: Option[Short] = Some(10)
  )

  /** GetResult implicit for fetching PeSpaceRow objects using plain SQL queries */
  /** Table description of table PE_Space. Objects of this class serve as prototypes for rows in queries.
    *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class PeSpace(_tableTag: Tag) extends profile.api.Table[PeSpaceRow](_tableTag, "PE_Space") {
    def * =
      (id :: userid :: classid :: name :: birthday :: photo :: intro :: address :: tel :: fax :: company :: department :: zipcode :: homepage :: email :: qq :: `type` :: lastusetime :: ontop :: passed :: iselite :: hits :: orderid :: linkurl :: listnum :: HNil)
        .mapTo[PeSpaceRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column ID SqlType(INTEGER), PrimaryKey */
    val id: Rep[Int] = column[Int]("ID", O.PrimaryKey)

    /** Database column UserID SqlType(INTEGER), Default(Some(0)) */
    val userid: Rep[Option[Int]] = column[Option[Int]]("UserID", O.Default(Some(0)))

    /** Database column ClassID SqlType(INTEGER), Default(Some(0)) */
    val classid: Rep[Option[Int]] = column[Option[Int]]("ClassID", O.Default(Some(0)))

    /** Database column Name SqlType(VARCHAR), Length(50,true) */
    val name: Rep[String] = column[String]("Name", O.Length(50, varying = true))

    /** Database column BirthDay SqlType(TIMESTAMP) */
    val birthday: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("BirthDay")

    /** Database column Photo SqlType(VARCHAR), Length(255,true) */
    val photo: Rep[Option[String]] = column[Option[String]]("Photo", O.Length(255, varying = true))

    /** Database column Intro SqlType(VARCHAR), Length(16777216,true) */
    val intro: Rep[Option[String]] = column[Option[String]]("Intro", O.Length(16777216, varying = true))

    /** Database column Address SqlType(VARCHAR), Length(50,true) */
    val address: Rep[Option[String]] = column[Option[String]]("Address", O.Length(50, varying = true))

    /** Database column Tel SqlType(VARCHAR), Length(50,true) */
    val tel: Rep[Option[String]] = column[Option[String]]("Tel", O.Length(50, varying = true))

    /** Database column Fax SqlType(VARCHAR), Length(50,true) */
    val fax: Rep[Option[String]] = column[Option[String]]("Fax", O.Length(50, varying = true))

    /** Database column Company SqlType(VARCHAR), Length(50,true) */
    val company: Rep[Option[String]] = column[Option[String]]("Company", O.Length(50, varying = true))

    /** Database column Department SqlType(VARCHAR), Length(50,true) */
    val department: Rep[Option[String]] = column[Option[String]]("Department", O.Length(50, varying = true))

    /** Database column ZipCode SqlType(VARCHAR), Length(50,true) */
    val zipcode: Rep[Option[String]] = column[Option[String]]("ZipCode", O.Length(50, varying = true))

    /** Database column HomePage SqlType(VARCHAR), Length(50,true) */
    val homepage: Rep[Option[String]] = column[Option[String]]("HomePage", O.Length(50, varying = true))

    /** Database column Email SqlType(VARCHAR), Length(50,true) */
    val email: Rep[Option[String]] = column[Option[String]]("Email", O.Length(50, varying = true))

    /** Database column QQ SqlType(INTEGER), Default(Some(0)) */
    val qq: Rep[Option[Int]] = column[Option[Int]]("QQ", O.Default(Some(0)))

    /** Database column Type SqlType(SMALLINT), Default(Some(0))
      *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[Short]] = column[Option[Short]]("Type", O.Default(Some(0)))

    /** Database column LastUseTime SqlType(TIMESTAMP) */
    val lastusetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LastUseTime")

    /** Database column onTop SqlType(BOOLEAN) */
    val ontop: Rep[Option[Boolean]] = column[Option[Boolean]]("onTop")

    /** Database column Passed SqlType(BOOLEAN) */
    val passed: Rep[Option[Boolean]] = column[Option[Boolean]]("Passed")

    /** Database column IsElite SqlType(BOOLEAN) */
    val iselite: Rep[Option[Boolean]] = column[Option[Boolean]]("IsElite")

    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))

    /** Database column OrderID SqlType(INTEGER), Default(Some(0)) */
    val orderid: Rep[Option[Int]] = column[Option[Int]]("OrderID", O.Default(Some(0)))

    /** Database column LinkUrl SqlType(VARCHAR), Length(255,true) */
    val linkurl: Rep[Option[String]] = column[Option[String]]("LinkUrl", O.Length(255, varying = true))

    /** Database column listnum SqlType(SMALLINT), Default(Some(10)) */
    val listnum: Rep[Option[Short]] = column[Option[Short]]("listnum", O.Default(Some(10)))

    /** Index over (classid) (database name PE_SPACE_CLASSID) */
    val index1 = index("PE_SPACE_CLASSID", classid :: HNil)

    /** Index over (linkurl) (database name PE_SPACE_LINKURL) */
    val index2 = index("PE_SPACE_LINKURL", linkurl :: HNil)

    /** Index over (listnum) (database name PE_SPACE_LISTNUM) */
    val index3 = index("PE_SPACE_LISTNUM", listnum :: HNil)

    /** Index over (orderid) (database name PE_SPACE_ORDERID) */
    val index4 = index("PE_SPACE_ORDERID", orderid :: HNil)

    /** Index over (userid) (database name PE_SPACE_USERID) */
    val index5 = index("PE_SPACE_USERID", userid :: HNil)

    /** Index over (zipcode) (database name PE_SPACE_ZIPCODE) */
    val index6 = index("PE_SPACE_ZIPCODE", zipcode :: HNil)
  }

  /** Collection-like TableQuery object for table PeSpace */
  lazy val PeSpace = new TableQuery(tag => new PeSpace(tag))
}
