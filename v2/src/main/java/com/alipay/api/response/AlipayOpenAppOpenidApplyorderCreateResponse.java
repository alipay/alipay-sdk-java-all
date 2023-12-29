package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openid.applyorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-28 11:41:55
 */
public class AlipayOpenAppOpenidApplyorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5335948294525896883L;

	/** 
	 * 工单的唯一标识
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
