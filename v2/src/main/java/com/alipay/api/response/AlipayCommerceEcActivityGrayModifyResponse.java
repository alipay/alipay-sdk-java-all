package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.activity.gray.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-05 14:52:42
 */
public class AlipayCommerceEcActivityGrayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8128164996192468387L;

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
