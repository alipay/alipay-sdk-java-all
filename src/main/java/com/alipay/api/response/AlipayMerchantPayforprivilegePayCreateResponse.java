package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.pay.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-19 19:10:17
 */
public class AlipayMerchantPayforprivilegePayCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6292631542694528412L;

	/** 
	 * 用于唤起资金授权支付的orderStr参数
	 */
	@ApiField("order_str")
	private String orderStr;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
