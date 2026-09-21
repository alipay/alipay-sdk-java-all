package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.prescription.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-20 18:09:55
 */
public class AlipayCommerceMedicalIndustrydataPrescriptionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2871144364146139833L;

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
