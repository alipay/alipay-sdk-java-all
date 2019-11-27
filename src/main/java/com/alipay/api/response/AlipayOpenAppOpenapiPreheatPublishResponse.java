package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openapi.preheat.publish response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-29 19:46:49
 */
public class AlipayOpenAppOpenapiPreheatPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 4741718136625615365L;

	/** 
	 * 1
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
