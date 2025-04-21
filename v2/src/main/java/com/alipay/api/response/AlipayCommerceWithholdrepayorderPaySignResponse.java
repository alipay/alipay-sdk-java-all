package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.withholdrepayorder.pay.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-02 11:03:13
 */
public class AlipayCommerceWithholdrepayorderPaySignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7384895381456641988L;

	/** 
	 * 获取签名后的业务数据
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
