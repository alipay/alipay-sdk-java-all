package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.inquiry.hospital.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-24 20:57:47
 */
public class AlipayCommerceMedicalInquiryHospitalSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7235111349972812211L;

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
