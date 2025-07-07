package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.point.clear response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-02 21:52:21
 */
public class AlipayCommerceAcommunicationPointClearResponse extends AlipayResponse {

	private static final long serialVersionUID = 5549779169912868357L;

	/** 
	 * 积分id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 实际扣减的积分数，单位为个
	 */
	@ApiField("real_point")
	private Long realPoint;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setRealPoint(Long realPoint) {
		this.realPoint = realPoint;
	}
	public Long getRealPoint( ) {
		return this.realPoint;
	}

}
