package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多币种金额
 *
 * @author auto create
 * @since 1.0, 2019-07-12 14:25:32
 */
public class CreditPayMoneyVO extends AlipayObject {

	private static final long serialVersionUID = 1635745772335773418L;

	/**
	 * 金额，单位元
	 */
	@ApiField("amt")
	private String amt;

	/**
	 * 币种代码
	 */
	@ApiField("currency_code")
	private String currencyCode;

	public String getAmt() {
		return this.amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
