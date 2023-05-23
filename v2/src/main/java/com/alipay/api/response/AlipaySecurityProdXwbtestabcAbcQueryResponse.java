package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.xwbtestabc.abc.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-07 11:15:41
 */
public class AlipaySecurityProdXwbtestabcAbcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7896543853416122619L;

	/** 
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

	public void setXwb(String xwb) {
		this.xwb = xwb;
	}
	public String getXwb( ) {
		return this.xwb;
	}

}
