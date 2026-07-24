package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-22 13:27:45
 */
public class SubscriptionMonthPair extends AlipayObject {

	private static final long serialVersionUID = 2323498986237734286L;

	/**
	 * 年月声明
	 */
	@ApiField("month")
	private String month;

	/**
	 * 类型
	 */
	@ApiField("subscription")
	private String subscription;

	public String getMonth() {
		return this.month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public String getSubscription() {
		return this.subscription;
	}
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}

}
