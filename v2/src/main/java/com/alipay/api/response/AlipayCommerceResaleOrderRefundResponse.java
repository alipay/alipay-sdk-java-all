package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.resale.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-24 09:52:45
 */
public class AlipayCommerceResaleOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5547876626489722264L;

	/** 
	 * 退款编码
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
