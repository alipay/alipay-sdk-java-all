package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费分账模型
 *
 * @author auto create
 * @since 1.0, 2025-03-17 17:17:53
 */
public class PucRoyaltyDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3315538242968846634L;

	/**
	 * 分账金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 收入方账户
	 */
	@ApiField("trans_in")
	private String transIn;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

}
