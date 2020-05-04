package models.access
// AUTO-GENERATED Slick data model for table PeAreacollection
trait PeAreacollectionTable {

  self: Tables =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table PeAreacollection
    *  @param areaid Database column AreaID SqlType(INTEGER), AutoInc, PrimaryKey
    *  @param areaname Database column AreaName SqlType(VARCHAR), Length(255,true)
    *  @param areafile Database column AreaFile SqlType(VARCHAR), Length(255,true)
    *  @param areaintro Database column AreaIntro SqlType(VARCHAR), Length(16777216,true)
    *  @param code Database column Code SqlType(INTEGER), Default(Some(0))
    *  @param stringreplace Database column StringReplace SqlType(VARCHAR), Length(16777216,true)
    *  @param areaurl Database column AreaUrl SqlType(VARCHAR), Length(255,true)
    *  @param lablestart Database column LableStart SqlType(VARCHAR), Length(16777216,true)
    *  @param lableend Database column LableEnd SqlType(VARCHAR), Length(16777216,true)
    *  @param filterproperty Database column FilterProperty SqlType(VARCHAR), Length(255,true)
    *  @param upfiletype Database column UpFileType SqlType(VARCHAR), Length(255,true)
    *  @param areapassed Database column AreaPassed SqlType(BOOLEAN)
    *  @param `type` Database column Type SqlType(SMALLINT), Default(Some(0)) */
  case class PeAreacollectionRow(
    areaid: Int,
    areaname: Option[String],
    areafile: Option[String],
    areaintro: Option[String],
    code: Option[Int] = Some(0),
    stringreplace: Option[String],
    areaurl: Option[String],
    lablestart: Option[String],
    lableend: Option[String],
    filterproperty: Option[String],
    upfiletype: Option[String],
    areapassed: Option[Boolean],
    `type`: Option[Short] = Some(0)
  )

  /** GetResult implicit for fetching PeAreacollectionRow objects using plain SQL queries */
  /** Table description of table PE_AreaCollection. Objects of this class serve as prototypes for rows in queries.
    *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class PeAreacollection(_tableTag: Tag) extends profile.api.Table[PeAreacollectionRow](_tableTag, "PE_AreaCollection") {
    def * =
      (areaid :: areaname :: areafile :: areaintro :: code :: stringreplace :: areaurl :: lablestart :: lableend :: filterproperty :: upfiletype :: areapassed :: `type` :: HNil)
        .mapTo[PeAreacollectionRow]

    /** Maps whole row to an option. Useful for outer joins. */
    /** Database column AreaID SqlType(INTEGER), AutoInc, PrimaryKey */
    val areaid: Rep[Int] = column[Int]("AreaID", O.AutoInc, O.PrimaryKey)

    /** Database column AreaName SqlType(VARCHAR), Length(255,true) */
    val areaname: Rep[Option[String]] = column[Option[String]]("AreaName", O.Length(255, varying = true))

    /** Database column AreaFile SqlType(VARCHAR), Length(255,true) */
    val areafile: Rep[Option[String]] = column[Option[String]]("AreaFile", O.Length(255, varying = true))

    /** Database column AreaIntro SqlType(VARCHAR), Length(16777216,true) */
    val areaintro: Rep[Option[String]] = column[Option[String]]("AreaIntro", O.Length(16777216, varying = true))

    /** Database column Code SqlType(INTEGER), Default(Some(0)) */
    val code: Rep[Option[Int]] = column[Option[Int]]("Code", O.Default(Some(0)))

    /** Database column StringReplace SqlType(VARCHAR), Length(16777216,true) */
    val stringreplace: Rep[Option[String]] = column[Option[String]]("StringReplace", O.Length(16777216, varying = true))

    /** Database column AreaUrl SqlType(VARCHAR), Length(255,true) */
    val areaurl: Rep[Option[String]] = column[Option[String]]("AreaUrl", O.Length(255, varying = true))

    /** Database column LableStart SqlType(VARCHAR), Length(16777216,true) */
    val lablestart: Rep[Option[String]] = column[Option[String]]("LableStart", O.Length(16777216, varying = true))

    /** Database column LableEnd SqlType(VARCHAR), Length(16777216,true) */
    val lableend: Rep[Option[String]] = column[Option[String]]("LableEnd", O.Length(16777216, varying = true))

    /** Database column FilterProperty SqlType(VARCHAR), Length(255,true) */
    val filterproperty: Rep[Option[String]] = column[Option[String]]("FilterProperty", O.Length(255, varying = true))

    /** Database column UpFileType SqlType(VARCHAR), Length(255,true) */
    val upfiletype: Rep[Option[String]] = column[Option[String]]("UpFileType", O.Length(255, varying = true))

    /** Database column AreaPassed SqlType(BOOLEAN) */
    val areapassed: Rep[Option[Boolean]] = column[Option[Boolean]]("AreaPassed")

    /** Database column Type SqlType(SMALLINT), Default(Some(0))
      *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[Short]] = column[Option[Short]]("Type", O.Default(Some(0)))

    /** Index over (code) (database name PE_AREACOLLECTION_CODE) */
    val index1 = index("PE_AREACOLLECTION_CODE", code :: HNil)
  }

  /** Collection-like TableQuery object for table PeAreacollection */
  lazy val PeAreacollection = new TableQuery(tag => new PeAreacollection(tag))
}
