package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-26 16:37:58
 */
public class AlipayCommerceRentOrderPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2252861112487182896L;

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
