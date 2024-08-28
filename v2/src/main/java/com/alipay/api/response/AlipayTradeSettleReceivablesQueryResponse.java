package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.receivables.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-17 21:57:02
 */
public class AlipayTradeSettleReceivablesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2552989253926164581L;

	/** 
	 * 直付通请款模式下的结算在途金额，发起结算后 T+N 日到账场景下的处理中金额，人民币，单位为元
	 */
	@ApiField("on_settle_amount")
	private String onSettleAmount;

	/** 
	 * 已结算金额，人民币，单位为元
	 */
	@ApiField("settled_amount")
	private String settledAmount;

	/** 
	 * 待结算金额，人民币，单位为元
	 */
	@ApiField("unsettled_amount")
	private String unsettledAmount;

	public void setOnSettleAmount(String onSettleAmount) {
		this.onSettleAmount = onSettleAmount;
	}
	public String getOnSettleAmount( ) {
		return this.onSettleAmount;
	}

	public void setSettledAmount(String settledAmount) {
		this.settledAmount = settledAmount;
	}
	public String getSettledAmount( ) {
		return this.settledAmount;
	}

	public void setUnsettledAmount(String unsettledAmount) {
		this.unsettledAmount = unsettledAmount;
	}
	public String getUnsettledAmount( ) {
		return this.unsettledAmount;
	}

}
