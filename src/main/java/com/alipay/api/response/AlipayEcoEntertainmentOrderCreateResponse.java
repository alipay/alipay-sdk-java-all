package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.entertainment.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoEntertainmentOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8573777821585161166L;

	/** 
	 * 订单状态
Accepted(受理中)
Refunds(受理失败,退款)
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
