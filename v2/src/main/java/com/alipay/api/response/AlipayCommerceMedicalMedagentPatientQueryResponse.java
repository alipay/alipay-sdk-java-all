package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PatientVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.patient.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-27 00:04:49
 */
public class AlipayCommerceMedicalMedagentPatientQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8165482197866332847L;

	/** 
	 * 就诊人信息
	 */
	@ApiField("data")
	private PatientVO data;

	public void setData(PatientVO data) {
		this.data = data;
	}
	public PatientVO getData( ) {
		return this.data;
	}

}
