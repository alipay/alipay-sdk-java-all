package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.order.settle response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-15 13:46:19
 */
public class AlipayTradeOrderSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 6543188935264124919L;

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
