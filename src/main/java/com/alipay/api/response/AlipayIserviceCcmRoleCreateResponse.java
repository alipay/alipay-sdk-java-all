package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.role.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-10 17:57:29
 */
public class AlipayIserviceCcmRoleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5434652668332226938L;

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
