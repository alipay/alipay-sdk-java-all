package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hy.inquiryorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-01 20:42:50
 */
public class AlipayCommerceMedicalHyInquiryorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8391399462798391338L;

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
