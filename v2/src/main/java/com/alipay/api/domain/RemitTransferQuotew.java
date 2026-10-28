package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款报价
 *
 * @author auto create
 * @since 1.0, 2026-10-19 19:42:55
 */
public class RemitTransferQuotew extends AlipayObject {

	private static final long serialVersionUID = 4612111638194538868L;

	/**
	 * 基础币种
	 */
	@ApiField("base_currency")
	private String baseCurrency;

	/**
	 * 币种对
	 */
	@ApiField("quote_currency_pair")
	private String quoteCurrencyPair;

	/**
	 * 汇率过期时间
	 */
	@ApiField("quote_expiry_time")
	private String quoteExpiryTime;

	/**
	 * 汇率ID
	 */
	@ApiField("quote_id")
	private String quoteId;

	/**
	 * 汇率价格，单位为每单位基础币种对应的报价币种金额
	 */
	@ApiField("quote_price")
	private String quotePrice;

	/**
	 * 汇率生生效的起始时间
	 */
	@ApiField("quote_start_time")
	private String quoteStartTime;

	/**
	 * 单位
	 */
	@ApiField("quote_unit")
	private String quoteUnit;

	public String getBaseCurrency() {
		return this.baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getQuoteCurrencyPair() {
		return this.quoteCurrencyPair;
	}
	public void setQuoteCurrencyPair(String quoteCurrencyPair) {
		this.quoteCurrencyPair = quoteCurrencyPair;
	}

	public String getQuoteExpiryTime() {
		return this.quoteExpiryTime;
	}
	public void setQuoteExpiryTime(String quoteExpiryTime) {
		this.quoteExpiryTime = quoteExpiryTime;
	}

	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getQuotePrice() {
		return this.quotePrice;
	}
	public void setQuotePrice(String quotePrice) {
		this.quotePrice = quotePrice;
	}

	public String getQuoteStartTime() {
		return this.quoteStartTime;
	}
	public void setQuoteStartTime(String quoteStartTime) {
		this.quoteStartTime = quoteStartTime;
	}

	public String getQuoteUnit() {
		return this.quoteUnit;
	}
	public void setQuoteUnit(String quoteUnit) {
		this.quoteUnit = quoteUnit;
	}

}
