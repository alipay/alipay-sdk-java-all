package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生智能体状态查询
 *
 * @author auto create
 * @since 1.0, 2025-07-25 14:49:26
 */
public class AlipayCommerceMedicalMedagentDoctoragentstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2792933945829748729L;

	/**
	 * 好大夫端医生的id
	 */
	@ApiField("hdf_doctor_id")
	private String hdfDoctorId;

	public String getHdfDoctorId() {
		return this.hdfDoctorId;
	}
	public void setHdfDoctorId(String hdfDoctorId) {
		this.hdfDoctorId = hdfDoctorId;
	}

}
