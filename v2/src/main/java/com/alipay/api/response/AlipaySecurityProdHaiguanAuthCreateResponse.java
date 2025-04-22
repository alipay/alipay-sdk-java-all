package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.haiguan.auth.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:36
 */
public class AlipaySecurityProdHaiguanAuthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5838134852481416197L;

	/** 
	 * 12
	 */
	@ApiField("out_one")
	private String outOne;

	/** 
	 * 33
	 */
	@ApiField("out_three")
	private String outThree;

	/** 
	 * 23
	 */
	@ApiField("out_two")
	private String outTwo;

	public void setOutOne(String outOne) {
		this.outOne = outOne;
	}
	public String getOutOne( ) {
		return this.outOne;
	}

	public void setOutThree(String outThree) {
		this.outThree = outThree;
	}
	public String getOutThree( ) {
		return this.outThree;
	}

	public void setOutTwo(String outTwo) {
		this.outTwo = outTwo;
	}
	public String getOutTwo( ) {
		return this.outTwo;
	}

}
