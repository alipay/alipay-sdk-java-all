package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.jhjtest.complexdd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-18 17:31:57
 */
public class AlipaySecurityRiskJhjtestComplexddBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6665745355742319579L;

	/** 
	 * 11
	 */
	@ApiField("out_p")
	private String outP;

	public void setOutP(String outP) {
		this.outP = outP;
	}
	public String getOutP( ) {
		return this.outP;
	}

}
