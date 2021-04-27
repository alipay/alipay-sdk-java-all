package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.smilelive.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-30 11:09:40
 */
public class ZolozAuthenticationCustomerSmileliveInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1174313393998388442L;

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
