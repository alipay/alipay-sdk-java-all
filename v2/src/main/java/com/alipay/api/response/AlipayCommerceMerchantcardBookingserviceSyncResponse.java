package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.bookingservice.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-12 15:05:26
 */
public class AlipayCommerceMerchantcardBookingserviceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6658421615461798646L;

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
