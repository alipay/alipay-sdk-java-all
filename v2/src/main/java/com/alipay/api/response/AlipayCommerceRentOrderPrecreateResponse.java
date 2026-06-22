package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-01 00:08:13
 */
public class AlipayCommerceRentOrderPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3431519266524536698L;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
