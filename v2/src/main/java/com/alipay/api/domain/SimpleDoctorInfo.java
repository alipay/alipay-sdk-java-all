package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生信息
 *
 * @author auto create
 * @since 1.0, 2026-04-16 17:47:45
 */
public class SimpleDoctorInfo extends AlipayObject {

	private static final long serialVersionUID = 5636383274757175477L;

	/**
	 * 医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

}
