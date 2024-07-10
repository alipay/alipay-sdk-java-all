package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.point.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-17 16:16:49
 */
public class AlipayCommerceIotPointCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2535399627291623821L;

	/** 
	 * 点位ID
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
