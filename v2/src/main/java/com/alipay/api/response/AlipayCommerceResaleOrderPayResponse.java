package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.resale.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-24 09:52:45
 */
public class AlipayCommerceResaleOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 8218819414881612616L;

	/** 
	 * 交易支付流水号
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
