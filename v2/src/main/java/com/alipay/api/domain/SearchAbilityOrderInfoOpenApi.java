package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营申请单详情数据
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:03:19
 */
public class SearchAbilityOrderInfoOpenApi extends AlipayObject {

	private static final long serialVersionUID = 7853448796533267384L;

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
	 * 小程序状态
	 */
	@ApiField("app_status")
	private String appStatus;

	/**
	 * 审核状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 运营申请单详情biz_id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 上架状态
	 */
	@ApiField("box_status")
	private String boxStatus;

	/**
	 * 品牌模板id
	 */
	@ApiField("brand_template_id")
	private String brandTemplateId;

	/**
	 * 二级服务唯一标识
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * 最近更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 是否老工单
	 */
	@ApiField("is_old_data")
	private Boolean isOldData;

	/**
	 * 服务主状态
	 */
	@ApiField("major_status")
	private String majorStatus;

	/**
	 * 上架时间
	 */
	@ApiField("online_time")
	private String onlineTime;

	/**
	 * 小程序可见性
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
	 * 小程序id
	 */
	@ApiField("search_app_id")
	private String searchAppId;

	/**
	 * 应用标识
	 */
	@ApiField("sepc_code")
	private String sepcCode;

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

	public Boolean getIsOldData() {
		return this.isOldData;
	}
	public void setIsOldData(Boolean isOldData) {
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

	public String getSearchAppId() {
		return this.searchAppId;
	}
	public void setSearchAppId(String searchAppId) {
		this.searchAppId = searchAppId;
	}

	public String getSepcCode() {
		return this.sepcCode;
	}
	public void setSepcCode(String sepcCode) {
		this.sepcCode = sepcCode;
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
