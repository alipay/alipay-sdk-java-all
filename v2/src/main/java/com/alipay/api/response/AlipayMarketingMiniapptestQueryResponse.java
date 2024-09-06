package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.miniapptest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:17
 */
public class AlipayMarketingMiniapptestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1758397133828981855L;

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
