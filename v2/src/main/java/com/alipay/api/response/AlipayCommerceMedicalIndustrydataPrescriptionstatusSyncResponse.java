package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.prescriptionstatus.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-14 15:22:16
 */
public class AlipayCommerceMedicalIndustrydataPrescriptionstatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2255894414932322443L;

	/** 
	 * alipay_prescription_id
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
