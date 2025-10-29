package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.ntoken.expo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-04 14:17:38
 */
public class AlipayOfflineProviderNtokenExpoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1694574931485968752L;

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
