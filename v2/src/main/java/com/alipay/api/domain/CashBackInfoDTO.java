package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满返使用限制
 *
 * @author auto create
 * @since 1.0, 2023-07-05 18:33:41
 */
public class CashBackInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4774811246171272436L;

	/**
	 * 返还金额
	 */
	@ApiField("amount")
	private Amount amount;

	/**
	 * 原价
	 */
	@ApiField("origin_amount")
	private Amount originAmount;

	public Amount getAmount() {
		return this.amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public Amount getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(Amount originAmount) {
		this.originAmount = originAmount;
	}

}
