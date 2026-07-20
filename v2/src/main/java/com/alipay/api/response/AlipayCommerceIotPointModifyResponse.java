package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.point.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-17 16:11:50
 */
public class AlipayCommerceIotPointModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3462943175114144764L;

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
