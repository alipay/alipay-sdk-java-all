package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.commercial.store.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-05 14:05:23
 */
public class AlipayContentCommercialStoreCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8121591146335338565L;

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
