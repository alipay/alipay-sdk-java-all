package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.inquiry.laboratory.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-23 18:22:54
 */
public class AlipayCommerceMedicalInquiryLaboratorySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3594973348334598342L;

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
