package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.sdk.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:18
 */
public class AlipayOpenAppSdkTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5359323968212199874L;

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
