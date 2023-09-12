package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.tips.delivery.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:46:44
 */
public class AlipayOpenMiniTipsDeliveryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3147336688893892953L;

	/** 
	 * 收藏引导活动ID
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
