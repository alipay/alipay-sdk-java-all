package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.aligroup.productopen.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:56:43
 */
public class AlipayOpenAligroupProductopenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4353617635699959172L;

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
