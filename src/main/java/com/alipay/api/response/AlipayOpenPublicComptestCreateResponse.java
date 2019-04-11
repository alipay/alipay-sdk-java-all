package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.comptest.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-13 18:25:00
 */
public class AlipayOpenPublicComptestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8121487357339825482L;

	/** 
	 * 1
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
