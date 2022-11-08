package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道维度 收款摘要信息
 *
 * @author auto create
 * @since 1.0, 2022-09-16 10:13:38
 */
public class MerchantIndirectCollectionAnalysisChannelTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 8433824353419149481L;

	/**
	 * 交易金额，非实际到账金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付渠道( ALIPAY-支付宝/WECHAT_PAY-微信支付/UNION_PAY-银联支付/OTHER-其他付款方式)
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 交易笔数
	 */
	@ApiField("trade_count")
	private Long tradeCount;

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

	public Long getTradeCount() {
		return this.tradeCount;
	}
	public void setTradeCount(Long tradeCount) {
		this.tradeCount = tradeCount;
	}

}
