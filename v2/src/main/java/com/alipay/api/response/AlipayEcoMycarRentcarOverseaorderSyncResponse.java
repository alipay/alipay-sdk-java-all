package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.rentcar.overseaorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-10 19:16:45
 */
public class AlipayEcoMycarRentcarOverseaorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7574565918331679947L;

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
