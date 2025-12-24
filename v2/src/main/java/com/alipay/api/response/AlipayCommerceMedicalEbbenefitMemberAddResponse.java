package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ebbenefit.member.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-08 15:27:25
 */
public class AlipayCommerceMedicalEbbenefitMemberAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7519113613418455439L;

	/** 
	 * 家庭成员id
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
