package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.smilepay.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:52:12
 */
public class ZolozAuthenticationCustomerSmilepayInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6543537487742382636L;

	/** 
	 * 返回值
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
