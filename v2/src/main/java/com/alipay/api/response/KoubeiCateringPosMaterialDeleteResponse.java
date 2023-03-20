package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.material.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 07:20:05
 */
public class KoubeiCateringPosMaterialDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4598213724445133958L;

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
