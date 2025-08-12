package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒旅项目价格
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:34:17
 */
public class EtravelHotelSupplyPriceDTO extends AlipayObject {

	private static final long serialVersionUID = 2771288791143764948L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 默认CNY
	 */
	@ApiField("currency_code")
	private String currencyCode;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
