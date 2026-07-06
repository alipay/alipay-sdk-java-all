package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅查询
 *
 * @author auto create
 * @since 1.0, 2026-06-08 21:57:53
 */
public class AlipayTradeSubscriptionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4759334578411352721L;

	/**
	 * 支付宝客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 订阅id
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	/**
	 * 枚举值：
未完成:INCOMPLETE
活跃:ACTIVE
未完成已过期:INCOMPLETE_EXPIRED
已取消:CANCELED
	 */
	@ApiField("subscription_status")
	private String subscriptionStatus;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSubscriptionId() {
		return this.subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionStatus() {
		return this.subscriptionStatus;
	}
	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

}
