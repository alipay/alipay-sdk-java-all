package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV履约同步的问诊类对象
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:17
 */
public class ConsultationParam extends AlipayObject {

	private static final long serialVersionUID = 1416361863465549178L;

	/**
	 * 医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生姓名
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
