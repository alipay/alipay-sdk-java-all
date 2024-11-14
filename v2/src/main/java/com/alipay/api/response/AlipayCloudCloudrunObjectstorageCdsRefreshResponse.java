package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.cds.refresh response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-24 15:37:05
 */
public class AlipayCloudCloudrunObjectstorageCdsRefreshResponse extends AlipayResponse {

	private static final long serialVersionUID = 7342732868964953466L;

	/** 
	 * 请求 ID
	 */
	@ApiField("requestid")
	private String requestid;

	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}
	public String getRequestid( ) {
		return this.requestid;
	}

}
