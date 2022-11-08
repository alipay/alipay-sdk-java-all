package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统计分析实体
 *
 * @author auto create
 * @since 1.0, 2022-09-16 11:00:03
 */
public class MerchantIndirectCollectionAnalysisTimeLineRecord extends AlipayObject {

	private static final long serialVersionUID = 1553236598889688314L;

	/**
	 * 渠道维度 收款摘要信息
	 */
	@ApiListField("channel_trade")
	@ApiField("merchant_indirect_collection_analysis_channel_trade_info")
	private List<MerchantIndirectCollectionAnalysisChannelTradeInfo> channelTrade;

	/**
	 * 同请求中的end_time
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 实收金额，实际到账金额
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * 同请求中的start_time
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 交易金额，累计收款金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 累计收款笔数
	 */
	@ApiField("total_trade_count")
	private Long totalTradeCount;

	public List<MerchantIndirectCollectionAnalysisChannelTradeInfo> getChannelTrade() {
		return this.channelTrade;
	}
	public void setChannelTrade(List<MerchantIndirectCollectionAnalysisChannelTradeInfo> channelTrade) {
		this.channelTrade = channelTrade;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getTotalTradeCount() {
		return this.totalTradeCount;
	}
	public void setTotalTradeCount(Long totalTradeCount) {
		this.totalTradeCount = totalTradeCount;
	}

}
