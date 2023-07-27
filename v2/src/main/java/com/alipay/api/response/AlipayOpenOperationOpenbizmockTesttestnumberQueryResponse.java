package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testtestnumber.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 15:26:50
 */
public class AlipayOpenOperationOpenbizmockTesttestnumberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8723764757185438343L;

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
