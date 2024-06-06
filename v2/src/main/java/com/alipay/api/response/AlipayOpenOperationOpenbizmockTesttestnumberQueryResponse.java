package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testtestnumber.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-12 20:11:55
 */
public class AlipayOpenOperationOpenbizmockTesttestnumberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4851966139341626936L;

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
