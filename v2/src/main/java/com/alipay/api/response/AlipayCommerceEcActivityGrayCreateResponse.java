package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.activity.gray.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 11:32:55
 */
public class AlipayCommerceEcActivityGrayCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2367186692717987912L;

	/** 
	 * 用户扫码加入指定的营销活动测试企业，用于活动灰度测试。
	 */
	@ApiField("benefit_enterprise_invite_code")
	private String benefitEnterpriseInviteCode;

	public void setBenefitEnterpriseInviteCode(String benefitEnterpriseInviteCode) {
		this.benefitEnterpriseInviteCode = benefitEnterpriseInviteCode;
	}
	public String getBenefitEnterpriseInviteCode( ) {
		return this.benefitEnterpriseInviteCode;
	}

}
