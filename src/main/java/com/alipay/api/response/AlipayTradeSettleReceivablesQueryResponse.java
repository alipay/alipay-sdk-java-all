package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.receivables.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-20 15:39:11
 */
public class AlipayTradeSettleReceivablesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1658299121258662358L;

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
