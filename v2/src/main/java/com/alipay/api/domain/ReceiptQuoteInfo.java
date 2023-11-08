package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * quote information.
 *
 * @author auto create
 * @since 1.0, 2019-10-10 10:12:22
 */
public class ReceiptQuoteInfo extends AlipayObject {

	private static final long serialVersionUID = 2353249324568652353L;

	/**
	 * The base currency
	 */
	@ApiField("base_currency")
	private String baseCurrency;

	/**
	 * a currency pair is the quotation of the relative value of a currency unit against the unit of another currency.
	 */
	@ApiField("base_currency_unit")
	private String baseCurrencyUnit;

	/**
	 * the time of this quote to be unavaible
	 */
	@ApiField("expiry_time")
	private String expiryTime;

	/**
	 * fxRate
	 */
	@ApiField("fx_rate")
	private String fxRate;

	/**
	 * quoteId
	 */
	@ApiField("quote_id")
	private String quoteId;

	/**
	 * sourceCurrency
	 */
	@ApiField("source_currency")
	private String sourceCurrency;

	/**
	 * the startTime this quote to be available.
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * targetCurrency
	 */
	@ApiField("target_currency")
	private String targetCurrency;

	public String getBaseCurrency() {
		return this.baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getBaseCurrencyUnit() {
		return this.baseCurrencyUnit;
	}
	public void setBaseCurrencyUnit(String baseCurrencyUnit) {
		this.baseCurrencyUnit = baseCurrencyUnit;
	}

	public String getExpiryTime() {
		return this.expiryTime;
	}
	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}

	public String getFxRate() {
		return this.fxRate;
	}
	public void setFxRate(String fxRate) {
		this.fxRate = fxRate;
	}

	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getSourceCurrency() {
		return this.sourceCurrency;
	}
	public void setSourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTargetCurrency() {
		return this.targetCurrency;
	}
	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

}
