package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbtstabc.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOpenAppXwbtstabcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5273352463623245172L;

	/** 
	 * 1
	 */
	@ApiField("xwbbbdd")
	private String xwbbbdd;

	public void setXwbbbdd(String xwbbbdd) {
		this.xwbbbdd = xwbbbdd;
	}
	public String getXwbbbdd( ) {
		return this.xwbbbdd;
	}

}
