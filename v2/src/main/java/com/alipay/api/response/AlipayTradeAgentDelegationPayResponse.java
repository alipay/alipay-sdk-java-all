package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.agent.delegation.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 16:41:20
 */
public class AlipayTradeAgentDelegationPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7574585536678121967L;

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
