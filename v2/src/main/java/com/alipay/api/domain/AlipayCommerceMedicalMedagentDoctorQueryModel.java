package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生个人信息查询
 *
 * @author auto create
 * @since 1.0, 2025-03-31 09:33:28
 */
public class AlipayCommerceMedicalMedagentDoctorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3777754536387671331L;

	/**
	 * 蚂蚁侧医生id，线下提供映射即可。假设一个人绑定了3个医生则需要调用三次
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
