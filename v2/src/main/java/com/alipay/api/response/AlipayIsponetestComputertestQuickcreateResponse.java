package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.isponetest.computertest.quickcreate response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:15
 */
public class AlipayIsponetestComputertestQuickcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1747466264878684858L;

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
