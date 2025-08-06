package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GetDoctorResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.doctor.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-31 09:33:28
 */
public class AlipayCommerceMedicalMedagentDoctorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8323882889413167122L;

	/** 
	 * 医生信息
	 */
	@ApiField("data")
	private GetDoctorResult data;

	public void setData(GetDoctorResult data) {
		this.data = data;
	}
	public GetDoctorResult getData( ) {
		return this.data;
	}

}
