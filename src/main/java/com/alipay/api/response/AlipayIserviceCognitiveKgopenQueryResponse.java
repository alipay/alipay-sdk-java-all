package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.kgopen.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:09:30
 */
public class AlipayIserviceCognitiveKgopenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2551693924687635586L;

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
