package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.resource.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-23 11:12:02
 */
public class AlipayOpenMiniResourceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6384758562145994555L;

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
