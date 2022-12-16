package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.gift.order.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 12:01:28
 */
public class AlipaySocialGiftOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2768187638863151127L;

	/** 
	 * 本次操作的订单id，与该接口入参order_id一致
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
