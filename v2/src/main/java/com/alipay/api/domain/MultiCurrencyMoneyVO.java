package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多币种货币类
 *
 * @author auto create
 * @since 1.0, 2023-09-14 13:55:51
 */
public class MultiCurrencyMoneyVO extends AlipayObject {

	private static final long serialVersionUID = 8836155283341466529L;

	/**
	 * 金额，默认单位是人民币，精确到小数点两位，单位元
	 */
	@ApiField("amt")
	private String amt;

	/**
	 * 币种，枚举值：1.CNY（人民币）2.USD（美元）3.HKD（港元）4.TWD（台币）5.EUR（欧元）6.GBP（英镑）7.JPY（日元）
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
