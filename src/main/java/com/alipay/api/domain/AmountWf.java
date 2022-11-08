package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wf金额对象
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:00:38
 */
public class AmountWf extends AlipayObject {

	private static final long serialVersionUID = 1797651813173829226L;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 分
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
