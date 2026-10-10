package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promo.activity.signup response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 22:12:54
 */
public class AlipayCommerceOperationPromoActivitySignupResponse extends AlipayResponse {

	private static final long serialVersionUID = 3681885626223765223L;

	/** 
	 * 报名结果信息
	 */
	@ApiField("sign_up_data")
	private String signUpData;

	public void setSignUpData(String signUpData) {
		this.signUpData = signUpData;
	}
	public String getSignUpData( ) {
		return this.signUpData;
	}

}
