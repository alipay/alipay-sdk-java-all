package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单时间信息
 *
 * @author auto create
 * @since 1.0, 2026-06-03 14:17:51
 */
public class OrderTimestampInfo extends AlipayObject {

	private static final long serialVersionUID = 8866187786773285841L;

	/**
	 * 订单取消时间
	 */
	@ApiField("order_cancel_time")
	private String orderCancelTime;

	/**
	 * 订单关闭时间
	 */
	@ApiField("order_close_time")
	private String orderCloseTime;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/**
	 * 订单发货时间
	 */
	@ApiField("order_deliver_time")
	private String orderDeliverTime;

	/**
	 * 订单完成时间
	 */
	@ApiField("order_finish_time")
	private String orderFinishTime;

	/**
	 * 订单最后更新时间
	 */
	@ApiField("order_last_update_time")
	private String orderLastUpdateTime;

	/**
	 * 订单支付时间
	 */
	@ApiField("order_pay_time")
	private String orderPayTime;

	/**
	 * 订单收货时间
	 */
	@ApiField("order_receive_time")
	private String orderReceiveTime;

	public String getOrderCancelTime() {
		return this.orderCancelTime;
	}
	public void setOrderCancelTime(String orderCancelTime) {
		this.orderCancelTime = orderCancelTime;
	}

	public String getOrderCloseTime() {
		return this.orderCloseTime;
	}
	public void setOrderCloseTime(String orderCloseTime) {
		this.orderCloseTime = orderCloseTime;
	}

	public String getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderDeliverTime() {
		return this.orderDeliverTime;
	}
	public void setOrderDeliverTime(String orderDeliverTime) {
		this.orderDeliverTime = orderDeliverTime;
	}

	public String getOrderFinishTime() {
		return this.orderFinishTime;
	}
	public void setOrderFinishTime(String orderFinishTime) {
		this.orderFinishTime = orderFinishTime;
	}

	public String getOrderLastUpdateTime() {
		return this.orderLastUpdateTime;
	}
	public void setOrderLastUpdateTime(String orderLastUpdateTime) {
		this.orderLastUpdateTime = orderLastUpdateTime;
	}

	public String getOrderPayTime() {
		return this.orderPayTime;
	}
	public void setOrderPayTime(String orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public String getOrderReceiveTime() {
		return this.orderReceiveTime;
	}
	public void setOrderReceiveTime(String orderReceiveTime) {
		this.orderReceiveTime = orderReceiveTime;
	}

}
