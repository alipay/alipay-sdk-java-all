package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收标准订单详情
 *
 * @author auto create
 * @since 1.0, 2025-07-03 23:43:54
 */
public class RecycleStdOrderAllVO extends AlipayObject {

	private static final long serialVersionUID = 8261643473515291382L;

	/**
	 * 订单基础
	 */
	@ApiField("order_base")
	private RecycleStdOrderBaseVO orderBase;

	/**
	 * 订单履约信息:工程师上门/邮寄/到店
	 */
	@ApiField("order_delivery")
	private RecycleDeliveryVO orderDelivery;

	/**
	 * 订单退货信息（邮寄场景下，用户拒绝回收，会生成退货履约信息）
	 */
	@ApiField("order_sendback")
	private RecycleDeliveryVO orderSendback;

	public RecycleStdOrderBaseVO getOrderBase() {
		return this.orderBase;
	}
	public void setOrderBase(RecycleStdOrderBaseVO orderBase) {
		this.orderBase = orderBase;
	}

	public RecycleDeliveryVO getOrderDelivery() {
		return this.orderDelivery;
	}
	public void setOrderDelivery(RecycleDeliveryVO orderDelivery) {
		this.orderDelivery = orderDelivery;
	}

	public RecycleDeliveryVO getOrderSendback() {
		return this.orderSendback;
	}
	public void setOrderSendback(RecycleDeliveryVO orderSendback) {
		this.orderSendback = orderSendback;
	}

}
