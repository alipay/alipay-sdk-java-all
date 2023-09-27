package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.aligroup.productopen.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:26:46
 */
public class AlipayOpenAligroupProductopenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6755856111625139148L;

	/** 
	 * 订单号
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
