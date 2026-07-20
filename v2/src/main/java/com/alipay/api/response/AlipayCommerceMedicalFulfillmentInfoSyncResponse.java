package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.fulfillment.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-17 11:07:49
 */
public class AlipayCommerceMedicalFulfillmentInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2753592455537986215L;

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
