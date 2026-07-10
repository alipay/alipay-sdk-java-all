package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多币种金额模型
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:49
 */
public class MultiCurrencyMoneyDTO extends AlipayObject {

	private static final long serialVersionUID = 6633272716488189968L;

	/**
	 * 金额值，对应类型long，单位为币种最小金额，各币种不同，如CNY为分
	 */
	@ApiField("cent")
	private String cent;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	public String getCent() {
		return this.cent;
	}
	public void setCent(String cent) {
		this.cent = cent;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
