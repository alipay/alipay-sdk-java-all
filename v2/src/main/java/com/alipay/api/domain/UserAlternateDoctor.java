package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已备选医生<好大夫Id、医生内部Id、备选操作时间>
 *
 * @author auto create
 * @since 1.0, 2025-03-26 14:29:47
 */
public class UserAlternateDoctor extends AlipayObject {

	private static final long serialVersionUID = 5633192456499163654L;

	/**
	 * 医生内部id
	 */
	@ApiField("doctor_inner_id")
	private String doctorInnerId;

	/**
	 * 好大夫医生id
	 */
	@ApiField("hdf_doctor_id")
	private String hdfDoctorId;

	public String getDoctorInnerId() {
		return this.doctorInnerId;
	}
	public void setDoctorInnerId(String doctorInnerId) {
		this.doctorInnerId = doctorInnerId;
	}

	public String getHdfDoctorId() {
		return this.hdfDoctorId;
	}
	public void setHdfDoctorId(String hdfDoctorId) {
		this.hdfDoctorId = hdfDoctorId;
	}

}
