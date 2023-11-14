package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财务域多币种金额
 *
 * @author auto create
 * @since 1.0, 2023-09-13 14:09:43
 */
public class MultiCurrencyMoneyOpenApi extends AlipayObject {

	private static final long serialVersionUID = 4417119529996494496L;

	/**
	 * 分
	 */
	@ApiField("cent")
	private Long cent;

	/**
	 * 币种类型值
	 */
	@ApiField("currency_value")
	private String currencyValue;

	public Long getCent() {
		return this.cent;
	}
	public void setCent(Long cent) {
		this.cent = cent;
	}

	public String getCurrencyValue() {
		return this.currencyValue;
	}
	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}

}
