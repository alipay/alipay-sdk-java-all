package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ebbenefit.member.bind response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-08 15:32:22
 */
public class AlipayCommerceMedicalEbbenefitMemberBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2469276516684856143L;

	/** 
	 * 支付宝家庭成员id
	 */
	@ApiField("member_id")
	private String memberId;

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberId( ) {
		return this.memberId;
	}

}
