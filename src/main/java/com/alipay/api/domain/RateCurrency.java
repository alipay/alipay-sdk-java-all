package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇率币种信息
 *
 * @author auto create
 * @since 1.0, 2020-03-15 16:03:54
 */
public class RateCurrency extends AlipayObject {

	private static final long serialVersionUID = 6393863188656665572L;

	/**
	 * 货币编码，ISO标准alpha-3币种编码
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 币种中文名称
	 */
	@ApiField("currency_chinese_name")
	private String currencyChineseName;

	/**
	 * 币种图标
	 */
	@ApiField("currency_icon")
	private String currencyIcon;

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrencyChineseName() {
		return this.currencyChineseName;
	}
	public void setCurrencyChineseName(String currencyChineseName) {
		this.currencyChineseName = currencyChineseName;
	}

	public String getCurrencyIcon() {
		return this.currencyIcon;
	}
	public void setCurrencyIcon(String currencyIcon) {
		this.currencyIcon = currencyIcon;
	}

}
