package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.shopcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-06 18:47:44
 */
public class AlipayCommerceIotShopcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2722464496374347538L;

	/** 
	 * 投放状态，已投放（on），未投放（off）
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
