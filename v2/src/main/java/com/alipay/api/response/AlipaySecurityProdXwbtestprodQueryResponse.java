package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.xwbtestprod.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:44:46
 */
public class AlipaySecurityProdXwbtestprodQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3586164227342874667L;

	/** 
	 * 11000
	 */
	@ApiField("out_a")
	private String outA;

	/** 
	 * xxxx
	 */
	@ApiField("out_b")
	private Long outB;

	public void setOutA(String outA) {
		this.outA = outA;
	}
	public String getOutA( ) {
		return this.outA;
	}

	public void setOutB(Long outB) {
		this.outB = outB;
	}
	public Long getOutB( ) {
		return this.outB;
	}

}
