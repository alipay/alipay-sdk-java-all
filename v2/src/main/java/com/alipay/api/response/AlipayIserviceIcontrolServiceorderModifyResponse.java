package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.icontrol.serviceorder.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-13 15:32:16
 */
public class AlipayIserviceIcontrolServiceorderModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7666693161177815223L;

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
