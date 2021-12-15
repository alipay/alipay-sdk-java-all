package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.pay.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 20:56:35
 */
public class AlipayMerchantPayforprivilegePayCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3711626677278916518L;

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
