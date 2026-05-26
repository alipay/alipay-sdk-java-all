package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.enterprise.delegation.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-22 14:02:50
 */
public class AlipayTradeEnterpriseDelegationPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2112197615797875464L;

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
