package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.ele.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:03
 */
public class KoubeiCateringEleOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3359338516125524251L;

	/** 
	 * 原始的订单id编号
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
