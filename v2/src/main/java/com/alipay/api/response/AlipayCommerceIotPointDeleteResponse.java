package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.point.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-17 16:11:49
 */
public class AlipayCommerceIotPointDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4152763215333148841L;

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
