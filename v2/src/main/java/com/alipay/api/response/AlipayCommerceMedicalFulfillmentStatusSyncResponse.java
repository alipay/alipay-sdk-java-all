package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.fulfillment.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-29 16:37:48
 */
public class AlipayCommerceMedicalFulfillmentStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3188889247517935645L;

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
