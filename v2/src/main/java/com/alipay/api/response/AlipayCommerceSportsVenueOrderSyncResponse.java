package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.venue.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 21:46:43
 */
public class AlipayCommerceSportsVenueOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2143362563256749358L;

	/** 
	 * 支付宝业务订单唯一ID
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
