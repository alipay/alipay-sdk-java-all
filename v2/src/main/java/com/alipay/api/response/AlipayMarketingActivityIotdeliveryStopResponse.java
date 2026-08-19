package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.iotdelivery.stop response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-27 14:02:50
 */
public class AlipayMarketingActivityIotdeliveryStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 4556852521777625395L;

	/** 
	 * 投放计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryId( ) {
		return this.deliveryId;
	}

}
