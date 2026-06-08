package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.agent.fulfillment.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-09 19:12:45
 */
public class AlipayAipayAgentFulfillmentConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 3278127971737352159L;

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
