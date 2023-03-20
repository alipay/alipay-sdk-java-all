package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.insmop.retain.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 16:16:39
 */
public class AlipayInsInsmopRetainQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6321854959568421718L;

	/** 
	 * 通行证信息
	 */
	@ApiField("pass_token")
	private String passToken;

	public void setPassToken(String passToken) {
		this.passToken = passToken;
	}
	public String getPassToken( ) {
		return this.passToken;
	}

}
