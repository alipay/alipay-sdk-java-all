package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.trade.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-23 11:07:32
 */
public class AlipayOpenMiniTradeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5537215915627553277L;

	/** 
	 * 交易组件订单号
	 */
	@ApiField("mini_trade_no")
	private String miniTradeNo;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public void setMiniTradeNo(String miniTradeNo) {
		this.miniTradeNo = miniTradeNo;
	}
	public String getMiniTradeNo( ) {
		return this.miniTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

}
