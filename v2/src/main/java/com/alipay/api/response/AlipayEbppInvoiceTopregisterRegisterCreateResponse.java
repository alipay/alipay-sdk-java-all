package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.topregister.register.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:37:21
 */
public class AlipayEbppInvoiceTopregisterRegisterCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3883593389229357345L;

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
