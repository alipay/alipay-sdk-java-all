package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡订单信息
 *
 * @author auto create
 * @since 1.0, 2022-09-27 19:14:36
 */
public class TimeCardOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 3214931792996178217L;

	/**
	 * 次卡商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 订单金额，单位为分
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单时间
	 */
	@ApiField("order_date")
	private String orderDate;

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 次卡简单信息
	 */
	@ApiField("time_card_info")
	private TimeCardSimpleItemInfo timeCardInfo;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDate() {
		return this.orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public TimeCardSimpleItemInfo getTimeCardInfo() {
		return this.timeCardInfo;
	}
	public void setTimeCardInfo(TimeCardSimpleItemInfo timeCardInfo) {
		this.timeCardInfo = timeCardInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
