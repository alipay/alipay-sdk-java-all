package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销money
 *
 * @author auto create
 * @since 1.0, 2022-07-14 15:55:01
 */
public class MultiCurrencyMoneyPromo extends AlipayObject {

	private static final long serialVersionUID = 4222145854623768253L;

	/**
	 * 钱，分为单位
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
