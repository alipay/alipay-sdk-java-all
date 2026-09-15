package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫医生开通阿福报道信息查询
 *
 * @author auto create
 * @since 1.0, 2026-09-01 14:48:31
 */
public class AlipayCommerceMedicalAfusigninQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3167235391194551428L;

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
