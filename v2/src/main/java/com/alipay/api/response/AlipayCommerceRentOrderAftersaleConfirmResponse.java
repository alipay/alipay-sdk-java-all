package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.aftersale.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-28 17:32:38
 */
public class AlipayCommerceRentOrderAftersaleConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7372379914652289388L;

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
