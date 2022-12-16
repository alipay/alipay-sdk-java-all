package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.role.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 15:02:34
 */
public class AlipayIserviceCcmRoleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6332589445829664828L;

	/** 
	 * 角色id
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
