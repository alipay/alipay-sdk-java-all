package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.check.iq.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:29
 */
public class AlipaySecurityProdCheckIqQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4729483175613957668L;

	/** 
	 * 1
	 */
	@ApiField("a")
	private String a;

	public void setA(String a) {
		this.a = a;
	}
	public String getA( ) {
		return this.a;
	}

}
