package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云行业坏账风险识别
 *
 * @author auto create
 * @since 1.0, 2023-09-21 22:24:16
 */
public class AlipayCloudTraasRiskgoBaddebtQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4181652919477643999L;

	/**
	 * 可填入活动id唯一值，或其他活动信息
	 */
	@ApiField("activity_info")
	private String activityInfo;

	/**
	 * 终端唯一标识
	 */
	@ApiField("apdid")
	private String apdid;

	/**
	 * 风险咨询方所属的行业类目
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * 用于输入用户的身份证 号码。如无法提供，可填写为空值（null）
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * app所在环境id 当前字段已废弃(环境信息不再需要，故废弃)
	 */
	@ApiField("env_id")
	@Deprecated
	private String envId;

	/**
	 * 所属行业信息 当前字段已废弃(行业信息统一至business_code 字段，不再保留该字段)
	 */
	@ApiField("industry")
	@Deprecated
	private String industry;

	/**
	 * 账户登录IP，如无法提供，可填写为空值（null）
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * 服务商pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 地理位置坐标
	 */
	@ApiField("lbs")
	private String lbs;

	/**
	 * 支付宝商家id : 事件属性-merPid 字段说明：如果风险咨询对象是支付宝商家，则填写pid
	 */
	@ApiField("mer_pid")
	private String merPid;

	/**
	 * 用于输入用户注册支付宝的手机号码。如参数无法提供，请填写“null”
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 支付宝用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用于代表商户风险类型，请按示例值填写
	 */
	@ApiField("risk_type")
	private String riskType;

	/**
	 * 填写风险咨询中对应的商户或服务商对于蚂蚁的类型
	 */
	@ApiField("role")
	private String role;

	/**
	 * 风险咨询对应的自身业务场景或事咨询环节，如有疑问可沟通
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 用户匹配服务类型, 请按照示例值填写
	 */
	@ApiField("service")
	private String service;

	/**
	 * 服务二级分类，按照文档介绍填写，如无可不填
	 */
	@ApiField("service_category")
	private String serviceCategory;

	/**
	 * 用户购买或使用服务时产生的具体金额。如参数无法提供，请填写“null”；单位:元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 用户购买或使用服务时产生的具体商品数量。如参数无法提供，请填写“null”
	 */
	@ApiField("total_quantity")
	private String totalQuantity;

	/**
	 * 用于输入用户支付宝的 2088 账号，如不了解此字段如何获取，可了解下静默授权。如参数无法提供，请填写“null”
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getActivityInfo() {
		return this.activityInfo;
	}
	public void setActivityInfo(String activityInfo) {
		this.activityInfo = activityInfo;
	}

	public String getApdid() {
		return this.apdid;
	}
	public void setApdid(String apdid) {
		this.apdid = apdid;
	}

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getIp() {
		return this.ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getLbs() {
		return this.lbs;
	}
	public void setLbs(String lbs) {
		this.lbs = lbs;
	}

	public String getMerPid() {
		return this.merPid;
	}
	public void setMerPid(String merPid) {
		this.merPid = merPid;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getService() {
		return this.service;
	}
	public void setService(String service) {
		this.service = service;
	}

	public String getServiceCategory() {
		return this.serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTotalQuantity() {
		return this.totalQuantity;
	}
	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
