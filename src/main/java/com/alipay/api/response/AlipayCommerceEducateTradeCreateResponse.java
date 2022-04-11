package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.trade.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-16 21:06:23
 */
public class AlipayCommerceEducateTradeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7416115971125687998L;

	/** 
	 * 订单号
	 */
	@ApiField("edu_trade_no")
	private String eduTradeNo;

	public void setEduTradeNo(String eduTradeNo) {
		this.eduTradeNo = eduTradeNo;
	}
	public String getEduTradeNo( ) {
		return this.eduTradeNo;
	}

}
