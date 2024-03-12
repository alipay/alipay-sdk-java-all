package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.delivery.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 15:47:03
 */
public class AlipayOpenAppDeliveryInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4567824493164153417L;

	/** 
	 * 履约信息ID
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
