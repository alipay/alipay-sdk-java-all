package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-21 18:37:02
 */
public class AntMerchantExpandShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7859751858649594711L;

	/** 
	 * 申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
