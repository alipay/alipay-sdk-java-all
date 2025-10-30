package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.supplier.content.publish response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-23 22:17:29
 */
public class AlipayCommerceMedicalSupplierContentPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 4391324726853621911L;

	/** 
	 * 医疗侧生成的供给ID
	 */
	@ApiField("med_content_id")
	private String medContentId;

	public void setMedContentId(String medContentId) {
		this.medContentId = medContentId;
	}
	public String getMedContentId( ) {
		return this.medContentId;
	}

}
