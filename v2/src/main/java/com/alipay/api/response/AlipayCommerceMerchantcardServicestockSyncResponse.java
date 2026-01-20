package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.servicestock.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 10:32:42
 */
public class AlipayCommerceMerchantcardServicestockSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8446765487256516974L;

	/** 
	 * 服务id【必填】
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
