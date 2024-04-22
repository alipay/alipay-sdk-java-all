package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.inspect.session.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:01:31
 */
public class AlipayEbppInspectSessionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7566842181831123715L;

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
