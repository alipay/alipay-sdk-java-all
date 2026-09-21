package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-02 00:47:51
 */
public class PurchaseChargingOption extends AlipayObject {

	private static final long serialVersionUID = 4454262876621456355L;

	/**
	 * 档位类型
	 */
	@ApiField("billing_mode")
	private String billingMode;

	/**
	 * 货币
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 档位名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 时长包周期类型
	 */
	@ApiField("duration_period")
	private String durationPeriod;

	/**
	 * 权益类型
	 */
	@ApiField("entitlement_rule")
	private String entitlementRule;

	/**
	 * 价格计划标识
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 展示价格，十进制，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 价格快照版本
	 */
	@ApiField("price_version")
	private Long priceVersion;

	/**
	 * 次数或积分数量，单位个
	 */
	@ApiField("quota_amount")
	private Long quotaAmount;

	/**
	 * 额度类型
	 */
	@ApiField("quota_unit")
	private String quotaUnit;

	/**
	 * 档位标识，平台原样回传
	 */
	@ApiField("sku_id")
	private String skuId;

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

	public String getEntitlementRule() {
		return this.entitlementRule;
	}
	public void setEntitlementRule(String entitlementRule) {
		this.entitlementRule = entitlementRule;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getPriceVersion() {
		return this.priceVersion;
	}
	public void setPriceVersion(Long priceVersion) {
		this.priceVersion = priceVersion;
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

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
