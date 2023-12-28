package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.creditrisk.jhjtest.prod.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-11 15:41:55
 */
public class AlipayPcreditCreditriskJhjtestProdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4665326956234447696L;

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
