package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.prescriptionstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-19 16:25:24
 */
public class AlipayCommerceMedicalIndustrydataPrescriptionstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6561448988432283186L;

	/** 
	 * 处方状态
	 */
	@ApiField("prescription_status")
	private String prescriptionStatus;

	public void setPrescriptionStatus(String prescriptionStatus) {
		this.prescriptionStatus = prescriptionStatus;
	}
	public String getPrescriptionStatus( ) {
		return this.prescriptionStatus;
	}

}
