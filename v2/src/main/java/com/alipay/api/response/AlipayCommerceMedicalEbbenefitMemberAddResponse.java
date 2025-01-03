package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ebbenefit.member.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-26 20:57:22
 */
public class AlipayCommerceMedicalEbbenefitMemberAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8125676429779995664L;

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
