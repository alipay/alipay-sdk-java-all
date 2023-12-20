package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.jhjtest.newone.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-08 17:41:55
 */
public class AlipayPcreditJhjtestNewoneDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6786156382345127254L;

	/** 
	 * 1
	 */
	@ApiField("out_a")
	private String outA;

	public void setOutA(String outA) {
		this.outA = outA;
	}
	public String getOutA( ) {
		return this.outA;
	}

}
