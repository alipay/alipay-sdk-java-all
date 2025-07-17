package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.isv.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-22 10:05:33
 */
public class AlipayOpenMiniIsvCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1154924481447254398L;

	/** 
	 * 小程序代创建订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
