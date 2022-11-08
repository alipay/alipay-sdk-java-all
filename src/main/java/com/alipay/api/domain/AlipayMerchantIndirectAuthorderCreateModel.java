package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户意愿确认申请单提交
 *
 * @author auto create
 * @since 1.0, 2022-11-02 10:50:16
 */
public class AlipayMerchantIndirectAuthorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6267328953614573347L;

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

	/**
	 * 1. 收单机构调用API提交申请单时，可选择是否指定单个服务商范围。非收单机构无需填写此字段。
2. 此字段填写单个服务商pid信息：填写（即：单服务商提交认证方式），查询申请单返回的认证二维码qr_code和填写服务商对应，仅能认证填写服务商下的商户；不填写（即：全服务商提交认证方式），查询申请单返回的认证二维码qr_code和收单机构对应，可认证收单机构下全部商户。
	 */
	@ApiField("source")
	private String source;

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

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
