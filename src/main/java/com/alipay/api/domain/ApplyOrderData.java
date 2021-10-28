package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 申请单基础信息
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:03:04
 */
public class ApplyOrderData extends AlipayObject {

	private static final long serialVersionUID = 8343668749639956871L;

	/**
	 * 申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
	 */
	@ApiField("access_type")
	private String accessType;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 小程序id
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 审核原因
	 */
	@ApiField("audit_reason")
	private String auditReason;

	/**
	 * 品牌的模板id ONE_WITH_TWO：一拖二、DEFAULT：一拖四
	 */
	@ApiField("brand_template_id")
	private String brandTemplateId;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 标识老工单
	 */
	@ApiField("is_old_data")
	private Boolean isOldData;

	/**
	 * 是不是最新的工单
	 */
	@ApiField("latest")
	private Boolean latest;

	/**
	 * 服务主状态,INITIAL:初始化；VALID：已生效；INVALID：已失效
	 */
	@ApiField("major_status")
	private String majorStatus;

	/**
	 * 申请单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 审核提效部分剔除数据的信息
	 */
	@ApiListField("part_agree_info")
	@ApiField("search_part_agree_info")
	private List<SearchPartAgreeInfo> partAgreeInfo;

	/**
	 * 场景编码
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
	 * 申请状态 AGREE、REJECT、EDIT、AUDIT
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子服务名称
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

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAuditReason() {
		return this.auditReason;
	}
	public void setAuditReason(String auditReason) {
		this.auditReason = auditReason;
	}

	public String getBrandTemplateId() {
		return this.brandTemplateId;
	}
	public void setBrandTemplateId(String brandTemplateId) {
		this.brandTemplateId = brandTemplateId;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Boolean getIsOldData() {
		return this.isOldData;
	}
	public void setIsOldData(Boolean isOldData) {
		this.isOldData = isOldData;
	}

	public Boolean getLatest() {
		return this.latest;
	}
	public void setLatest(Boolean latest) {
		this.latest = latest;
	}

	public String getMajorStatus() {
		return this.majorStatus;
	}
	public void setMajorStatus(String majorStatus) {
		this.majorStatus = majorStatus;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<SearchPartAgreeInfo> getPartAgreeInfo() {
		return this.partAgreeInfo;
	}
	public void setPartAgreeInfo(List<SearchPartAgreeInfo> partAgreeInfo) {
		this.partAgreeInfo = partAgreeInfo;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubServiceName() {
		return this.subServiceName;
	}
	public void setSubServiceName(String subServiceName) {
		this.subServiceName = subServiceName;
	}

}
