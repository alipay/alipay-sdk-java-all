package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.aeactivity.platform.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-26 10:37:29
 */
public class AntMerchantExpandAeactivityPlatformQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7863293647895554482L;

	/** 
	 * 代表门店报名的状态
	 */
	@ApiField("sign_up_status")
	private String signUpStatus;

	public void setSignUpStatus(String signUpStatus) {
		this.signUpStatus = signUpStatus;
	}
	public String getSignUpStatus( ) {
		return this.signUpStatus;
	}

}
