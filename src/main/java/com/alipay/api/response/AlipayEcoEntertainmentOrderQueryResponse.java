package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.entertainment.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoEntertainmentOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4247163647649876896L;

	/** 
	 * Accepted(受理中)
Refunds(退款)
Success(成功)
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
