package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.jhjtest.complexdd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-11 13:46:58
 */
public class AlipaySecurityRiskJhjtestComplexddBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4123966294311925463L;

	/** 
	 * 11
	 */
	@ApiField("out_p")
	private String outP;

	/** 
	 * 11
	 */
	@ApiField("regress")
	private String regress;

	public void setOutP(String outP) {
		this.outP = outP;
	}
	public String getOutP( ) {
		return this.outP;
	}

	public void setRegress(String regress) {
		this.regress = regress;
	}
	public String getRegress( ) {
		return this.regress;
	}

}
