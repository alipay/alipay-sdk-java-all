package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款金额信息
 *
 * @author auto create
 * @since 1.0, 2024-07-16 19:45:05
 */
public class TransferAmount extends AlipayObject {

	private static final long serialVersionUID = 8566217457662185289L;

	/**
	 * 币种
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
