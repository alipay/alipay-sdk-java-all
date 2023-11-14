package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.material.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:42:38
 */
public class KoubeiCateringPosMaterialModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1756795826268747638L;

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
