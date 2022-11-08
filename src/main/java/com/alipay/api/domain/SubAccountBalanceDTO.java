package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AR里子账号余额信息
 *
 * @author auto create
 * @since 1.0, 2020-08-28 14:17:48
 */
public class SubAccountBalanceDTO extends AlipayObject {

	private static final long serialVersionUID = 8397142236292549979L;

	/**
	 * 可用金额
	 */
	@ApiField("available_amount")
	private MultiCurrencyMoneyOpenApi availableAmount;

	/**
	 * 总余额
	 */
	@ApiField("balance")
	private MultiCurrencyMoneyOpenApi balance;

	/**
	 * 冻结金额
	 */
	@ApiField("freeze_amount")
	private MultiCurrencyMoneyOpenApi freezeAmount;

	public MultiCurrencyMoneyOpenApi getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(MultiCurrencyMoneyOpenApi availableAmount) {
		this.availableAmount = availableAmount;
	}

	public MultiCurrencyMoneyOpenApi getBalance() {
		return this.balance;
	}
	public void setBalance(MultiCurrencyMoneyOpenApi balance) {
		this.balance = balance;
	}

	public MultiCurrencyMoneyOpenApi getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(MultiCurrencyMoneyOpenApi freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

}
