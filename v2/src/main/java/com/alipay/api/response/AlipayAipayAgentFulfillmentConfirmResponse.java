package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.agent.fulfillment.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-07 12:22:56
 */
public class AlipayAipayAgentFulfillmentConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6741778689138872793L;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
