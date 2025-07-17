package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.creditrisk.jhjtest.prod.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:35
 */
public class AlipayPcreditCreditriskJhjtestProdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3221836293292886912L;

	/** 
	 * 1111
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
