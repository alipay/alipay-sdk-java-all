package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金额对象
 *
 * @author auto create
 * @since 1.0, 2020-05-28 18:55:14
 */
public class Amount extends AlipayObject {

	private static final long serialVersionUID = 2516518784355392915L;

	/**
	 * 3位币种Code，遵循ISO 4217
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 表示在最小货币单位中代表多少费用的正整数。
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
