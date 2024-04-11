package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.daniel.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-27 15:07:01
 */
public class AlipayOpenDanielTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3572151365669118372L;

	/** 
	 * 21
	 */
	@ApiField("out_put")
	private String outPut;

	public void setOutPut(String outPut) {
		this.outPut = outPut;
	}
	public String getOutPut( ) {
		return this.outPut;
	}

}
