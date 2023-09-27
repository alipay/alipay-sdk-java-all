package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.aittest.openapi.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-27 18:26:45
 */
public class AlipayOpenAittestOpenapiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7895322648689254415L;

	/** 
	 * ID
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
