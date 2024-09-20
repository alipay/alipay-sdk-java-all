package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.icontrol.serviceorder.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-06 16:14:01
 */
public class AlipayIserviceIcontrolServiceorderModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6291255752496314472L;

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
