package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭订阅
 *
 * @author auto create
 * @since 1.0, 2026-06-02 15:07:50
 */
public class AlipayTradeSubscriptionApplyCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2653293259486561388L;

	/**
	 * 订阅创建时返回的订单ID
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订阅ID
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getSubscriptionId() {
		return this.subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

}
