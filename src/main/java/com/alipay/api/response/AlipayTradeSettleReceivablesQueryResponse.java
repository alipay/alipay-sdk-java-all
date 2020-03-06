package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.receivables.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-05 22:06:08
 */
public class AlipayTradeSettleReceivablesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8252491637222878798L;

	/** 
	 * 待结算金额，人民币，单位为元
	 */
	@ApiField("unsettled_amount")
	private String unsettledAmount;

	public void setUnsettledAmount(String unsettledAmount) {
		this.unsettledAmount = unsettledAmount;
	}
	public String getUnsettledAmount( ) {
		return this.unsettledAmount;
	}

}
