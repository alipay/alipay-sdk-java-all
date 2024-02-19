package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV金额DTO
 *
 * @author auto create
 * @since 1.0, 2023-05-05 22:00:42
 */
public class IndrMoneyDTO extends AlipayObject {

	private static final long serialVersionUID = 4663192495756994698L;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 金额最小单位遵循ISO4217标准
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
