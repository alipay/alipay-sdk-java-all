package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.deductionorder.pay response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 14:01:48
 */
public class AlipayCommerceDeductionorderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4898816764247194223L;

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
