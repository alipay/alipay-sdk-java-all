package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.haha.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:19
 */
public class AlipayOpenAppTestHahaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4334868215532726628L;

	/** 
	 * 2088
	 */
	@ApiField("out_one")
	private String outOne;

	/** 
	 * 20881234
	 */
	@ApiField("out_two")
	private String outTwo;

	public void setOutOne(String outOne) {
		this.outOne = outOne;
	}
	public String getOutOne( ) {
		return this.outOne;
	}

	public void setOutTwo(String outTwo) {
		this.outTwo = outTwo;
	}
	public String getOutTwo( ) {
		return this.outTwo;
	}

}
