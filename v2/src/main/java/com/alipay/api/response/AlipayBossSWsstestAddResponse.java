package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.s.wsstest.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-04 10:51:55
 */
public class AlipayBossSWsstestAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7271547519122266517L;

	/** 
	 * 1
	 */
	@ApiField("ss")
	private String ss;

	public void setSs(String ss) {
		this.ss = ss;
	}
	public String getSs( ) {
		return this.ss;
	}

}
