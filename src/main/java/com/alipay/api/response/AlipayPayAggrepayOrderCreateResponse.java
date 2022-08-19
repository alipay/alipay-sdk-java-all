package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.aggrepay.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-17 14:41:46
 */
public class AlipayPayAggrepayOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6768797432525889674L;

	/** 
	 * 微信支付参数相关信息
	 */
	@ApiField("pay_data")
	private String payData;

	public void setPayData(String payData) {
		this.payData = payData;
	}
	public String getPayData( ) {
		return this.payData;
	}

}
