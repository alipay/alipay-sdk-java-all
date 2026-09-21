package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.service.digitalpoi.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-03 16:26:19
 */
public class AlipayCommerceOperationServiceDigitalpoiCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4278412545281939382L;

	/** 
	 * 一次调用返回的提交记录id
	 */
	@ApiField("submit_record_id")
	private String submitRecordId;

	public void setSubmitRecordId(String submitRecordId) {
		this.submitRecordId = submitRecordId;
	}
	public String getSubmitRecordId( ) {
		return this.submitRecordId;
	}

}
