package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.fulfillment.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-10 10:47:53
 */
public class AlipayCommerceMedicalFulfillmentInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6616564254154332963L;

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
