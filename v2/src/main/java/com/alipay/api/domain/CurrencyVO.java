package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 注册资本/币种
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class CurrencyVO extends AlipayObject {

	private static final long serialVersionUID = 1462696439628476314L;

	/**
	 * 数量
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种
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
