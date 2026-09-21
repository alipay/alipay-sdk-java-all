package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁企业信息
 *
 * @author auto create
 * @since 1.0, 2026-09-16 19:51:39
 */
public class OrderModifyEnterpriseInfoOpenApiVO extends AlipayObject {

	private static final long serialVersionUID = 8541684292855454122L;

	/**
	 * 企业营业执照照片
	 */
	@ApiField("enterprise_license_image_url")
	private String enterpriseLicenseImageUrl;

	/**
	 * 公司的名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 法定代表人的身份证号码
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/**
	 * 法定代表人身份证照片
	 */
	@ApiField("legal_person_emblem_cert_image_url")
	private String legalPersonEmblemCertImageUrl;

	/**
	 * 法定代表人名称
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 公司的营业执照号码
	 */
	@ApiField("unified_social_credit_code")
	private String unifiedSocialCreditCode;

	public String getEnterpriseLicenseImageUrl() {
		return this.enterpriseLicenseImageUrl;
	}
	public void setEnterpriseLicenseImageUrl(String enterpriseLicenseImageUrl) {
		this.enterpriseLicenseImageUrl = enterpriseLicenseImageUrl;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getLegalPersonCertNo() {
		return this.legalPersonCertNo;
	}
	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}

	public String getLegalPersonEmblemCertImageUrl() {
		return this.legalPersonEmblemCertImageUrl;
	}
	public void setLegalPersonEmblemCertImageUrl(String legalPersonEmblemCertImageUrl) {
		this.legalPersonEmblemCertImageUrl = legalPersonEmblemCertImageUrl;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getUnifiedSocialCreditCode() {
		return this.unifiedSocialCreditCode;
	}
	public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
		this.unifiedSocialCreditCode = unifiedSocialCreditCode;
	}

}
