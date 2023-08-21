package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testdc.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-26 15:52:02
 */
public class AlipayOpenOperationOpenbizmockTestdcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7412532619298399646L;

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
