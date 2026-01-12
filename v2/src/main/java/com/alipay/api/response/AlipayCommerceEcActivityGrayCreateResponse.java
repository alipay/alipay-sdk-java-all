package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.activity.gray.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-05 14:37:41
 */
public class AlipayCommerceEcActivityGrayCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3817913929657596227L;

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
