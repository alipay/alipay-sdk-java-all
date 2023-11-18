package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留学金额
 *
 * @author auto create
 * @since 1.0, 2023-10-25 15:38:50
 */
public class TuitionMoneyDTO extends AlipayObject {

	private static final long serialVersionUID = 2565873529681992192L;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 金额最小单位，单位：分、小币种（JPY/KRW等）：元
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
