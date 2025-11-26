package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.ntoken.expo.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-11 15:17:39
 */
public class AlipayOfflineProviderNtokenExpoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5773262766669423664L;

	/** 
	 * 收藏token
	 */
	@ApiField("ntoken")
	private String ntoken;

	public void setNtoken(String ntoken) {
		this.ntoken = ntoken;
	}
	public String getNtoken( ) {
		return this.ntoken;
	}

}
