package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保企业信息
 *
 * @author auto create
 * @since 1.0, 2024-11-05 10:38:17
 */
public class InsureCompany extends AlipayObject {

	private static final long serialVersionUID = 4819811255132659179L;

	/**
	 * 参与方唯一标识，当alipay_account_type为ALIPAY_USER_ID是表示支付宝2088uid,当alipay_account_type为ALIPAY_LOGON_ID时表示支付宝登录号
	 */
	@ApiField("alipay_account_no")
	private String alipayAccountNo;

	/**
	 * 账号主体id
	 */
	@ApiField("alipay_account_open_id")
	private String alipayAccountOpenId;

	/**
	 * 账号主体类型，默认ALIPAY_USER_ID
	 */
	@ApiField("alipay_account_type")
	private String alipayAccountType;

	/**
	 * 商户/企业名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 社会统一信用代码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型 社会信用编号 23 身份证号 10
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 渠道用户ID
	 */
	@ApiField("channel_account_id")
	private String channelAccountId;

	/**
	 * 渠道用户ID
	 */
	@ApiField("channel_account_open_id")
	private String channelAccountOpenId;

	/**
	 * 渠道用户类型
	 */
	@ApiField("channel_account_type")
	private String channelAccountType;

	/**
	 * 企业社会信用编号
	 */
	@ApiField("company_cert_no")
	private String companyCertNo;

	/**
	 * 企业中文名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getAlipayAccountNo() {
		return this.alipayAccountNo;
	}
	public void setAlipayAccountNo(String alipayAccountNo) {
		this.alipayAccountNo = alipayAccountNo;
	}

	public String getAlipayAccountOpenId() {
		return this.alipayAccountOpenId;
	}
	public void setAlipayAccountOpenId(String alipayAccountOpenId) {
		this.alipayAccountOpenId = alipayAccountOpenId;
	}

	public String getAlipayAccountType() {
		return this.alipayAccountType;
	}
	public void setAlipayAccountType(String alipayAccountType) {
		this.alipayAccountType = alipayAccountType;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
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

	public String getChannelAccountId() {
		return this.channelAccountId;
	}
	public void setChannelAccountId(String channelAccountId) {
		this.channelAccountId = channelAccountId;
	}

	public String getChannelAccountOpenId() {
		return this.channelAccountOpenId;
	}
	public void setChannelAccountOpenId(String channelAccountOpenId) {
		this.channelAccountOpenId = channelAccountOpenId;
	}

	public String getChannelAccountType() {
		return this.channelAccountType;
	}
	public void setChannelAccountType(String channelAccountType) {
		this.channelAccountType = channelAccountType;
	}

	public String getCompanyCertNo() {
		return this.companyCertNo;
	}
	public void setCompanyCertNo(String companyCertNo) {
		this.companyCertNo = companyCertNo;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
