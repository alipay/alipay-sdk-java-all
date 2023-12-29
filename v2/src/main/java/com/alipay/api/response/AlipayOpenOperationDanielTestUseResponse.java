package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.daniel.test.use response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-01 15:43:05
 */
public class AlipayOpenOperationDanielTestUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7569392985895829749L;

	/** 
	 * 12
	 */
	@ApiField("output_er")
	private String outputEr;

	public void setOutputEr(String outputEr) {
		this.outputEr = outputEr;
	}
	public String getOutputEr( ) {
		return this.outputEr;
	}

}
