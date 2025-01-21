package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云行业刷单风险识别
 *
 * @author auto create
 * @since 1.0, 2023-09-21 22:28:51
 */
public class AlipayCloudTraasRiskgoFarmingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6578844218576821542L;

	/**
	 * 可填入活动id唯一值，或其他活动信息
	 */
	@ApiField("activity_info")
	private String activityInfo;

	/**
	 * 银行卡号，如无法提供，可填写为空值（null）
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

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
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 小程序环境id 当前字段已废弃(不再需要环境信息，故废弃)
	 */
	@ApiField("env_id")
	@Deprecated
	private String envId;

	/**
	 * 行业信息 当前字段已废弃(行业信息统一至business_code，不再保留该字段)
	 */
	@ApiField("industry")
	@Deprecated
	private String industry;

	/**
	 * 账户IP，如无法提供，可填写为空值（null）
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
	 * 支付宝内部交易号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付宝外部交易号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 门店地址；不需要传城市和行政区
	 */
	@ApiField("outlet_address")
	private String outletAddress;

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
	 * 单位：元。用户购买商品服务时支付的总金额
	 */
	@ApiField("sales_amount")
	private String salesAmount;

	/**
	 * 风险咨询对应的自身业务场景/环节
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 用户匹配服务类型, 请按照示例值填写
	 */
	@ApiField("service")
	private String service;

	/**
	 * 门店行业类目
	 */
	@ApiField("store_mcc_desc")
	private String storeMccDesc;

	/**
	 * 店铺名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityInfo() {
		return this.activityInfo;
	}
	public void setActivityInfo(String activityInfo) {
		this.activityInfo = activityInfo;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
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

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutletAddress() {
		return this.outletAddress;
	}
	public void setOutletAddress(String outletAddress) {
		this.outletAddress = outletAddress;
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

	public String getSalesAmount() {
		return this.salesAmount;
	}
	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
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

	public String getStoreMccDesc() {
		return this.storeMccDesc;
	}
	public void setStoreMccDesc(String storeMccDesc) {
		this.storeMccDesc = storeMccDesc;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
