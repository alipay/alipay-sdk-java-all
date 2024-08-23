package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.icontrol.serviceorder.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-22 15:51:56
 */
public class AlipayIserviceIcontrolServiceorderModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5648244498126817926L;

	/** 
	 * 服务单id
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
