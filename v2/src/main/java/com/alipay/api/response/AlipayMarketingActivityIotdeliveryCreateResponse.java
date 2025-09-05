package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.iotdelivery.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:42:41
 */
public class AlipayMarketingActivityIotdeliveryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6518159651552967682L;

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
