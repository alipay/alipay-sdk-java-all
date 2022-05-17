package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.techrisk.tt.y.online response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-05 12:07:24
 */
public class TechriskTechriskTtYOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 3731796729126119974L;

	/** 
	 * 1
	 */
	@ApiField("test")
	private String test;

	public void setTest(String test) {
		this.test = test;
	}
	public String getTest( ) {
		return this.test;
	}

}
