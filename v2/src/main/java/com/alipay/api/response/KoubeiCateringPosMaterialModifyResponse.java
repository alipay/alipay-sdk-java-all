package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.material.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:16:34
 */
public class KoubeiCateringPosMaterialModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8258536999414615826L;

	/** 
	 * 配料id
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
