package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.aeactivity.platform.signup response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-18 19:47:33
 */
public class AntMerchantExpandAeactivityPlatformSignupResponse extends AlipayResponse {

	private static final long serialVersionUID = 1334598477931215832L;

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
