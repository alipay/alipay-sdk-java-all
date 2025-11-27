package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GetDoctorResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.doctor.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 11:27:36
 */
public class AlipayCommerceMedicalMedagentDoctorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2844187726227795864L;

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
