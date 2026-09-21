package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.inquiry.hospital.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-20 19:47:52
 */
public class AlipayCommerceMedicalInquiryHospitalSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5818129979325569112L;

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
