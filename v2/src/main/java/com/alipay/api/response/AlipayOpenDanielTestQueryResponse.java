package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.daniel.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 21:36:49
 */
public class AlipayOpenDanielTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5365467499134376858L;

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
