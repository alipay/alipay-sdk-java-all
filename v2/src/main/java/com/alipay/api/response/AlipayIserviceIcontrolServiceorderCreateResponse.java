package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.icontrol.serviceorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-23 17:42:21
 */
public class AlipayIserviceIcontrolServiceorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7497159665224143924L;

	/** 
	 * 经度
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
