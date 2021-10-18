package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.dx.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-25 15:40:05
 */
public class AlipayInsSceneDxDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2184373228843937531L;

	/** 
	 * 返回dx数据
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
