package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.order.pre.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-12 10:57:36
 */
public class AlipayCommerceRecycleOrderPreCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 2796196493854168993L;

	/** 
	 * 用来标识，当前工单或用户进件状态校验结果
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 用来标识，当前工单或用户进件状态校验结果的详细信息code
	 */
	@ApiField("order_status_reason")
	private String orderStatusReason;

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderStatusReason(String orderStatusReason) {
		this.orderStatusReason = orderStatusReason;
	}
	public String getOrderStatusReason( ) {
		return this.orderStatusReason;
	}

}
