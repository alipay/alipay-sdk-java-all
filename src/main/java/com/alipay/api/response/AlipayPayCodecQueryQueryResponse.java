package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.codec.query.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-16 19:30:47
 */
public class AlipayPayCodecQueryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4225828488416468254L;

	/** 
	 * sss
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
