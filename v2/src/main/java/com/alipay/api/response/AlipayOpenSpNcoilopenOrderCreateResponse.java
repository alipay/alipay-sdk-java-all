package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ncoilopen.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 11:07:41
 */
public class AlipayOpenSpNcoilopenOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1152783188929576195L;

	/** 
	 * 申请单id
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
