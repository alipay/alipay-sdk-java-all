package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销风险识别
 *
 * @author auto create
 * @since 1.0, 2024-04-02 11:08:51
 */
public class AlipaySecurityRiskMarketingAwardingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2632111864174817816L;

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
	 * 区分咨询渠道，通过哪个平台/业务接入的咨询服务
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市编码；请按照
<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx">城编码</a> 表格中内容填写。 
（参考资料： 
<a href="http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/">参考资料</a>）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 外部会员账号
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 区域编码；请按照
<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx">区域编码</a>
 表格中内容填写。 （参考资料： 
<a href="http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/">参考资料</a>）
	 */
	@ApiField("district_code")
	private String districtCode;

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
	 * 用于输入用户产生交易时的地理位置信息。如参数无法提供，请填写“null”
	 */
	@ApiField("lbs")
	private String lbs;

	/**
	 * 支付宝商家id :  事件属性-merPid 字段说明：如果风险咨询对象是支付宝商家，则填写pid
	 */
	@ApiField("mer_pid")
	private String merPid;

	/**
	 * 风险咨询类型：01：普惠版；02：RL邀请；默认传01；
	 */
	@ApiField("merchant_scene")
	private String merchantScene;

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
	 * 对方支付宝账户openid
	 */
	@ApiField("opposing_open_id")
	private String opposingOpenId;

	/**
	 * 用于表示两个账户在业务交互中的对方账户，如人传人活动用户A会拉用户B来注册领奖，其中用户B为对方账户
	 */
	@ApiField("opposing_userid")
	private String opposingUserid;

	/**
	 * 省编码；请按照
<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx">省编码</a>表格中内容填写。 
（参考资料： 
<a href="http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/">参考资料</a>）
	 */
	@ApiField("province_code")
	private String provinceCode;

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
	 * 用户购买或使用服务时产生的具体金额(单位:元)。如参数无法提供，请填写“null”
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
	 * 用于输入用户支付宝的 2088 账号，如不了解此字段如何获取，可了解下静默授权。如参数无法提供，请填写“null”
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

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

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
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

	public String getMerchantScene() {
		return this.merchantScene;
	}
	public void setMerchantScene(String merchantScene) {
		this.merchantScene = merchantScene;
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

	public String getOpposingOpenId() {
		return this.opposingOpenId;
	}
	public void setOpposingOpenId(String opposingOpenId) {
		this.opposingOpenId = opposingOpenId;
	}

	public String getOpposingUserid() {
		return this.opposingUserid;
	}
	public void setOpposingUserid(String opposingUserid) {
		this.opposingUserid = opposingUserid;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
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
