package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下打卡配置接口修改
 *
 * @author auto create
 * @since 1.0, 2026-05-25 17:57:54
 */
public class AlipayOfflineProviderCheckconfigCheckconfigModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2484974523146943719L;

	/**
	 * 活动编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 活动规则按钮名称
	 */
	@ApiField("activity_rule_button_name")
	private String activityRuleButtonName;

	/**
	 * 跳转类型：link(链接)、img(图片)
	 */
	@ApiField("activity_rule_jump_type")
	private String activityRuleJumpType;

	/**
	 * 打卡模式：NORMAL(通用模式)、AOI_plugin(AOI打卡模式)
	 */
	@ApiField("check_activity_delivery_channel")
	private String checkActivityDeliveryChannel;

	/**
	 * 打卡模板类型
	 */
	@ApiField("check_template_type")
	private String checkTemplateType;

	/**
	 * 收集品名称
	 */
	@ApiField("collection_name")
	private String collectionName;

	/**
	 * 打卡类型
	 */
	@ApiField("collection_type")
	private String collectionType;

	/**
	 * 每日活动更新
	 */
	@ApiField("day_update_activity")
	private String dayUpdateActivity;

	/**
	 * 活动规则配置（图片URL）
	 */
	@ApiField("guide_image")
	private String guideImage;

	/**
	 * mall_id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 强制展示（1次）
	 */
	@ApiField("must_to_descrition")
	private String mustToDescrition;

	/**
	 * 支付结果页插件投放
	 */
	@ApiField("open_pay_result_page")
	private String openPayResultPage;

	/**
	 * 是否开启分享
	 */
	@ApiField("open_share")
	private String openShare;

	/**
	 * 场馆展示
	 */
	@ApiField("open_venue_exhibifion")
	private String openVenueExhibifion;

	/**
	 * 支付结果页跳转链接
	 */
	@ApiField("pay_result_page_action_url")
	private String payResultPageActionUrl;

	/**
	 * 随机收集
	 */
	@ApiField("random_check_place")
	private String randomCheckPlace;

	/**
	 * 关联地图
	 */
	@ApiField("rel_map")
	private String relMap;

	/**
	 * 关联展商页
	 */
	@ApiField("rel_merchant_page")
	private String relMerchantPage;

	/**
	 * 服务商AppId
	 */
	@ApiField("service_provider_pid")
	private String serviceProviderPid;

	/**
	 * 订阅打卡进度
	 */
	@ApiField("sync_service_provider")
	private String syncServiceProvider;

	/**
	 * 活动logo
	 */
	@ApiField("title_image")
	private String titleImage;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityRuleButtonName() {
		return this.activityRuleButtonName;
	}
	public void setActivityRuleButtonName(String activityRuleButtonName) {
		this.activityRuleButtonName = activityRuleButtonName;
	}

	public String getActivityRuleJumpType() {
		return this.activityRuleJumpType;
	}
	public void setActivityRuleJumpType(String activityRuleJumpType) {
		this.activityRuleJumpType = activityRuleJumpType;
	}

	public String getCheckActivityDeliveryChannel() {
		return this.checkActivityDeliveryChannel;
	}
	public void setCheckActivityDeliveryChannel(String checkActivityDeliveryChannel) {
		this.checkActivityDeliveryChannel = checkActivityDeliveryChannel;
	}

	public String getCheckTemplateType() {
		return this.checkTemplateType;
	}
	public void setCheckTemplateType(String checkTemplateType) {
		this.checkTemplateType = checkTemplateType;
	}

	public String getCollectionName() {
		return this.collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public String getCollectionType() {
		return this.collectionType;
	}
	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}

	public String getDayUpdateActivity() {
		return this.dayUpdateActivity;
	}
	public void setDayUpdateActivity(String dayUpdateActivity) {
		this.dayUpdateActivity = dayUpdateActivity;
	}

	public String getGuideImage() {
		return this.guideImage;
	}
	public void setGuideImage(String guideImage) {
		this.guideImage = guideImage;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getMustToDescrition() {
		return this.mustToDescrition;
	}
	public void setMustToDescrition(String mustToDescrition) {
		this.mustToDescrition = mustToDescrition;
	}

	public String getOpenPayResultPage() {
		return this.openPayResultPage;
	}
	public void setOpenPayResultPage(String openPayResultPage) {
		this.openPayResultPage = openPayResultPage;
	}

	public String getOpenShare() {
		return this.openShare;
	}
	public void setOpenShare(String openShare) {
		this.openShare = openShare;
	}

	public String getOpenVenueExhibifion() {
		return this.openVenueExhibifion;
	}
	public void setOpenVenueExhibifion(String openVenueExhibifion) {
		this.openVenueExhibifion = openVenueExhibifion;
	}

	public String getPayResultPageActionUrl() {
		return this.payResultPageActionUrl;
	}
	public void setPayResultPageActionUrl(String payResultPageActionUrl) {
		this.payResultPageActionUrl = payResultPageActionUrl;
	}

	public String getRandomCheckPlace() {
		return this.randomCheckPlace;
	}
	public void setRandomCheckPlace(String randomCheckPlace) {
		this.randomCheckPlace = randomCheckPlace;
	}

	public String getRelMap() {
		return this.relMap;
	}
	public void setRelMap(String relMap) {
		this.relMap = relMap;
	}

	public String getRelMerchantPage() {
		return this.relMerchantPage;
	}
	public void setRelMerchantPage(String relMerchantPage) {
		this.relMerchantPage = relMerchantPage;
	}

	public String getServiceProviderPid() {
		return this.serviceProviderPid;
	}
	public void setServiceProviderPid(String serviceProviderPid) {
		this.serviceProviderPid = serviceProviderPid;
	}

	public String getSyncServiceProvider() {
		return this.syncServiceProvider;
	}
	public void setSyncServiceProvider(String syncServiceProvider) {
		this.syncServiceProvider = syncServiceProvider;
	}

	public String getTitleImage() {
		return this.titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}

}
