package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.inquiry.doctor.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-16 14:19:12
 */
public class AlipayCommerceMedicalInquiryDoctorUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3298698833394161374L;

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
