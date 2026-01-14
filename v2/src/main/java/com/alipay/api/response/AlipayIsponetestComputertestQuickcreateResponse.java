package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.isponetest.computertest.quickcreate response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:13:31
 */
public class AlipayIsponetestComputertestQuickcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3679571996952152672L;

	/** 
	 * 3
	 */
	@ApiField("dddd")
	private String dddd;

	public void setDddd(String dddd) {
		this.dddd = dddd;
	}
	public String getDddd( ) {
		return this.dddd;
	}

}
