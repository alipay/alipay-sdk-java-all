package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询预计退款金额
 *
 * @author auto create
 * @since 1.0, 2026-05-20 10:57:44
 */
public class AlipayTradeSubscriptionEstimatedrefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3133127179832169549L;

	/**
	 * 订阅客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 订阅id
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

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

}
