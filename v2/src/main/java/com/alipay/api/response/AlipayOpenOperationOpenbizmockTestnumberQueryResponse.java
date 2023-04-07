package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testnumber.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-09 19:06:39
 */
public class AlipayOpenOperationOpenbizmockTestnumberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5219412648199216875L;

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
