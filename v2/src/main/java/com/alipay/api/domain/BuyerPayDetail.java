package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买家支付明细，包含支付渠道与对应的金额
 *
 * @author auto create
 * @since 1.0, 2023-06-16 16:11:32
 */
public class BuyerPayDetail extends AlipayObject {

	private static final long serialVersionUID = 2446743674632119476L;

	/**
	 * 买家支付金额，单位：元。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

}
