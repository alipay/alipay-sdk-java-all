package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索运营中具体运营的信息（基础信息、品牌直达、服务直达）
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:03:19
 */
public class SearchAbilityOrderData extends AlipayObject {

	private static final long serialVersionUID = 7297128161342793995L;

	/**
	 * 申请单类型
	 */
	@ApiField("access_type")
	private String accessType;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 小程序状态 ON_LINE、OFF_LINE
	 */
	@ApiField("app_status")
	private String appStatus;

	/**
	 * 小程序id
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 申请单id
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 申请状态 AGREE、REJECT、EDIT、AUDIT
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * bizId 为品牌box的boxID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 品牌box的上下架状态 ONLINE OFFLINE
	 */
	@ApiField("box_status")
	private String boxStatus;

	/**
	 * 品牌的模板id ONE_WITH_TWO：一拖二、DEFAULT：一拖四
	 */
	@ApiField("brand_template_id")
	private String brandTemplateId;

	/**
	 * 二级服务信息
	 */
	@ApiListField("children")
	@ApiField("search_ability_order_info_open_api")
	private List<SearchAbilityOrderInfoOpenApi> children;

	/**
	 * 二级服务的唯一标识
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 服务的唯一标识（优先使用serviceCode可忽略）
	 */
	@ApiField("id")
	private String id;

	/**
	 * 是否是老工单
	 */
	@ApiField("is_old_data")
	private String isOldData;

	/**
	 * 服务主状态,INITIAL:初始化；VALID：已生效；INVALID：已失效
	 */
	@ApiField("major_status")
	private String majorStatus;

	/**
	 * 上架时间
	 */
	@ApiField("online_time")
	private String onlineTime;

	/**
	 * 服务的可见性状态
	 */
	@ApiField("open_status")
	private Boolean openStatus;

	/**
	 * 下架操作者
	 */
	@ApiField("operator")
	private String operator;

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
	 * 服务码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 子功能描述
	 */
	@ApiField("sub_service_desc")
	private String subServiceDesc;

	/**
	 * 子功能名称
	 */
	@ApiField("sub_service_name")
	private String subServiceName;

	public String getAccessType() {
		return this.accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
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

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
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

	public List<SearchAbilityOrderInfoOpenApi> getChildren() {
		return this.children;
	}
	public void setChildren(List<SearchAbilityOrderInfoOpenApi> children) {
		this.children = children;
	}

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIsOldData() {
		return this.isOldData;
	}
	public void setIsOldData(String isOldData) {
		this.isOldData = isOldData;
	}

	public String getMajorStatus() {
		return this.majorStatus;
	}
	public void setMajorStatus(String majorStatus) {
		this.majorStatus = majorStatus;
	}

	public String getOnlineTime() {
		return this.onlineTime;
	}
	public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
	}

	public Boolean getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(Boolean openStatus) {
		this.openStatus = openStatus;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
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

	public String getSubServiceDesc() {
		return this.subServiceDesc;
	}
	public void setSubServiceDesc(String subServiceDesc) {
		this.subServiceDesc = subServiceDesc;
	}

	public String getSubServiceName() {
		return this.subServiceName;
	}
	public void setSubServiceName(String subServiceName) {
		this.subServiceName = subServiceName;
	}

}
