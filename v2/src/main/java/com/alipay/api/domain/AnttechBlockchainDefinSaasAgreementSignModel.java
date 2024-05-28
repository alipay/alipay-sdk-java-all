package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 注册开通云企付服务
 *
 * @author auto create
 * @since 1.0, 2023-11-22 14:47:42
 */
public class AnttechBlockchainDefinSaasAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 2788936814193172483L;

	/**
	 * 会员类型。E: 企业  I: 个人
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * entityType为I时为个人身份证号，entityType为E时为法人身份证号。entityType为I时必选
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/**
	 * entityType为I时表示个人姓名，entityType为E时表示法人姓名。entityType为I时必选
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 企业名称。entityType为E时必选
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部业务平台会员ID
	 */
	@ApiField("out_member_id")
	private ReferenceId outMemberId;

	/**
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	/**
	 * 企业统一社会信用代码。entityType为E时必选
	 */
	@ApiField("unified_social_credit_code")
	private String unifiedSocialCreditCode;

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getLegalPersonCertNo() {
		return this.legalPersonCertNo;
	}
	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public ReferenceId getOutMemberId() {
		return this.outMemberId;
	}
	public void setOutMemberId(ReferenceId outMemberId) {
		this.outMemberId = outMemberId;
	}

	public String getPlatformMemberId() {
		return this.platformMemberId;
	}
	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}

	public String getUnifiedSocialCreditCode() {
		return this.unifiedSocialCreditCode;
	}
	public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
		this.unifiedSocialCreditCode = unifiedSocialCreditCode;
	}

}
