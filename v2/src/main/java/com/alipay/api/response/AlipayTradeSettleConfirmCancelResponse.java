package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.confirm.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-03 10:10:24
 */
public class AlipayTradeSettleConfirmCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2223422382757758483L;

	/** 
	 * 原始确认结算时的请求号，对应于需要撤销的那笔请求
	 */
	@ApiField("ori_request_no")
	private String oriRequestNo;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setOriRequestNo(String oriRequestNo) {
		this.oriRequestNo = oriRequestNo;
	}
	public String getOriRequestNo( ) {
		return this.oriRequestNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
