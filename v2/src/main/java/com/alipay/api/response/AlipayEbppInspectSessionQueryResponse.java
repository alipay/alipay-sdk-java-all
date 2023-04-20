package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.inspect.session.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:11:31
 */
public class AlipayEbppInspectSessionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3528178269172218668L;

	/** 
	 * 登录ID
	 */
	@ApiField("value")
	private String value;

	public void setValue(String value) {
		this.value = value;
	}
	public String getValue( ) {
		return this.value;
	}

}
