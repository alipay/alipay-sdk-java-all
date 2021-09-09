package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.hotel.service.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-10 19:27:39
 */
public class AlipayCommerceDataHotelServiceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1124899617899356245L;

	/** 
	 * 支付宝行业侧服务的标识
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
