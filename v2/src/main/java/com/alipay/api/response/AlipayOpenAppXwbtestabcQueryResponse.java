package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbtestabc.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 06:00:33
 */
public class AlipayOpenAppXwbtestabcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5664757257329948573L;

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
