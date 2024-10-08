package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.withholdrepayorder.pay.sign response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 09:49:56
 */
public class AlipayCommerceWithholdrepayorderPaySignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1699291217782513113L;

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
