package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.carsale.btoborder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 17:12:41
 */
public class AlipayCommerceTransportCarsaleBtoborderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8269778934544187665L;

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
