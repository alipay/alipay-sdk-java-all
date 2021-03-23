package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-18 11:50:18
 */
public class AlipayOpenAppServiceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7148979329289421313L;

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
