package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-06 21:06:43
 */
public class AlipayOpenMiniOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8248728958722258736L;

	/** 
	 * 退款id
	 */
	@ApiField("refund_id")
	private String refundId;

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getRefundId( ) {
		return this.refundId;
	}

}
