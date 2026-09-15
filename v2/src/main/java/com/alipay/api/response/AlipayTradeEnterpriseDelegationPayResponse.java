package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.enterprise.delegation.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-01 19:40:10
 */
public class AlipayTradeEnterpriseDelegationPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 8651467255679479427L;

	/** 
	 * 支付成功的交易号
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
