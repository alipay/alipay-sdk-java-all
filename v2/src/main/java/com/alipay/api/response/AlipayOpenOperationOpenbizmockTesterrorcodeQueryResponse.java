package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testerrorcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-28 16:04:44
 */
public class AlipayOpenOperationOpenbizmockTesterrorcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8335172559444278167L;

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
