package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅交易独立退款接口
 *
 * @author auto create
 * @since 1.0, 2026-09-11 14:07:53
 */
public class AlipayTradeSubscriptionRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8526528324612679296L;

	/**
	 * 商户退款请求号，用于退款请求幂等。同一笔退款重试时必须保持不变；同一交易发起多次部分退款时，每次须使用不同的请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 退款金额，单位为分。必须大于0，且累计退款金额不得超过原交易的可退款金额
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 订阅ID
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	/**
	 * 支付宝交易号，必须为该订阅下可退款的原支付交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getSubscriptionId() {
		return this.subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
