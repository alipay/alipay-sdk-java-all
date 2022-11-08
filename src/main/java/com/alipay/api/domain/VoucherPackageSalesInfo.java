package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券包销售信息
 *
 * @author auto create
 * @since 1.0, 2022-07-19 17:39:15
 */
public class VoucherPackageSalesInfo extends AlipayObject {

	private static final long serialVersionUID = 2836511118585997999L;

	/**
	 * 券包售卖预算，单位是份数
	 */
	@ApiField("budget")
	private Long budget;

	/**
	 * 券包购买支付渠道
pcredit：花呗
creditCard：信用卡
credit_group：花呗与信用卡
为空则不限渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 券包购买链接
	 */
	@ApiField("purchase_url")
	private String purchaseUrl;

	/**
	 * 券包售卖期限内最大购买次数
	 */
	@ApiField("sale_count_limit_in_period")
	private Long saleCountLimitInPeriod;

	/**
	 * 券包购买期限类型
NO：不限制 
ALL：售卖时间内 
DAY：天 
WEEK：周 
MONTH：月
	 */
	@ApiField("sale_period_limit")
	private String salePeriodLimit;

	/**
	 * 券包售卖价格，单位是元
	 */
	@ApiField("sale_price")
	private String salePrice;

	public Long getBudget() {
		return this.budget;
	}
	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getPurchaseUrl() {
		return this.purchaseUrl;
	}
	public void setPurchaseUrl(String purchaseUrl) {
		this.purchaseUrl = purchaseUrl;
	}

	public Long getSaleCountLimitInPeriod() {
		return this.saleCountLimitInPeriod;
	}
	public void setSaleCountLimitInPeriod(Long saleCountLimitInPeriod) {
		this.saleCountLimitInPeriod = saleCountLimitInPeriod;
	}

	public String getSalePeriodLimit() {
		return this.salePeriodLimit;
	}
	public void setSalePeriodLimit(String salePeriodLimit) {
		this.salePeriodLimit = salePeriodLimit;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

}
