package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.jhjtest.gray.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-24 15:21:52
 */
public class AlipayPcreditJhjtestGrayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5857252695756229656L;

	/** 
	 * 11
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
