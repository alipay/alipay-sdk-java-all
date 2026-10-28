package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.inquiry.drug.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-28 15:07:53
 */
public class AlipayCommerceMedicalInquiryDrugSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7791954437312438869L;

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
