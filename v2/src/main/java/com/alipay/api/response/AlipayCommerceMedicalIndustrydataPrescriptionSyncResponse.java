package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.prescription.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:11
 */
public class AlipayCommerceMedicalIndustrydataPrescriptionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8698246241142287889L;

	/** 
	 * 支付宝处方id
	 */
	@ApiField("alipay_prescription_id")
	private String alipayPrescriptionId;

	public void setAlipayPrescriptionId(String alipayPrescriptionId) {
		this.alipayPrescriptionId = alipayPrescriptionId;
	}
	public String getAlipayPrescriptionId( ) {
		return this.alipayPrescriptionId;
	}

}
