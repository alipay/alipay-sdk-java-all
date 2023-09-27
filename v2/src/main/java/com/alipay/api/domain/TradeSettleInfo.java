package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易结算相关信息。包含分账、补差等信息
 *
 * @author auto create
 * @since 1.0, 2023-07-05 13:52:58
 */
public class TradeSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 7425869658953615648L;

	/**
	 * 交易结算明细信息
	 */
	@ApiListField("trade_settle_detail_list")
	@ApiField("trade_settle_detail")
	private List<TradeSettleDetail> tradeSettleDetailList;

	/**
	 * 直付通账期、直连账期下返回，其他场景为空，表示一笔订单剩余待结算金额
	 */
	@ApiField("trade_unsettled_amount")
	private String tradeUnsettledAmount;

	public List<TradeSettleDetail> getTradeSettleDetailList() {
		return this.tradeSettleDetailList;
	}
	public void setTradeSettleDetailList(List<TradeSettleDetail> tradeSettleDetailList) {
		this.tradeSettleDetailList = tradeSettleDetailList;
	}

	public String getTradeUnsettledAmount() {
		return this.tradeUnsettledAmount;
	}
	public void setTradeUnsettledAmount(String tradeUnsettledAmount) {
		this.tradeUnsettledAmount = tradeUnsettledAmount;
	}

}
