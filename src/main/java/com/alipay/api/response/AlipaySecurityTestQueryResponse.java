package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-16 20:05:01
 */
public class AlipaySecurityTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6583355264629834677L;

	/** 
	 * 23
	 */
	@ApiField("eeea")
	private String eeea;

	public void setEeea(String eeea) {
		this.eeea = eeea;
	}
	public String getEeea( ) {
		return this.eeea;
	}

}
