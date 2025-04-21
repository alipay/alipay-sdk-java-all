package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 固定罚金
 *
 * @author auto create
 * @since 1.0, 2024-12-18 11:21:16
 */
public class PenaltyAmount extends AlipayObject {

	private static final long serialVersionUID = 4515366578815531729L;

	/**
	 * 当前币种下的罚金金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种类型
	 */
	@ApiField("currency")
	private String currency;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
