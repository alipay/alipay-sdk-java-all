package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.commercial.store.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-14 14:12:04
 */
public class AlipayContentCommercialStoreCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5368371464835581671L;

	/** 
	 * 业务ID
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
