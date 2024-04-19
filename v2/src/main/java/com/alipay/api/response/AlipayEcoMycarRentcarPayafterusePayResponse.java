package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.rentcar.payafteruse.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:20
 */
public class AlipayEcoMycarRentcarPayafterusePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1717629569336291787L;

	/** 
	 * 此次扣款产生的支付宝交易号
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
