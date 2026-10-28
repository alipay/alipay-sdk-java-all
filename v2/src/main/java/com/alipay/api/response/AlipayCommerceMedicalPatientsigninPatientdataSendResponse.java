package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.patientsignin.patientdata.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-14 14:27:58
 */
public class AlipayCommerceMedicalPatientsigninPatientdataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4675858577147535525L;

	/** 
	 * 标识
	 */
	@ApiField("pushflag")
	private Boolean pushflag;

	public void setPushflag(Boolean pushflag) {
		this.pushflag = pushflag;
	}
	public Boolean getPushflag( ) {
		return this.pushflag;
	}

}
