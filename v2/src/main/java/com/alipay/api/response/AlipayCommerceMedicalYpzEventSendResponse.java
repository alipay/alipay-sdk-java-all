package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ypz.event.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:23:31
 */
public class AlipayCommerceMedicalYpzEventSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1269181363191558135L;

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
