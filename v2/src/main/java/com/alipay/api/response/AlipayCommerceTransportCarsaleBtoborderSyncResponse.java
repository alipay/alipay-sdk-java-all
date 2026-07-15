package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.carsale.btoborder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-01 14:32:44
 */
public class AlipayCommerceTransportCarsaleBtoborderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4199336666793163427L;

	/** 
	 * 车生活订单id
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
