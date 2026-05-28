package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.industry.card.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-27 16:49:28
 */
public class AlipayCommerceTransportIndustryCardRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6591624269149558394L;

	/** 
	 * 退卡状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

}
