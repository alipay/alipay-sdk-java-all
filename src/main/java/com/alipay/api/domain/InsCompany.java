package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保保险的商户(企业)信息
 *
 * @author auto create
 * @since 1.0, 2022-10-27 19:56:02
 */
public class InsCompany extends AlipayObject {

	private static final long serialVersionUID = 7885159396815179182L;

	/**
	 * 支付宝账号ID
	 */
	@ApiField("alipay_account_no")
	private String alipayAccountNo;

	/**
	 * 支付宝账号ID
	 */
	@ApiField("alipay_account_open_id")
	private String alipayAccountOpenId;

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
	 * 证件类型
社会信用编号 23
身份证号 10
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 渠道用户ID
	 */
	@ApiField("channel_account_id")
	private String channelAccountId;

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
