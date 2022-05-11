package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.kgopen.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-19 23:50:43
 */
public class AlipayIserviceCognitiveKgopenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7226895424586543111L;

	/** 
	 * 返回数据
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
