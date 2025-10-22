package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保单位对象
 *
 * @author auto create
 * @since 1.0, 2025-10-16 14:04:43
 */
public class PolicyOrgHolderVO extends AlipayObject {

	private static final long serialVersionUID = 2242221456746331968L;

	/**
	 * 枚举值：
税务登记号:101
营业执照:102
组织机构代码:103
统一社会信用代码:24
掩码证件号:104
其他:199
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 企业联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/**
	 * 企业联系人邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 单位性质为个体工商户时必传
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 投保单位名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 按产品决定是否必传
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 企业联系人电话
	 */
	@ApiField("phone_no")
	private String phoneNo;

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCreditCode() {
		return this.creditCode;
	}
	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
