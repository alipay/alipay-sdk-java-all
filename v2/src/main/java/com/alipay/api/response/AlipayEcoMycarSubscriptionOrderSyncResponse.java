package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.subscription.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-11 16:17:05
 */
public class AlipayEcoMycarSubscriptionOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5119731719222172891L;

	/** 
	 * 车生活订单号，在首次同步订单时生成并返回
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
