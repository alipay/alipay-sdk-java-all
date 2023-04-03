package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.order.onsettle.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 11:41:43
 */
public class AlipayTradeOrderOnsettleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2255819522643615713L;

	/** 
	 * 剩余可分金额
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
