package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易结算相关信息。包含分账、补差等信息
 *
 * @author auto create
 * @since 1.0, 2024-09-26 18:30:35
 */
public class IndustryTradeSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 3542481247584121158L;

	/**
	 * 交易结算明细信息
	 */
	@ApiListField("trade_settle_detail_list")
	@ApiField("industry_trade_settle_detail")
	private List<IndustryTradeSettleDetail> tradeSettleDetailList;

	/**
	 * 直付通账期、直连账期下返回，其他场景为空，表示一笔订单剩余待结算金额
	 */
	@ApiField("trade_unsettled_amount")
	private String tradeUnsettledAmount;

	public List<IndustryTradeSettleDetail> getTradeSettleDetailList() {
		return this.tradeSettleDetailList;
	}
	public void setTradeSettleDetailList(List<IndustryTradeSettleDetail> tradeSettleDetailList) {
		this.tradeSettleDetailList = tradeSettleDetailList;
	}

	public String getTradeUnsettledAmount() {
		return this.tradeUnsettledAmount;
	}
	public void setTradeUnsettledAmount(String tradeUnsettledAmount) {
		this.tradeUnsettledAmount = tradeUnsettledAmount;
	}

}
