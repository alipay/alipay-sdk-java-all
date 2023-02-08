package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.shopcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:00:43
 */
public class AlipayCommerceIotShopcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5727421321571439312L;

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
