package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建医生智能体
 *
 * @author auto create
 * @since 1.0, 2026-02-26 15:17:43
 */
public class AlipayCommerceMedicalDoctoragentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1848777624932462335L;

	/**
	 * 医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

}
