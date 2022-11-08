package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.daniel.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-09 14:16:49
 */
public class AlipaySecurityDanielTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6629579373939737595L;

	/** 
	 * 12
	 */
	@ApiField("out_param")
	private String outParam;

	public void setOutParam(String outParam) {
		this.outParam = outParam;
	}
	public String getOutParam( ) {
		return this.outParam;
	}

}
