package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.isv.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:14
 */
public class AlipayCommerceOperationIsvStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2478962912859378684L;

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
