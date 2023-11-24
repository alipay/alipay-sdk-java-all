package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.sdk.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 10:16:48
 */
public class AlipayOpenAppSdkTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4725859653672247827L;

	/** 
	 * 123
	 */
	@ApiField("str_out")
	private String strOut;

	public void setStrOut(String strOut) {
		this.strOut = strOut;
	}
	public String getStrOut( ) {
		return this.strOut;
	}

}
