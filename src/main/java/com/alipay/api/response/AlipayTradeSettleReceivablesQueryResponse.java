package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.receivables.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-23 20:50:25
 */
public class AlipayTradeSettleReceivablesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2539299845595565811L;

	/** 
	 * 结算在途金额，发起结算后 T+N 日到账场景下的处理中金额，人民币，单位为元
	 */
	@ApiField("on_settle_amount")
	private String onSettleAmount;

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

	public void setUnsettledAmount(String unsettledAmount) {
		this.unsettledAmount = unsettledAmount;
	}
	public String getUnsettledAmount( ) {
		return this.unsettledAmount;
	}

}
