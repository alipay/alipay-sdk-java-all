package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多币种货币类
 *
 * @author auto create
 * @since 1.0, 2020-06-29 15:54:47
 */
public class MultiCurrencyMoneyVO extends AlipayObject {

	private static final long serialVersionUID = 8738517785535699849L;

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
