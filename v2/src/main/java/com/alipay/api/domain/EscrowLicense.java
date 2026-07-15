package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 认证信息
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:11:54
 */
public class EscrowLicense extends AlipayObject {

	private static final long serialVersionUID = 6461645518814245124L;

	/**
	 * 证件有效期，格式yyyy-MM-dd
	 */
	@ApiField("cert_expired_date")
	private String certExpiredDate;

	/**
	 * 认证手机号
	 */
	@ApiField("cert_mobile")
	private String certMobile;

	/**
	 * 证件名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 个人传递身份证号，企业传递营业执照
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 身份证: IDENTITY_CARD
营业执照: BUSINESS_LICENSE
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 法人证件过期日期（企业必填）
	 */
	@ApiField("legal_person_cert_expired_date")
	private String legalPersonCertExpiredDate;

	/**
	 * 法人证件号码（企业必填）
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/**
	 * 身份证: IDENTITY_CARD
	 */
	@ApiField("legal_person_cert_type")
	private String legalPersonCertType;

	/**
	 * 法人手机号码（企业必填）
	 */
	@ApiField("legal_person_mobile")
	private String legalPersonMobile;

	/**
	 * 法人真实姓名
	 */
	@ApiField("legal_person_real_name")
	private String legalPersonRealName;

	/**
	 * 详细地址信息，企业填营业执照地址，个人填身份证地址
	 */
	@ApiField("license_address")
	private String licenseAddress;

	/**
	 * 支付宝账户真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	public String getCertExpiredDate() {
		return this.certExpiredDate;
	}
	public void setCertExpiredDate(String certExpiredDate) {
		this.certExpiredDate = certExpiredDate;
	}

	public String getCertMobile() {
		return this.certMobile;
	}
	public void setCertMobile(String certMobile) {
		this.certMobile = certMobile;
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

	public String getLegalPersonCertExpiredDate() {
		return this.legalPersonCertExpiredDate;
	}
	public void setLegalPersonCertExpiredDate(String legalPersonCertExpiredDate) {
		this.legalPersonCertExpiredDate = legalPersonCertExpiredDate;
	}

	public String getLegalPersonCertNo() {
		return this.legalPersonCertNo;
	}
	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}

	public String getLegalPersonCertType() {
		return this.legalPersonCertType;
	}
	public void setLegalPersonCertType(String legalPersonCertType) {
		this.legalPersonCertType = legalPersonCertType;
	}

	public String getLegalPersonMobile() {
		return this.legalPersonMobile;
	}
	public void setLegalPersonMobile(String legalPersonMobile) {
		this.legalPersonMobile = legalPersonMobile;
	}

	public String getLegalPersonRealName() {
		return this.legalPersonRealName;
	}
	public void setLegalPersonRealName(String legalPersonRealName) {
		this.legalPersonRealName = legalPersonRealName;
	}

	public String getLicenseAddress() {
		return this.licenseAddress;
	}
	public void setLicenseAddress(String licenseAddress) {
		this.licenseAddress = licenseAddress;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

}
