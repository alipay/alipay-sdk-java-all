package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个人用户信息
 *
 * @author auto create
 * @since 1.0, 2022-09-06 11:32:38
 */
public class IndividualCustomerInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2193165365295391192L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 邮件地址
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
