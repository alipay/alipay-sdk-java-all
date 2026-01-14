package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.hqschema.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-12 20:57:26
 */
public class AlipaySecurityHqschemaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2336862643627736768L;

	/** 
	 * 测试
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
