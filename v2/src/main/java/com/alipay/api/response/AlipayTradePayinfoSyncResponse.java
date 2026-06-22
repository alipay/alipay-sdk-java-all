package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.payinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-13 00:07:44
 */
public class AlipayTradePayinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3128453675425691775L;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

}
