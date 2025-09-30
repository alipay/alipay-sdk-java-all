package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运单信息大字段
 *
 * @author auto create
 * @since 1.0, 2025-06-23 15:19:35
 */
public class FreightFlowWaybillInfo extends AlipayObject {

	private static final long serialVersionUID = 6611939228765732926L;

	/**
	 * 订单金额,单位;分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 收货地
	 */
	@ApiField("delivery_address")
	private String deliveryAddress;

	/**
	 * 接单时间2024-06-18 15:12:36
	 */
	@ApiField("order_accept_time")
	private String orderAcceptTime;

	/**
	 * 运单完成时间2024-06-18 15:12:36
	 */
	@ApiField("order_finish_time")
	private String orderFinishTime;

	/**
	 * 下单时间2024-06-18 15:12:36
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 发货地
	 */
	@ApiField("shipping_address")
	private String shippingAddress;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getOrderAcceptTime() {
		return this.orderAcceptTime;
	}
	public void setOrderAcceptTime(String orderAcceptTime) {
		this.orderAcceptTime = orderAcceptTime;
	}

	public String getOrderFinishTime() {
		return this.orderFinishTime;
	}
	public void setOrderFinishTime(String orderFinishTime) {
		this.orderFinishTime = orderFinishTime;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getShippingAddress() {
		return this.shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
