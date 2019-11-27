package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多币种货币类	
 *
 * @author auto create
 * @since 1.0, 2019-03-27 23:24:35
 */
public class MultiCurrencyMoney extends AlipayObject {

	private static final long serialVersionUID = 3528449452389449939L;

	/**
	 * 金额，默认单位是人民币，精确到小数点两位..
	 */
	@ApiField("amt")
	private String amt;

	/**
	 * 币种
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
