package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.miniapptest.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-02 17:46:49
 */
public class AlipayMarketingMiniapptestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8817839285796598218L;

	/** 
	 * sadsada
	 */
	@ApiField("sadsad")
	private String sadsad;

	public void setSadsad(String sadsad) {
		this.sadsad = sadsad;
	}
	public String getSadsad( ) {
		return this.sadsad;
	}

}
