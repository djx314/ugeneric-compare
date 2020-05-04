package models.access
// AUTO-GENERATED Slick data model for table PeHouseqz
trait PeHouseqzTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PeHouseqz
   *  @param houseid Database column HouseID SqlType(INTEGER), PrimaryKey, Default(0)
   *  @param classid Database column ClassID SqlType(INTEGER), Default(Some(4))
   *  @param channelid Database column ChannelID SqlType(INTEGER), Default(Some(998))
   *  @param housesource Database column HouseSource SqlType(VARCHAR), Length(50,true)
   *  @param housequyu Database column HouseQuyu SqlType(VARCHAR), Length(20,true)
   *  @param housedizhi Database column HouseDiZhi SqlType(VARCHAR), Length(50,true)
   *  @param househuxing Database column HouseHuXing SqlType(VARCHAR), Length(50,true)
   *  @param housemianji1 Database column HouseMianJi1 SqlType(NUMERIC), Default(0)
   *  @param housemianji2 Database column HouseMianJi2 SqlType(NUMERIC), Default(0)
   *  @param housezujin1 Database column HouseZuJin1 SqlType(NUMERIC), Default(Some(0))
   *  @param housezujin2 Database column HouseZuJin2 SqlType(NUMERIC), Default(Some(0))
   *  @param housezujintype Database column HouseZuJinType SqlType(VARCHAR), Length(50,true)
   *  @param housezhifu Database column HouseZhiFu SqlType(VARCHAR), Length(50,true)
   *  @param houselouceng Database column HouseLouCeng SqlType(VARCHAR), Length(50,true)
   *  @param houseleixing Database column HouseLeiXing SqlType(VARCHAR), Length(20,true)
   *  @param housejichu Database column HouseJiChu SqlType(VARCHAR), Length(255,true)
   *  @param housezhuangxiu Database column HouseZhuangXiu SqlType(VARCHAR), Length(255,true)
   *  @param houseweisheng Database column HouseWeiSheng SqlType(VARCHAR), Length(255,true)
   *  @param housedianqi Database column HouseDianQi SqlType(VARCHAR), Length(255,true)
   *  @param housejiaju Database column HouseJiaJu SqlType(VARCHAR), Length(255,true)
   *  @param housexinxi Database column HouseXinXi SqlType(VARCHAR), Length(255,true)
   *  @param houseshizheng Database column HouseShiZheng SqlType(VARCHAR), Length(255,true)
   *  @param zulinstartdate Database column ZuLinStartDate SqlType(TIMESTAMP)
   *  @param zulinenddate Database column ZuLinEndDate SqlType(TIMESTAMP)
   *  @param contactname Database column ContactName SqlType(VARCHAR), Length(20,true)
   *  @param contactphone Database column ContactPhone SqlType(VARCHAR), Length(50,true)
   *  @param contactemail Database column ContactEmail SqlType(VARCHAR), Length(100,true)
   *  @param contactqq Database column ContactQQ SqlType(VARCHAR), Length(20,true)
   *  @param keyword Database column Keyword SqlType(VARCHAR), Length(255,true)
   *  @param youxiaoqi Database column YouXiaoQi SqlType(VARCHAR), Length(20,true)
   *  @param houseqita Database column HouseQiTa SqlType(VARCHAR), Length(16777216,true)
   *  @param editor Database column Editor SqlType(VARCHAR), Length(20,true)
   *  @param updatetime Database column UpdateTime SqlType(TIMESTAMP)
   *  @param viewall Database column ViewAll SqlType(BOOLEAN)
   *  @param hits Database column Hits SqlType(INTEGER), Default(Some(0))
   *  @param hot Database column Hot SqlType(BOOLEAN)
   *  @param ontop Database column OnTop SqlType(BOOLEAN)
   *  @param elite Database column Elite SqlType(BOOLEAN)
   *  @param passed Database column Passed SqlType(BOOLEAN)
   *  @param deleted Database column Deleted SqlType(BOOLEAN)
   *  @param commendclassdays Database column CommendClassDays SqlType(INTEGER), Default(Some(0))
   *  @param uploadphotos Database column UploadPhotos SqlType(VARCHAR), Length(16777216,true) */
  case class PeHouseqzRow(houseid: Int = 0, classid: Option[Int] = Some(4), channelid: Option[Int] = Some(998), housesource: Option[String], housequyu: Option[String], housedizhi: Option[String], househuxing: Option[String], housemianji1: scala.math.BigDecimal = scala.math.BigDecimal("0"), housemianji2: scala.math.BigDecimal = scala.math.BigDecimal("0"), housezujin1: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), housezujin2: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), housezujintype: Option[String], housezhifu: Option[String], houselouceng: Option[String], houseleixing: Option[String], housejichu: Option[String], housezhuangxiu: Option[String], houseweisheng: Option[String], housedianqi: Option[String], housejiaju: Option[String], housexinxi: Option[String], houseshizheng: Option[String], zulinstartdate: Option[java.sql.Timestamp], zulinenddate: Option[java.sql.Timestamp], contactname: String, contactphone: String, contactemail: Option[String], contactqq: Option[String], keyword: String, youxiaoqi: Option[String], houseqita: Option[String], editor: Option[String], updatetime: Option[java.sql.Timestamp], viewall: Option[Boolean], hits: Option[Int] = Some(0), hot: Option[Boolean], ontop: Option[Boolean], elite: Option[Boolean], passed: Option[Boolean], deleted: Boolean, commendclassdays: Option[Int] = Some(0), uploadphotos: Option[String])
  /** GetResult implicit for fetching PeHouseqzRow objects using plain SQL queries */

  /** Table description of table PE_HouseQZ. Objects of this class serve as prototypes for rows in queries. */
  class PeHouseqz(_tableTag: Tag) extends profile.api.Table[PeHouseqzRow](_tableTag, "PE_HouseQZ") {
    def * = (houseid :: classid :: channelid :: housesource :: housequyu :: housedizhi :: househuxing :: housemianji1 :: housemianji2 :: housezujin1 :: housezujin2 :: housezujintype :: housezhifu :: houselouceng :: houseleixing :: housejichu :: housezhuangxiu :: houseweisheng :: housedianqi :: housejiaju :: housexinxi :: houseshizheng :: zulinstartdate :: zulinenddate :: contactname :: contactphone :: contactemail :: contactqq :: keyword :: youxiaoqi :: houseqita :: editor :: updatetime :: viewall :: hits :: hot :: ontop :: elite :: passed :: deleted :: commendclassdays :: uploadphotos :: HNil).mapTo[PeHouseqzRow]
    /** Maps whole row to an option. Useful for outer joins. */


    /** Database column HouseID SqlType(INTEGER), PrimaryKey, Default(0) */
    val houseid: Rep[Int] = column[Int]("HouseID", O.PrimaryKey, O.Default(0))
    /** Database column ClassID SqlType(INTEGER), Default(Some(4)) */
    val classid: Rep[Option[Int]] = column[Option[Int]]("ClassID", O.Default(Some(4)))
    /** Database column ChannelID SqlType(INTEGER), Default(Some(998)) */
    val channelid: Rep[Option[Int]] = column[Option[Int]]("ChannelID", O.Default(Some(998)))
    /** Database column HouseSource SqlType(VARCHAR), Length(50,true) */
    val housesource: Rep[Option[String]] = column[Option[String]]("HouseSource", O.Length(50,varying=true))
    /** Database column HouseQuyu SqlType(VARCHAR), Length(20,true) */
    val housequyu: Rep[Option[String]] = column[Option[String]]("HouseQuyu", O.Length(20,varying=true))
    /** Database column HouseDiZhi SqlType(VARCHAR), Length(50,true) */
    val housedizhi: Rep[Option[String]] = column[Option[String]]("HouseDiZhi", O.Length(50,varying=true))
    /** Database column HouseHuXing SqlType(VARCHAR), Length(50,true) */
    val househuxing: Rep[Option[String]] = column[Option[String]]("HouseHuXing", O.Length(50,varying=true))
    /** Database column HouseMianJi1 SqlType(NUMERIC), Default(0) */
    val housemianji1: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("HouseMianJi1", O.Default(scala.math.BigDecimal("0")))
    /** Database column HouseMianJi2 SqlType(NUMERIC), Default(0) */
    val housemianji2: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("HouseMianJi2", O.Default(scala.math.BigDecimal("0")))
    /** Database column HouseZuJin1 SqlType(NUMERIC), Default(Some(0)) */
    val housezujin1: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("HouseZuJin1", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column HouseZuJin2 SqlType(NUMERIC), Default(Some(0)) */
    val housezujin2: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("HouseZuJin2", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column HouseZuJinType SqlType(VARCHAR), Length(50,true) */
    val housezujintype: Rep[Option[String]] = column[Option[String]]("HouseZuJinType", O.Length(50,varying=true))
    /** Database column HouseZhiFu SqlType(VARCHAR), Length(50,true) */
    val housezhifu: Rep[Option[String]] = column[Option[String]]("HouseZhiFu", O.Length(50,varying=true))
    /** Database column HouseLouCeng SqlType(VARCHAR), Length(50,true) */
    val houselouceng: Rep[Option[String]] = column[Option[String]]("HouseLouCeng", O.Length(50,varying=true))
    /** Database column HouseLeiXing SqlType(VARCHAR), Length(20,true) */
    val houseleixing: Rep[Option[String]] = column[Option[String]]("HouseLeiXing", O.Length(20,varying=true))
    /** Database column HouseJiChu SqlType(VARCHAR), Length(255,true) */
    val housejichu: Rep[Option[String]] = column[Option[String]]("HouseJiChu", O.Length(255,varying=true))
    /** Database column HouseZhuangXiu SqlType(VARCHAR), Length(255,true) */
    val housezhuangxiu: Rep[Option[String]] = column[Option[String]]("HouseZhuangXiu", O.Length(255,varying=true))
    /** Database column HouseWeiSheng SqlType(VARCHAR), Length(255,true) */
    val houseweisheng: Rep[Option[String]] = column[Option[String]]("HouseWeiSheng", O.Length(255,varying=true))
    /** Database column HouseDianQi SqlType(VARCHAR), Length(255,true) */
    val housedianqi: Rep[Option[String]] = column[Option[String]]("HouseDianQi", O.Length(255,varying=true))
    /** Database column HouseJiaJu SqlType(VARCHAR), Length(255,true) */
    val housejiaju: Rep[Option[String]] = column[Option[String]]("HouseJiaJu", O.Length(255,varying=true))
    /** Database column HouseXinXi SqlType(VARCHAR), Length(255,true) */
    val housexinxi: Rep[Option[String]] = column[Option[String]]("HouseXinXi", O.Length(255,varying=true))
    /** Database column HouseShiZheng SqlType(VARCHAR), Length(255,true) */
    val houseshizheng: Rep[Option[String]] = column[Option[String]]("HouseShiZheng", O.Length(255,varying=true))
    /** Database column ZuLinStartDate SqlType(TIMESTAMP) */
    val zulinstartdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ZuLinStartDate")
    /** Database column ZuLinEndDate SqlType(TIMESTAMP) */
    val zulinenddate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ZuLinEndDate")
    /** Database column ContactName SqlType(VARCHAR), Length(20,true) */
    val contactname: Rep[String] = column[String]("ContactName", O.Length(20,varying=true))
    /** Database column ContactPhone SqlType(VARCHAR), Length(50,true) */
    val contactphone: Rep[String] = column[String]("ContactPhone", O.Length(50,varying=true))
    /** Database column ContactEmail SqlType(VARCHAR), Length(100,true) */
    val contactemail: Rep[Option[String]] = column[Option[String]]("ContactEmail", O.Length(100,varying=true))
    /** Database column ContactQQ SqlType(VARCHAR), Length(20,true) */
    val contactqq: Rep[Option[String]] = column[Option[String]]("ContactQQ", O.Length(20,varying=true))
    /** Database column Keyword SqlType(VARCHAR), Length(255,true) */
    val keyword: Rep[String] = column[String]("Keyword", O.Length(255,varying=true))
    /** Database column YouXiaoQi SqlType(VARCHAR), Length(20,true) */
    val youxiaoqi: Rep[Option[String]] = column[Option[String]]("YouXiaoQi", O.Length(20,varying=true))
    /** Database column HouseQiTa SqlType(VARCHAR), Length(16777216,true) */
    val houseqita: Rep[Option[String]] = column[Option[String]]("HouseQiTa", O.Length(16777216,varying=true))
    /** Database column Editor SqlType(VARCHAR), Length(20,true) */
    val editor: Rep[Option[String]] = column[Option[String]]("Editor", O.Length(20,varying=true))
    /** Database column UpdateTime SqlType(TIMESTAMP) */
    val updatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UpdateTime")
    /** Database column ViewAll SqlType(BOOLEAN) */
    val viewall: Rep[Option[Boolean]] = column[Option[Boolean]]("ViewAll")
    /** Database column Hits SqlType(INTEGER), Default(Some(0)) */
    val hits: Rep[Option[Int]] = column[Option[Int]]("Hits", O.Default(Some(0)))
    /** Database column Hot SqlType(BOOLEAN) */
    val hot: Rep[Option[Boolean]] = column[Option[Boolean]]("Hot")
    /** Database column OnTop SqlType(BOOLEAN) */
    val ontop: Rep[Option[Boolean]] = column[Option[Boolean]]("OnTop")
    /** Database column Elite SqlType(BOOLEAN) */
    val elite: Rep[Option[Boolean]] = column[Option[Boolean]]("Elite")
    /** Database column Passed SqlType(BOOLEAN) */
    val passed: Rep[Option[Boolean]] = column[Option[Boolean]]("Passed")
    /** Database column Deleted SqlType(BOOLEAN) */
    val deleted: Rep[Boolean] = column[Boolean]("Deleted")
    /** Database column CommendClassDays SqlType(INTEGER), Default(Some(0)) */
    val commendclassdays: Rep[Option[Int]] = column[Option[Int]]("CommendClassDays", O.Default(Some(0)))
    /** Database column UploadPhotos SqlType(VARCHAR), Length(16777216,true) */
    val uploadphotos: Rep[Option[String]] = column[Option[String]]("UploadPhotos", O.Length(16777216,varying=true))

    /** Index over (channelid) (database name PE_HOUSEQZ_CHANNELID) */
    val index1 = index("PE_HOUSEQZ_CHANNELID", channelid :: HNil)
    /** Index over (classid) (database name PE_HOUSEQZ_CLASSID) */
    val index2 = index("PE_HOUSEQZ_CLASSID", classid :: HNil)
    /** Index over (elite) (database name PE_HOUSEQZ_ELITE) */
    val index3 = index("PE_HOUSEQZ_ELITE", elite :: HNil)
    /** Index over (housemianji1) (database name PE_HOUSEQZ_FW_MIANJI) */
    val index4 = index("PE_HOUSEQZ_FW_MIANJI", housemianji1 :: HNil)
    /** Index over (hits) (database name PE_HOUSEQZ_HITS) */
    val index5 = index("PE_HOUSEQZ_HITS", hits :: HNil)
    /** Index over (housemianji2) (database name PE_HOUSEQZ_HOUSEMIANJI) */
    val index6 = index("PE_HOUSEQZ_HOUSEMIANJI", housemianji2 :: HNil)
    /** Index over (keyword) (database name PE_HOUSEQZ_KEY) */
    val index7 = index("PE_HOUSEQZ_KEY", keyword :: HNil)
    /** Index over (ontop) (database name PE_HOUSEQZ_ONTOP) */
    val index8 = index("PE_HOUSEQZ_ONTOP", ontop :: HNil)
    /** Index over (passed) (database name PE_HOUSEQZ_PASSED) */
    val index9 = index("PE_HOUSEQZ_PASSED", passed :: HNil)
    /** Index over (updatetime) (database name PE_HOUSEQZ_UPDATETIME) */
    val index10 = index("PE_HOUSEQZ_UPDATETIME", updatetime :: HNil)
  }
  /** Collection-like TableQuery object for table PeHouseqz */
  lazy val PeHouseqz = new TableQuery(tag => new PeHouseqz(tag))
}
