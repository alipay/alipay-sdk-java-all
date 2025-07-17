package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.aeactivity.platform.signup response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-26 10:37:29
 */
public class AntMerchantExpandAeactivityPlatformSignupResponse extends AlipayResponse {

	private static final long serialVersionUID = 3381923891417453642L;

	/** 
	 * 报名结果
	 */
	@ApiField("signup_result")
	private String signupResult;

	public void setSignupResult(String signupResult) {
		this.signupResult = signupResult;
	}
	public String getSignupResult( ) {
		return this.signupResult;
	}

}
