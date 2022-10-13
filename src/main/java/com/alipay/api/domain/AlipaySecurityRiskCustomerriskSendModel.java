package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户数据同步
 *
 * @author auto create
 * @since 1.0, 2022-05-12 10:26:35
 */
public class AlipaySecurityRiskCustomerriskSendModel extends AlipayObject {

	private static final long serialVersionUID = 6375336584337544692L;

	/**
	 * 交易对应的银行卡的卡号（支付宝直连和间连合作伙伴均可回传此参数）
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 该账号对应的营业执照号码（支付宝直连和间连合作伙伴均可回传此参数）
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 该用户对应的身份证号码（支付宝直连和间连合作伙伴均可回传此参数）
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 账户注册时填写的邮箱地址(适用于支付宝直连商户回传此信息)
	 */
	@ApiField("email_address")
	private String emailAddress;

	/**
	 * 适用于间连业务场景下，商户在银行被分配的ID（适用于支付宝间连合作伙伴回传此信息）
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 该笔风险交易购买的具体商品名称（适用于支付宝直连商户回传此信息）
	 */
	@ApiField("merch_name")
	private String merchName;

	/**
	 * 手机（支付宝直连和间连合作伙伴均可回传此参数）
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 该账号登录合作伙伴平台时的IP地址（适用于支付宝直连商户回传此信息）
	 */
	@ApiField("mobile_ip")
	private String mobileIp;

	/**
	 * 该账户在商户平台下单时的MAC地址或IP地址（适用于支付宝直连商户回传此信息）
	 */
	@ApiField("order_ip")
	private String orderIp;

	/**
	 * 适用于直连商户场景下的支付宝合作伙伴ID（适用于支付宝直连合作伙伴回传此信息）
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 指第三方在商户平台注册成功后，平台给予的账户号（适用于支付宝直连商户回传此信息）
	 */
	@ApiField("plat_account")
	private String platAccount;

	/**
	 * 直连场景下，商户对该账户采取的措施：
多种处理结果可调用多次，每次回传一种处理结果。
（01：暂停发货；
02：延迟结算；
03：关停账户；
04：暂停发货+关停账户；
05：延迟结算+关停账户；
06：其他；
07：平台进行退款退订；
08：平台跟用户沟通后，用户撤诉。
间连场景下，商户回传处理结果：
对商户的处理情况：
01：已延迟结算，02：关停商户，99：其他
多重处理结果可调用多次，每次回传一种处理结果
	 */
	@ApiField("process_code")
	private String processCode;

	/**
	 * 指间连交易场景下商家被支付宝分配的ID（适用于支付宝间连合作伙伴回传此信息）
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 支付宝推送的风险消息中的交易号（支付宝直连和间连合作伙伴均需回传此参数）
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getMerchName() {
		return this.merchName;
	}
	public void setMerchName(String merchName) {
		this.merchName = merchName;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobileIp() {
		return this.mobileIp;
	}
	public void setMobileIp(String mobileIp) {
		this.mobileIp = mobileIp;
	}

	public String getOrderIp() {
		return this.orderIp;
	}
	public void setOrderIp(String orderIp) {
		this.orderIp = orderIp;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPlatAccount() {
		return this.platAccount;
	}
	public void setPlatAccount(String platAccount) {
		this.platAccount = platAccount;
	}

	public String getProcessCode() {
		return this.processCode;
	}
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
