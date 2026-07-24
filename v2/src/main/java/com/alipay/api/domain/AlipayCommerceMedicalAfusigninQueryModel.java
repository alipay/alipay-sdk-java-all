package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫医生开通阿福报道信息查询
 *
 * @author auto create
 * @since 1.0, 2026-04-03 13:57:44
 */
public class AlipayCommerceMedicalAfusigninQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3519735863765272227L;

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
