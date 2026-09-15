package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.inquiry.service.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-24 20:57:47
 */
public class AlipayCommerceMedicalInquiryServiceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5631439161151814711L;

	/** 
	 * 同步记录id
	 */
	@ApiField("original_record_id")
	private String originalRecordId;

	public void setOriginalRecordId(String originalRecordId) {
		this.originalRecordId = originalRecordId;
	}
	public String getOriginalRecordId( ) {
		return this.originalRecordId;
	}

}
