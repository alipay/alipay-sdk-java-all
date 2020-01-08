package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.smilepay.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-23 19:56:32
 */
public class ZolozAuthenticationCustomerSmilepayInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4415468525731266277L;

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
