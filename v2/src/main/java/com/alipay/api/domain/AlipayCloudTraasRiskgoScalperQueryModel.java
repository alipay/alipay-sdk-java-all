package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云行业黄牛风险识别
 *
 * @author auto create
 * @since 1.0, 2023-08-23 15:16:16
 */
public class AlipayCloudTraasRiskgoScalperQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1731295852419217864L;

	/**
	 * 设备唯一号码
	 */
	@ApiField("apdid")
	private String apdid;

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
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 填写风险咨询对象所关联的账号的真实身份认证时间
	 */
	@ApiField("certificate_date")
	private Date certificateDate;

	/**
	 * 填入渠道信息，辅助判断该咨询的风险来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 外部会员账号
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 邮箱账号，如无法提供，可填写为空值（null）
	 */
	@ApiField("email_address")
	private String emailAddress;

	/**
	 * app所在环境信息 当前字段已废弃(能力升级之后环境字段不再需要)
	 */
	@ApiField("env_id")
	@Deprecated
	private String envId;

	/**
	 * 手机序列号，如无法提供，可填写为空值（null）
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 国际移动用户识别码，如无法提供，可填写为空值（null）
	 */
	@ApiField("imsi")
	private String imsi;

	/**
	 * 如果business_code无法涵盖您的行业，在此填写中文描述 当前字段已废弃(能力升级之后该字段不再需要)
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
	 * 是否为员工账号
	 */
	@ApiField("is_employee")
	private String isEmployee;

	/**
	 * 服务商pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 用于输入用户产生交易等节点时的地理位置信息。如参数无法提供，请填写“null”
	 */
	@ApiField("lbs")
	private String lbs;

	/**
	 * 登陆账号的身份证号码
	 */
	@ApiField("login_cert")
	private String loginCert;

	/**
	 * 填写风险咨询对象关联账号的登录手机号
	 */
	@ApiField("login_phone")
	private String loginPhone;

	/**
	 * mac地址或设备唯一标识，如无法提供，可填写为空值（null）
	 */
	@ApiField("mac_address")
	private String macAddress;

	/**
	 * 收货地址
	 */
	@ApiField("mailing_address")
	private String mailingAddress;

	/**
	 * 收货手机号，用于区分mobile_no所填的手机号
	 */
	@ApiField("mailing_phone")
	private String mailingPhone;

	/**
	 * 如果风险咨询对象是支付宝商家，则填写pid
	 */
	@ApiField("mer_pid")
	private String merPid;

	/**
	 * 用于直接输入风险咨询对象的手机号码。如参数无法提供，请填写“null”
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 支付宝用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单所有商品信息（json格式描述） 当前字段已废弃(字段类型更新，新字段为： order_items_info_list)
	 */
	@ApiField("order_items_info")
	@Deprecated
	private RiskImagePlusQueryOrderInfo orderItemsInfo;

	/**
	 * 订单所有商品信息（json格式描述）
	 */
	@ApiListField("order_items_info_list")
	@ApiField("risk_image_plus_query_order_info")
	private List<RiskImagePlusQueryOrderInfo> orderItemsInfoList;

	/**
	 * 填入所咨询的唯一支付宝交易号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付宝外部交易号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 填写风险咨询对象所关联账号的注册身份证信息
	 */
	@ApiField("registration_cert")
	private String registrationCert;

	/**
	 * 填写风险咨询对象所关联的账号的注册时间
	 */
	@ApiField("registration_date")
	private Date registrationDate;

	/**
	 * 填写咨询对象所关联的注册手机号
	 */
	@ApiField("registration_phone")
	private String registrationPhone;

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
	 * 用户购买或使用服务时产生的具体金额总数。如参数无法提供，请填写“null”，人民币，单位：元
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
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getApdid() {
		return this.apdid;
	}
	public void setApdid(String apdid) {
		this.apdid = apdid;
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

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public Date getCertificateDate() {
		return this.certificateDate;
	}
	public void setCertificateDate(Date certificateDate) {
		this.certificateDate = certificateDate;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImsi() {
		return this.imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
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

	public String getIsEmployee() {
		return this.isEmployee;
	}
	public void setIsEmployee(String isEmployee) {
		this.isEmployee = isEmployee;
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

	public String getLoginCert() {
		return this.loginCert;
	}
	public void setLoginCert(String loginCert) {
		this.loginCert = loginCert;
	}

	public String getLoginPhone() {
		return this.loginPhone;
	}
	public void setLoginPhone(String loginPhone) {
		this.loginPhone = loginPhone;
	}

	public String getMacAddress() {
		return this.macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getMailingAddress() {
		return this.mailingAddress;
	}
	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getMailingPhone() {
		return this.mailingPhone;
	}
	public void setMailingPhone(String mailingPhone) {
		this.mailingPhone = mailingPhone;
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

	public RiskImagePlusQueryOrderInfo getOrderItemsInfo() {
		return this.orderItemsInfo;
	}
	public void setOrderItemsInfo(RiskImagePlusQueryOrderInfo orderItemsInfo) {
		this.orderItemsInfo = orderItemsInfo;
	}

	public List<RiskImagePlusQueryOrderInfo> getOrderItemsInfoList() {
		return this.orderItemsInfoList;
	}
	public void setOrderItemsInfoList(List<RiskImagePlusQueryOrderInfo> orderItemsInfoList) {
		this.orderItemsInfoList = orderItemsInfoList;
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

	public String getRegistrationCert() {
		return this.registrationCert;
	}
	public void setRegistrationCert(String registrationCert) {
		this.registrationCert = registrationCert;
	}

	public Date getRegistrationDate() {
		return this.registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getRegistrationPhone() {
		return this.registrationPhone;
	}
	public void setRegistrationPhone(String registrationPhone) {
		this.registrationPhone = registrationPhone;
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
