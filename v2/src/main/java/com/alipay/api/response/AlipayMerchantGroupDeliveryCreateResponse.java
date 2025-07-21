package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.delivery.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-31 16:22:22
 */
public class AlipayMerchantGroupDeliveryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8332559895178643892L;

	/** 
	 * 推广计划id
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
