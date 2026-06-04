package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GetDoctorResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.doctor.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-27 00:04:48
 */
public class AlipayCommerceMedicalMedagentDoctorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4759592727462211857L;

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
