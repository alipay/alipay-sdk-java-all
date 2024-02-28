package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.deductionorder.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-28 09:53:19
 */
public class AlipayCommerceDeductionorderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3419336647757158347L;

	/** 
	 * 交易号
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
