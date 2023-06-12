package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.patch.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:36:56
 */
public class AlipayOpenOperationOpenbizmockPatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5686679482724925627L;

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
