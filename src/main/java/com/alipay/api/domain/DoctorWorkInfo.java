package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生工作信息
 *
 * @author auto create
 * @since 1.0, 2022-06-20 14:30:48
 */
public class DoctorWorkInfo extends AlipayObject {

	private static final long serialVersionUID = 7367213393779645213L;

	/**
	 * 科室工作信息
	 */
	@ApiListField("department_info")
	@ApiField("doctor_work_department_info")
	private List<DoctorWorkDepartmentInfo> departmentInfo;

	/**
	 * 医院id
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	public List<DoctorWorkDepartmentInfo> getDepartmentInfo() {
		return this.departmentInfo;
	}
	public void setDepartmentInfo(List<DoctorWorkDepartmentInfo> departmentInfo) {
		this.departmentInfo = departmentInfo;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}
