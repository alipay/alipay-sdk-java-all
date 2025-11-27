package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-10 15:06:22
 */
public class AlipayCommerceEcOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1895232742132284835L;

	/** 
	 * 订单同步成功后产生的支付宝订单号
	 */
	@ApiField("order_sync_id")
	private String orderSyncId;

	public void setOrderSyncId(String orderSyncId) {
		this.orderSyncId = orderSyncId;
	}
	public String getOrderSyncId( ) {
		return this.orderSyncId;
	}

}
