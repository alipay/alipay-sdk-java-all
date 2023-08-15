package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.material.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:23:14
 */
public class KoubeiCateringPosMaterialCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8381383554648728557L;

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
