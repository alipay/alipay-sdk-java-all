package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.topregister.register.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 19:05:05
 */
public class AlipayEbppInvoiceTopregisterRegisterCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2253812344265962788L;

	/** 
	 * 工单ID
	 */
	@ApiField("register_id")
	private String registerId;

	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}
	public String getRegisterId( ) {
		return this.registerId;
	}

}
