package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.aggrepay.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:36:49
 */
public class AlipayPayAggrepayOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1339273844375534953L;

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
