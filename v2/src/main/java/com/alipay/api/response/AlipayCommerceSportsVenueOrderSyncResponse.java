package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.venue.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 02:01:41
 */
public class AlipayCommerceSportsVenueOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7618646827367389991L;

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
