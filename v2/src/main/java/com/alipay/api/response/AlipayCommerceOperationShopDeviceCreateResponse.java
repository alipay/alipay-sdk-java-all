package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.shop.device.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-07 11:32:14
 */
public class AlipayCommerceOperationShopDeviceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2761539615237123372L;

	/** 
	 * 受理成功时返回，可用于问题排查和对账
	 */
	@ApiField("submission_no")
	private String submissionNo;

	public void setSubmissionNo(String submissionNo) {
		this.submissionNo = submissionNo;
	}
	public String getSubmissionNo( ) {
		return this.submissionNo;
	}

}
