package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建搜索运营申请单的入参
 *
 * @author auto create
 * @since 1.0, 2020-12-15 19:21:27
 */
public class SearchOrderCreateRequest extends AlipayObject {

	private static final long serialVersionUID = 3328277611573385946L;

	/**
	 * 创建方式
	 */
	@ApiField("access_mode")
	private String accessMode;

	/**
	 * 搜索直达类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
	 */
	@ApiField("access_type")
	private String accessType;

	/**
	 * 处理动作 on off
	 */
	@ApiField("action")
	private String action;

	/**
	 * 小程序名字
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 小程序Id
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 基础信息申请单提报详情
	 */
	@ApiField("base_items")
	private SearchBaseItems baseItems;

	/**
	 * bizId 为品牌box的boxID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 品牌box降级
	 */
	@ApiField("brand_down_grade")
	private Boolean brandDownGrade;

	/**
	 * 品牌box申请单提报详情
	 */
	@ApiField("brand_items")
	private SearchBrandItems brandItems;

	/**
	 * 申请单创建来源类型
	 */
	@ApiField("create_type")
	private String createType;

	/**
	 * 二级服务唯一标识
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * 服务描述
	 */
	@ApiField("descprise")
	private String descprise;

	/**
	 * 是否为草稿态
	 */
	@ApiField("is_draft")
	private Boolean isDraft;

	/**
	 * 关键词
	 */
	@ApiField("key_words")
	private String keyWords;

	/**
	 * 上架时间
	 */
	@ApiField("online_time")
	private String onlineTime;

	/**
	 * 申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 父工单id
	 */
	@ApiField("ref_apply_id")
	private String refApplyId;

	/**
	 * 场景code
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 场景名称
	 */
	@ApiField("scene_name")
	private String sceneName;

	/**
	 * 服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务申请单提报信息详情
	 */
	@ApiField("service_items")
	private SearchServiceItems serviceItems;

	/**
	 * 服务的类型 SP_MINI_APP 小程序 SP_PUBLIC_APP 生活号
	 */
	@ApiField("spec_code")
	private String specCode;

	/**
	 * 二级服务code
	 */
	@ApiField("sub_service_code")
	private String subServiceCode;

	/**
	 * 搜索模板id 品牌的模板id ONE_WITH_TWO：一拖二、DEFAULT：一拖四
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 搜索模板类型
	 */
	@ApiField("template_type")
	private String templateType;

	public String getAccessMode() {
		return this.accessMode;
	}
	public void setAccessMode(String accessMode) {
		this.accessMode = accessMode;
	}

	public String getAccessType() {
		return this.accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public SearchBaseItems getBaseItems() {
		return this.baseItems;
	}
	public void setBaseItems(SearchBaseItems baseItems) {
		this.baseItems = baseItems;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Boolean getBrandDownGrade() {
		return this.brandDownGrade;
	}
	public void setBrandDownGrade(Boolean brandDownGrade) {
		this.brandDownGrade = brandDownGrade;
	}

	public SearchBrandItems getBrandItems() {
		return this.brandItems;
	}
	public void setBrandItems(SearchBrandItems brandItems) {
		this.brandItems = brandItems;
	}

	public String getCreateType() {
		return this.createType;
	}
	public void setCreateType(String createType) {
		this.createType = createType;
	}

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public String getDescprise() {
		return this.descprise;
	}
	public void setDescprise(String descprise) {
		this.descprise = descprise;
	}

	public Boolean getIsDraft() {
		return this.isDraft;
	}
	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}

	public String getKeyWords() {
		return this.keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public String getOnlineTime() {
		return this.onlineTime;
	}
	public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRefApplyId() {
		return this.refApplyId;
	}
	public void setRefApplyId(String refApplyId) {
		this.refApplyId = refApplyId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public SearchServiceItems getServiceItems() {
		return this.serviceItems;
	}
	public void setServiceItems(SearchServiceItems serviceItems) {
		this.serviceItems = serviceItems;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getSubServiceCode() {
		return this.subServiceCode;
	}
	public void setSubServiceCode(String subServiceCode) {
		this.subServiceCode = subServiceCode;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

}
