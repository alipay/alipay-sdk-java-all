package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.resource.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-25 11:06:17
 */
public class AlipayOpenMiniResourceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4341763593358488491L;

	/** 
	 * 流量位id
	 */
	@ApiField("resource_id")
	private String resourceId;

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceId( ) {
		return this.resourceId;
	}

}
