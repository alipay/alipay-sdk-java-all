package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生工作科室信息
 *
 * @author auto create
 * @since 1.0, 2022-06-20 14:30:48
 */
public class DoctorWorkDepartmentInfo extends AlipayObject {

	private static final long serialVersionUID = 4495159639132635167L;

	/**
	 * 科室id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 科室名称
	 */
	@ApiField("department_name")
	private String departmentName;

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
