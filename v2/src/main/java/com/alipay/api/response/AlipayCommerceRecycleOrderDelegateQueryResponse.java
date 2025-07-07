package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RecycleStdOrderBaseVO;
import com.alipay.api.domain.RecycleDeliveryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.order.delegate.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 13:58:57
 */
public class AlipayCommerceRecycleOrderDelegateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6759785335174746118L;

	/** 
	 * 订单基础信息
	 */
	@ApiField("order_base")
	private RecycleStdOrderBaseVO orderBase;

	/** 
	 * 订单履约信息
	 */
	@ApiField("order_delivery")
	private RecycleDeliveryVO orderDelivery;

	/** 
	 * 订单退货信息
	 */
	@ApiField("order_sendback")
	private RecycleDeliveryVO orderSendback;

	public void setOrderBase(RecycleStdOrderBaseVO orderBase) {
		this.orderBase = orderBase;
	}
	public RecycleStdOrderBaseVO getOrderBase( ) {
		return this.orderBase;
	}

	public void setOrderDelivery(RecycleDeliveryVO orderDelivery) {
		this.orderDelivery = orderDelivery;
	}
	public RecycleDeliveryVO getOrderDelivery( ) {
		return this.orderDelivery;
	}

	public void setOrderSendback(RecycleDeliveryVO orderSendback) {
		this.orderSendback = orderSendback;
	}
	public RecycleDeliveryVO getOrderSendback( ) {
		return this.orderSendback;
	}

}
