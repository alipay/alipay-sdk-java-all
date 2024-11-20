package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.codecheck.rainy.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-18 20:50:31
 */
public class AlipayDataDataserviceCodecheckRainyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5493923163671263359L;

	/** 
	 * 123
	 */
	@ApiField("aaa")
	private String aaa;

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}
	public String getAaa( ) {
		return this.aaa;
	}

}
