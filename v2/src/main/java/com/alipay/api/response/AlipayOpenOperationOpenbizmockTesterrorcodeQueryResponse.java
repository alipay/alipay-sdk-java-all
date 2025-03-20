package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testerrorcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:05
 */
public class AlipayOpenOperationOpenbizmockTesterrorcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4593711884864737584L;

	/** 
	 * sucesee
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
