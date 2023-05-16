package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.smilelive.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:36:48
 */
public class ZolozAuthenticationCustomerSmileliveInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3441358979134344142L;

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
