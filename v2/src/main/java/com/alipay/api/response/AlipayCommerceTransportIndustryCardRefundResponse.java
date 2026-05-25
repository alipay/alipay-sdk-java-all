package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.industry.card.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-19 10:57:45
 */
public class AlipayCommerceTransportIndustryCardRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7686111395184865357L;

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
