package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hy.inquiryorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-18 20:17:56
 */
public class AlipayCommerceMedicalHyInquiryorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6855824265678764714L;

	/** 
	 * 退费流水号
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}
	public String getRefundRequestNo( ) {
		return this.refundRequestNo;
	}

}
