package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户余额openapi数据传输对象
 *
 * @author auto create
 * @since 1.0, 2020-08-28 14:17:54
 */
public class SubAccountBalanceOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 8342544122769175613L;

	/**
	 * 可用余额
	 */
	@ApiField("available_amount")
	private MultiCurrencyMoneyOpenApi availableAmount;

	/**
	 * 余额
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
