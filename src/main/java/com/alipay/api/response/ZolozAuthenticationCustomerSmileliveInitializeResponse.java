package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.smilelive.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:42:20
 */
public class ZolozAuthenticationCustomerSmileliveInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3241786758355817572L;

	/** 
	 * result
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
