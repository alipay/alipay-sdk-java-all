package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.fulfillment.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-03 17:57:56
 */
public class AlipayCommerceMedicalFulfillmentStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6192562436563739179L;

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
