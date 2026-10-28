package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇出金额
 *
 * @author auto create
 * @since 1.0, 2026-10-19 19:42:55
 */
public class TransferToAmount extends AlipayObject {

	private static final long serialVersionUID = 6867325875159833844L;

	/**
	 * 3-letter currency code, refer to ISO 4217 Standard currency alphabetic code
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 金额，对应币种的最小单位，大币种为分，小币种为元
	 */
	@ApiField("value")
	private String value;

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
