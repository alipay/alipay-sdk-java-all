package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.rentcar.overseaorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-06 16:46:42
 */
public class AlipayEcoMycarRentcarOverseaorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5378672821656595563L;

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
