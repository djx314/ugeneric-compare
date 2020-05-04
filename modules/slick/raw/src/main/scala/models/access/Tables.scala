package models.access
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = utils.slick.UCanAccessDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.)
    Each generated XXXXTable trait is mixed in this trait hence allowing access to all the TableQuery lazy vals.
  */
trait Tables
    extends PeJobcategoryTable
    with PeDelivertypeTable
    with PeSpacephotoTable
    with PePositionTable
    with PeShoppingcartsTable
    with PeSpacediaryTable
    with PeEquipmentTable
    with PeSurveyTable
    with PeHouseqgTable
    with PeDeliverchargeTable
    with PeInfosTable
    with PeDownerrorTable
    with PeFskindTable
    with PePayplatformTable
    with PeHistrolynewsTable
    with PeTemplateTable
    with PeAdvertisementTable
    with PeSurveyinputTable
    with PeProductTable
    with PeSkinTable
    with PeCardTable
    with PeSpecialTable
    with PePageTable
    with PeUseddetailTable
    with PeSpacebookTable
    with PeVoteTable
    with PeTrademarkTable
    with PeProvinceTable
    with PeHouseconfigTable
    with PeDownserverTable
    with PeWorkplaceTable
    with PeFiltersTable
    with PeAdminTable
    with PeKeylinkTable
    with PeSoftTable
    with PeResumeTable
    with PeSurveyquestionTable
    with PeConsumelogTable
    with PeCityTable
    with PeClientTable
    with PeHouseareaTable
    with PeTemplateprojectTable
    with PeSpacecommentTable
    with PeAuthorTable
    with PeBankTable
    with PeComplainitemTable
    with PeClassroomTable
    with PeCountryTable
    with PeOrderformTable
    with PeNotdownTable
    with PeDeliveritemTable
    with PeCommentTable
    with PeInvoiceitemTable
    with PeOrderformitemTable
    with PeSupplyCompanyTable
    with PeLogTable
    with PePaymentTable
    with PePositionsupplyinfoTable
    with PeSpaceTable
    with PeNewkeysTable
    with PeMailchannelTable
    with PeServiceitemTable
    with PePaymenttypeTable
    with PeMessageTable
    with PeUsergroupTable
    with PeUserTable
    with PeContacterTable
    with PeSpacelinkTable
    with PePageclassTable
    with PeFriendTable
    with PeGuestbookTable
    with PeItemTable
    with PeHouseczTable
    with PePhotoTable
    with PeSpacemusicTable
    with PeHouseqzTable
    with PeArticleTable
    with PeAnnounceTable
    with PeSurveyanswerTable
    with PeFieldTable
    with PeTransferitemTable
    with PeFavoriteTable
    with PeRechargelogTable
    with PeJsfileTable
    with PeLabelTable
    with PeProducerTable
    with PeSupplyTable
    with PePresentprojectTable
    with PeClassTable
    with PeBankrollitemTable
    with PeFriendsiteTable
    with PeAreacollectionTable
    with PeGuestkindTable
    with PeAdzoneTable
    with PeHousehzTable
    with PeConfigTable
    with PeCompanyTable
    with PeSurveyrecordTable
    with PeDictionaryTable
    with PeSpacekindTable
    with PeSubcompanyTable
    with PeSpacevisitorTable
    with PeCopyfromTable
    with PeHousecsTable
    with PeChannelTable {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(
    PeAdmin.schema,
    PeAdvertisement.schema,
    PeAdzone.schema,
    PeAnnounce.schema,
    PeAreacollection.schema,
    PeArticle.schema,
    PeAuthor.schema,
    PeBank.schema,
    PeBankrollitem.schema,
    PeCard.schema,
    PeChannel.schema,
    PeCity.schema,
    PeClass.schema,
    PeClassroom.schema,
    PeClient.schema,
    PeComment.schema,
    PeCompany.schema,
    PeComplainitem.schema,
    PeConfig.schema,
    PeConsumelog.schema,
    PeContacter.schema,
    PeCopyfrom.schema,
    PeCountry.schema,
    PeDelivercharge.schema,
    PeDeliveritem.schema,
    PeDelivertype.schema,
    PeDictionary.schema,
    PeDownerror.schema,
    PeDownserver.schema,
    PeEquipment.schema,
    PeFavorite.schema,
    PeField.schema,
    PeFilters.schema,
    PeFriend.schema,
    PeFriendsite.schema,
    PeFskind.schema,
    PeGuestbook.schema,
    PeGuestkind.schema,
    PeHistrolynews.schema,
    PeHousearea.schema,
    PeHouseconfig.schema,
    PeHousecs.schema,
    PeHousecz.schema,
    PeHousehz.schema,
    PeHouseqg.schema,
    PeHouseqz.schema,
    PeInfos.schema,
    PeInvoiceitem.schema,
    PeItem.schema,
    PeJobcategory.schema,
    PeJsfile.schema,
    PeKeylink.schema,
    PeLabel.schema,
    PeLog.schema,
    PeMailchannel.schema,
    PeMessage.schema,
    PeNewkeys.schema,
    PeNotdown.schema,
    PeOrderform.schema,
    PeOrderformitem.schema,
    PePage.schema,
    PePageclass.schema,
    PePayment.schema,
    PePaymenttype.schema,
    PePayplatform.schema,
    PePhoto.schema,
    PePosition.schema,
    PePositionsupplyinfo.schema,
    PePresentproject.schema,
    PeProducer.schema,
    PeProduct.schema,
    PeProvince.schema,
    PeRechargelog.schema,
    PeResume.schema,
    PeServiceitem.schema,
    PeShoppingcarts.schema,
    PeSkin.schema,
    PeSoft.schema,
    PeSpace.schema,
    PeSpacebook.schema,
    PeSpacecomment.schema,
    PeSpacediary.schema,
    PeSpacekind.schema,
    PeSpacelink.schema,
    PeSpacemusic.schema,
    PeSpacephoto.schema,
    PeSpacevisitor.schema,
    PeSpecial.schema,
    PeSubcompany.schema,
    PeSupply.schema,
    PeSupplyCompany.schema,
    PeSurvey.schema,
    PeSurveyanswer.schema,
    PeSurveyinput.schema,
    PeSurveyquestion.schema,
    PeSurveyrecord.schema,
    PeTemplate.schema,
    PeTemplateproject.schema,
    PeTrademark.schema,
    PeTransferitem.schema,
    PeUseddetail.schema,
    PeUser.schema,
    PeUsergroup.schema,
    PeVote.schema,
    PeWorkplace.schema
  ).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

}
