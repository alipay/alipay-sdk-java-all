package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openbizmocktools.daniel.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-19 11:12:19
 */
public class AlipayOpenAppOpenbizmocktoolsDanielQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5731718496391529387L;

	/** 
	 * faf
	 */
	@ApiField("hello")
	private String hello;

	public void setHello(String hello) {
		this.hello = hello;
	}
	public String getHello( ) {
		return this.hello;
	}

}
