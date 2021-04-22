package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联的服务状态信息
 *
 * @author auto create
 * @since 1.0, 2020-12-17 19:24:15
 */
public class SearchOrderDetailDataInfo extends AlipayObject {

	private static final long serialVersionUID = 4815849544913383424L;

	/**
	 * 申请单类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
	 */
	@ApiField("access_type")
	private String accessType;

	/**
	 * 小程序类目名
	 */
	@ApiField("app_category")
	private String appCategory;

	/**
	 * 小程序图标
	 */
	@ApiField("app_icon")
	private String appIcon;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 小程序状态
	 */
	@ApiField("app_status")
	private String appStatus;

	/**
	 * 小程序id
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 申请状态
	 */
	@ApiField("base_order_status")
	private OrderStatusData baseOrderStatus;

	/**
	 * bizid 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 服务box状态
	 */
	@ApiField("box_order_status")
	private OrderStatusData boxOrderStatus;

	/**
	 * 上下架状态
	 */
	@ApiField("box_status")
	private String boxStatus;

	/**
	 * 品牌的模板id ONE_WITH_TWO：一拖二、DEFAULT：一拖四
	 */
	@ApiField("brand_template_id")
	private String brandTemplateId;

	/**
	 * 品牌box状态
	 */
	@ApiField("brandbox_orderstatus")
	private OrderStatusData brandboxOrderstatus;

	/**
	 * 是否可修改关键词
	 */
	@ApiField("can_modify_keyword")
	private Boolean canModifyKeyword;

	/**
	 * 服务描述
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 基础工单详情信息
	 */
	@ApiField("detail_base_items")
	private SearchOrderDetailDataBaseItems detailBaseItems;

	/**
	 * 品牌工单详情数据
	 */
	@ApiField("detail_brand_items")
	private SearchOrderDetailDataBrandItems detailBrandItems;

	/**
	 * 服务工单数据详情
	 */
	@ApiField("detail_service_items")
	private SearchOrderDetailDataServiceItems detailServiceItems;

	/**
	 * 最终状态
	 */
	@ApiField("final_status")
	private String finalStatus;

	/**
	 * 最后修改时间
	 */
	@ApiField("gmtmodified")
	private String gmtmodified;

	/**
	 * 关键词的修改时间
	 */
	@ApiField("keyword_gmt_modified")
	private String keywordGmtModified;

	/**
	 * 上架时间
	 */
	@ApiField("online_time")
	private String onlineTime;

	/**
	 * 操作人员类型
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 查询服务提供者生态类型 一二三方 1 | 2 | 3
	 */
	@ApiField("partner_type")
	private String partnerType;

	/**
	 * 驳回节点
	 */
	@ApiField("reject_node")
	private String rejectNode;

	/**
	 * 驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

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
	 * 服务名
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 申请单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 二级服务code
	 */
	@ApiField("sub_service_code")
	private String subServiceCode;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public String getAccessType() {
		return this.accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getAppCategory() {
		return this.appCategory;
	}
	public void setAppCategory(String appCategory) {
		this.appCategory = appCategory;
	}

	public String getAppIcon() {
		return this.appIcon;
	}
	public void setAppIcon(String appIcon) {
		this.appIcon = appIcon;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppStatus() {
		return this.appStatus;
	}
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public OrderStatusData getBaseOrderStatus() {
		return this.baseOrderStatus;
	}
	public void setBaseOrderStatus(OrderStatusData baseOrderStatus) {
		this.baseOrderStatus = baseOrderStatus;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public OrderStatusData getBoxOrderStatus() {
		return this.boxOrderStatus;
	}
	public void setBoxOrderStatus(OrderStatusData boxOrderStatus) {
		this.boxOrderStatus = boxOrderStatus;
	}

	public String getBoxStatus() {
		return this.boxStatus;
	}
	public void setBoxStatus(String boxStatus) {
		this.boxStatus = boxStatus;
	}

	public String getBrandTemplateId() {
		return this.brandTemplateId;
	}
	public void setBrandTemplateId(String brandTemplateId) {
		this.brandTemplateId = brandTemplateId;
	}

	public OrderStatusData getBrandboxOrderstatus() {
		return this.brandboxOrderstatus;
	}
	public void setBrandboxOrderstatus(OrderStatusData brandboxOrderstatus) {
		this.brandboxOrderstatus = brandboxOrderstatus;
	}

	public Boolean getCanModifyKeyword() {
		return this.canModifyKeyword;
	}
	public void setCanModifyKeyword(Boolean canModifyKeyword) {
		this.canModifyKeyword = canModifyKeyword;
	}

	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public SearchOrderDetailDataBaseItems getDetailBaseItems() {
		return this.detailBaseItems;
	}
	public void setDetailBaseItems(SearchOrderDetailDataBaseItems detailBaseItems) {
		this.detailBaseItems = detailBaseItems;
	}

	public SearchOrderDetailDataBrandItems getDetailBrandItems() {
		return this.detailBrandItems;
	}
	public void setDetailBrandItems(SearchOrderDetailDataBrandItems detailBrandItems) {
		this.detailBrandItems = detailBrandItems;
	}

	public SearchOrderDetailDataServiceItems getDetailServiceItems() {
		return this.detailServiceItems;
	}
	public void setDetailServiceItems(SearchOrderDetailDataServiceItems detailServiceItems) {
		this.detailServiceItems = detailServiceItems;
	}

	public String getFinalStatus() {
		return this.finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}

	public String getGmtmodified() {
		return this.gmtmodified;
	}
	public void setGmtmodified(String gmtmodified) {
		this.gmtmodified = gmtmodified;
	}

	public String getKeywordGmtModified() {
		return this.keywordGmtModified;
	}
	public void setKeywordGmtModified(String keywordGmtModified) {
		this.keywordGmtModified = keywordGmtModified;
	}

	public String getOnlineTime() {
		return this.onlineTime;
	}
	public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPartnerType() {
		return this.partnerType;
	}
	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public String getRejectNode() {
		return this.rejectNode;
	}
	public void setRejectNode(String rejectNode) {
		this.rejectNode = rejectNode;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
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

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
