package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体信息查询
 *
 * @author auto create
 * @since 1.0, 2025-07-17 10:21:02
 */
public class AlipayCommerceMedicalMedagentAgentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3135891916989893442L;

	/**
	 * 科室名称
	 */
	@ApiField("department")
	private String department;

	/**
	 * 医生名称
	 */
	@ApiField("doctor")
	private String doctor;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDoctor() {
		return this.doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}
