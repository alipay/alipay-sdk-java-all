package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.put.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-27 15:36:54
 */
public class AlipayOpenOperationOpenbizmockPutQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6168855164784367436L;

	/** 
	 * test
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
