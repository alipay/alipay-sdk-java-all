package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户意愿确认申请单提交
 *
 * @author auto create
 * @since 1.0, 2022-08-04 21:08:13
 */
public class AlipayMerchantIndirectAuthorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4386484298998862366L;

	/**
	 * 主体信息
	 */
	@ApiField("auth_identity_info")
	private AuthIdentityInfo authIdentityInfo;

	/**
	 * 受益人信息。
如下情况时必填：主体类型为企业，且其法人/经营者不为最终受益所有人（即：legal_person_info内的is_benefit_person=false）；其他情况不填。
	 */
	@ApiField("benefit_person_info")
	private IndirectBenefitPersonInfo benefitPersonInfo;

	/**
	 * 联系人信息
	 */
	@ApiField("contact_person_info")
	private IndirectContactPersonInfo contactPersonInfo;

	/**
	 * 补充材料
	 */
	@ApiField("extra_credentials")
	private IndirectExtraCredentials extraCredentials;

	/**
	 * 法人身份信息
	 */
	@ApiField("legal_person_info")
	private IndirectLegalPersonInfo legalPersonInfo;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public AuthIdentityInfo getAuthIdentityInfo() {
		return this.authIdentityInfo;
	}
	public void setAuthIdentityInfo(AuthIdentityInfo authIdentityInfo) {
		this.authIdentityInfo = authIdentityInfo;
	}

	public IndirectBenefitPersonInfo getBenefitPersonInfo() {
		return this.benefitPersonInfo;
	}
	public void setBenefitPersonInfo(IndirectBenefitPersonInfo benefitPersonInfo) {
		this.benefitPersonInfo = benefitPersonInfo;
	}

	public IndirectContactPersonInfo getContactPersonInfo() {
		return this.contactPersonInfo;
	}
	public void setContactPersonInfo(IndirectContactPersonInfo contactPersonInfo) {
		this.contactPersonInfo = contactPersonInfo;
	}

	public IndirectExtraCredentials getExtraCredentials() {
		return this.extraCredentials;
	}
	public void setExtraCredentials(IndirectExtraCredentials extraCredentials) {
		this.extraCredentials = extraCredentials;
	}

	public IndirectLegalPersonInfo getLegalPersonInfo() {
		return this.legalPersonInfo;
	}
	public void setLegalPersonInfo(IndirectLegalPersonInfo legalPersonInfo) {
		this.legalPersonInfo = legalPersonInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
