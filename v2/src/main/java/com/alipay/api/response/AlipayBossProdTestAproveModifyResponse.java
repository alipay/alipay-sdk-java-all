package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.test.aprove.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-19 15:27:02
 */
public class AlipayBossProdTestAproveModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8232951756638736581L;

	/** 
	 * test
	 */
	@ApiField("out_string")
	private String outString;

	public void setOutString(String outString) {
		this.outString = outString;
	}
	public String getOutString( ) {
		return this.outString;
	}

}
