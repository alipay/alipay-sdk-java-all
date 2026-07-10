package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.service.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-12 13:42:44
 */
public class AlipayCommerceLifeserviceServiceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7178267262899265996L;

	/** 
	 * 服务项目id
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
