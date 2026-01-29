package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testnumber.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:20
 */
public class AlipayOpenOperationOpenbizmockTestnumberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7381391262857331884L;

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
