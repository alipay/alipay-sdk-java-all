package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.icontrol.visitordispatch.submit response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-04 10:47:41
 */
public class AlipayIserviceIcontrolVisitordispatchSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3716622191651911457L;

	/** 
	 * 统一收单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 排队位置
	 */
	@ApiField("order_position")
	private String orderPosition;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderPosition(String orderPosition) {
		this.orderPosition = orderPosition;
	}
	public String getOrderPosition( ) {
		return this.orderPosition;
	}

}
