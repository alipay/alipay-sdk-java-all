package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.isv.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:02:09
 */
public class AlipayCommerceOperationIsvStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5792531443484953344L;

	/** 
	 * 服务id
	 */
	@ApiField("service_id")
	private String serviceId;

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceId( ) {
		return this.serviceId;
	}

}
