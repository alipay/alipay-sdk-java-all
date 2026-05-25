package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生基本信息查询
 *
 * @author auto create
 * @since 1.0, 2026-02-26 15:17:43
 */
public class AlipayCommerceMedicalDoctorinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4777472377486897883L;

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
