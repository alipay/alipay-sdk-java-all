package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.sssssss.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-22 16:57:32
 */
public class AlipaySecuritySssssssQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8215598666539693223L;

	/** 
	 * af
	 */
	@ApiField("adfad")
	private String adfad;

	public void setAdfad(String adfad) {
		this.adfad = adfad;
	}
	public String getAdfad( ) {
		return this.adfad;
	}

}
