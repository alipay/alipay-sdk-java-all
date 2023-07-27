package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbtestabc.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 08:43:11
 */
public class AlipayOpenAppXwbtestabcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8281868226412753198L;

	/** 
	 * 1
	 */
	@ApiField("xw")
	private String xw;

	public void setXw(String xw) {
		this.xw = xw;
	}
	public String getXw( ) {
		return this.xw;
	}

}
