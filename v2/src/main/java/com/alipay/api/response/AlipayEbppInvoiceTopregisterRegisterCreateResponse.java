package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.topregister.register.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:24:28
 */
public class AlipayEbppInvoiceTopregisterRegisterCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4775865968786622877L;

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
