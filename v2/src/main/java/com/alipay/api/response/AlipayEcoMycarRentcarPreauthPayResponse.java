package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.rentcar.preauth.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 11:02:03
 */
public class AlipayEcoMycarRentcarPreauthPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3116185939162984786L;

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
