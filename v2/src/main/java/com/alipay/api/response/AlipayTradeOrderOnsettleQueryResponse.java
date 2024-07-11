package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.order.onsettle.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-17 10:38:24
 */
public class AlipayTradeOrderOnsettleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2287885587413785359L;

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
