package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testtestnumber.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-09 19:26:37
 */
public class AlipayOpenOperationOpenbizmockTesttestnumberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6795185438422795219L;

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
