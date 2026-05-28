package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-22 13:27:45
 */
public class SubscriptionReimbursementVO extends AlipayObject {

	private static final long serialVersionUID = 7482136371283184432L;

	/**
	 * 报销原因说明
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 订阅的产品
	 */
	@ApiField("subscription")
	private String subscription;

	/**
	 * 是否可报销
	 */
	@ApiField("valid")
	private Boolean valid;

	/**
	 * 年月
	 */
	@ApiField("year_month")
	private String yearMonth;

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSubscription() {
		return this.subscription;
	}
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}

	public Boolean getValid() {
		return this.valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public String getYearMonth() {
		return this.yearMonth;
	}
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}

}
