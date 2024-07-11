package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险人信息，如投保人和被保人
 *
 * @author auto create
 * @since 1.0, 2022-10-31 13:37:01
 */
public class InsurancePerson extends AlipayObject {

	private static final long serialVersionUID = 8724249127912279818L;

	/**
	 * 支付宝2088账号/淘宝账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账号类型
支付宝：1；淘宝账号：2
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 证件姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
10：身份证；22：社会统一信用代码；99：其他证件
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * OpenId是用户（UserId）在应用（AppId）下的唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
