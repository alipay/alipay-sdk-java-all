package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道统计
 *
 * @author auto create
 * @since 1.0, 2024-10-15 13:10:15
 */
public class ChannelStatistic extends AlipayObject {

	private static final long serialVersionUID = 3195546563125553694L;

	/**
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

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
