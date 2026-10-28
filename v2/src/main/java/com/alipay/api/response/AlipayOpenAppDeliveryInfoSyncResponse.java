package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.delivery.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-11 18:11:06
 */
public class AlipayOpenAppDeliveryInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1665487646946478476L;

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
