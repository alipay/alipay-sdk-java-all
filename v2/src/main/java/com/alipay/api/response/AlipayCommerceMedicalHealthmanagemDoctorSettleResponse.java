package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DoctorAccountingResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.healthmanagem.doctor.settle response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-22 17:12:45
 */
public class AlipayCommerceMedicalHealthmanagemDoctorSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 1241999764644942127L;

	/** 
	 * 医生核算结果
	 */
	@ApiField("data")
	private DoctorAccountingResponse data;

	public void setData(DoctorAccountingResponse data) {
		this.data = data;
	}
	public DoctorAccountingResponse getData( ) {
		return this.data;
	}

}
