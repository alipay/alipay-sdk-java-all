package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财务域多币种金额
 *
 * @author auto create
 * @since 1.0, 2021-12-10 18:14:32
 */
public class MultiCurrencyMoneyOpenApi extends AlipayObject {

	private static final long serialVersionUID = 4514864737183394687L;

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
