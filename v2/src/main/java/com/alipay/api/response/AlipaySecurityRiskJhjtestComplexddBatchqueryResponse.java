package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.jhjtest.complexdd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 14:14:28
 */
public class AlipaySecurityRiskJhjtestComplexddBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4579457277953111355L;

	/** 
	 * 修改文档
	 */
	@ApiField("out_p")
	private String outP;

	/** 
	 * 修改文档
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
