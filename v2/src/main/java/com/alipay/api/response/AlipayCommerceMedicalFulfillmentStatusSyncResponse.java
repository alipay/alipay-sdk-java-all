package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.fulfillment.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-14 15:07:44
 */
public class AlipayCommerceMedicalFulfillmentStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1735282165972474731L;

	/** 
	 * 履约单ID
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}
	public String getFulfillmentId( ) {
		return this.fulfillmentId;
	}

}
