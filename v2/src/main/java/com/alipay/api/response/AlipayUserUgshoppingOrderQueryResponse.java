package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderOpenapi;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.ugshopping.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-02 14:17:56
 */
public class AlipayUserUgshoppingOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1171918139968548689L;

	/** 
	 * null
	 */
	@ApiListField("orders")
	@ApiField("order_openapi")
	private List<OrderOpenapi> orders;

	public void setOrders(List<OrderOpenapi> orders) {
		this.orders = orders;
	}
	public List<OrderOpenapi> getOrders( ) {
		return this.orders;
	}

}
