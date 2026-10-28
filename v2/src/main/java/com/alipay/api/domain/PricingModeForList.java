package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-20 11:48:00
 */
public class PricingModeForList extends AlipayObject {

	private static final long serialVersionUID = 5339446236532213171L;

	/**
	 * 计费模式
	 */
	@ApiField("billing_mode")
	private String billingMode;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 档位展示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 时长包周期，周/月/季/年
	 */
	@ApiField("duration_period")
	private String durationPeriod;

	/**
	 * 金额，十进制，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 购买档位获得的额度，单位个
	 */
	@ApiField("quota_amount")
	private Long quotaAmount;

	/**
	 * 额度单位
	 */
	@ApiField("quota_unit")
	private String quotaUnit;

	public String getBillingMode() {
		return this.billingMode;
	}
	public void setBillingMode(String billingMode) {
		this.billingMode = billingMode;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDurationPeriod() {
		return this.durationPeriod;
	}
	public void setDurationPeriod(String durationPeriod) {
		this.durationPeriod = durationPeriod;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuotaAmount() {
		return this.quotaAmount;
	}
	public void setQuotaAmount(Long quotaAmount) {
		this.quotaAmount = quotaAmount;
	}

	public String getQuotaUnit() {
		return this.quotaUnit;
	}
	public void setQuotaUnit(String quotaUnit) {
		this.quotaUnit = quotaUnit;
	}

}
