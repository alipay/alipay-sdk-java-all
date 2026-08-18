package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.agent.delegation.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-20 17:12:12
 */
public class AlipayTradeAgentDelegationPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5193824347927668433L;

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
