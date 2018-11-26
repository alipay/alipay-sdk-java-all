package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.order.settle response.
 * 
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayTradeOrderSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 6595932377112388354L;

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
