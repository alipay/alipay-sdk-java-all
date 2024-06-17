package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金额明细
 *
 * @author auto create
 * @since 1.0, 2023-11-22 14:55:37
 */
public class AmountItem extends AlipayObject {

	private static final long serialVersionUID = 2699754787671341744L;

	/**
	 * 余额，单位元
	 */
	@ApiField("balance_amount")
	private String balanceAmount;

	/**
	 * 币种，CNY-人民币
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 冻结余额，单位元
	 */
	@ApiField("frozen_balance_amount")
	private String frozenBalanceAmount;

	public String getBalanceAmount() {
		return this.balanceAmount;
	}
	public void setBalanceAmount(String balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFrozenBalanceAmount() {
		return this.frozenBalanceAmount;
	}
	public void setFrozenBalanceAmount(String frozenBalanceAmount) {
		this.frozenBalanceAmount = frozenBalanceAmount;
	}

}
