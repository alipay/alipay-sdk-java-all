package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.blueseaactivity.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:45:15
 */
public class AlipayOpenSpBlueseaactivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4741537591748312972L;

	/** 
	 * 申请单Id
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
