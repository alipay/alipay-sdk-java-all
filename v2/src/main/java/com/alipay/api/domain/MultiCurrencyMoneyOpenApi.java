package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财务域多币种金额OpenApi
 *
 * @author auto create
 * @since 1.0, 2025-11-12 16:35:55
 */
public class MultiCurrencyMoneyOpenApi extends AlipayObject {

	private static final long serialVersionUID = 5718275897278527273L;

	/**
	 * 表示金额中的分，为该货币的最小单位, 如人民币中的分、美元中的美分, 韩元日元中的元等, 具体换算比例在多币种类MultiCurrencyMoney中有字段digits
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
