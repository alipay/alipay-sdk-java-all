package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.insmop.retain.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:55
 */
public class AlipayInsInsmopRetainQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5879542163326391819L;

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
