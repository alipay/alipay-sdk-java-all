package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户意愿确认申请单提交
 *
 * @author auto create
 * @since 1.0, 2022-06-27 20:48:15
 */
public class AlipayMerchantIndirectAuthorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1728465357882258161L;

	/**
	 * 主体信息
	 */
	@ApiField("auth_identity_info")
	private AuthIdentityInfo authIdentityInfo;

	/**
	 * 受益人身份信息，仅主体为企业且经营者/法人不是最终受益所有人，则需提填写受益所有人信息。
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
