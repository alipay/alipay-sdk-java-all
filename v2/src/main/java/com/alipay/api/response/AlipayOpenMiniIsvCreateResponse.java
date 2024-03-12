package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.isv.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:13
 */
public class AlipayOpenMiniIsvCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8597884337492338482L;

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
