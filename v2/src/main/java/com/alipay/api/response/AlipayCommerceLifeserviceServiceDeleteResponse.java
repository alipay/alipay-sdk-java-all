package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.service.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-28 16:52:42
 */
public class AlipayCommerceLifeserviceServiceDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1893226724218673262L;

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
