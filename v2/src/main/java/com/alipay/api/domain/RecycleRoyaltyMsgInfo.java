package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收资金消息的分账信息
 *
 * @author auto create
 * @since 1.0, 2026-02-27 16:26:43
 */
public class RecycleRoyaltyMsgInfo extends AlipayObject {

	private static final long serialVersionUID = 2317481387385786734L;

	/**
	 * 金额单位元，支持小数点后2位，必须大于0
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 分账转入的账号
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
