package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.drivercert.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-22 11:07:40
 */
public class AlipayCommerceTransportTaxiDrivercertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3441282678921315896L;

	/** 
	 * 认证成功
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
