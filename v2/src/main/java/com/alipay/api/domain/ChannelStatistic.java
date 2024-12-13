package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道统计
 *
 * @author auto create
 * @since 1.0, 2024-11-26 11:27:15
 */
public class ChannelStatistic extends AlipayObject {

	private static final long serialVersionUID = 1392655633441635129L;

	/**
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 当前渠道，退款成功的总金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 实际到账金额
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * 交易金额
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易笔数
	 */
	@ApiField("trade_count")
	private Long tradeCount;

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public Long getTradeCount() {
		return this.tradeCount;
	}
	public void setTradeCount(Long tradeCount) {
		this.tradeCount = tradeCount;
	}

}
