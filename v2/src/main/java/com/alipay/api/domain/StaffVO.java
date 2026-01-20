package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:42:37
 */
public class StaffVO extends AlipayObject {

	private static final long serialVersionUID = 4789173172599551742L;

	/**
	 * null
	 */
	@ApiListField("department_jobs")
	@ApiField("department_job_v_o")
	private List<DepartmentJobVO> departmentJobs;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 员工id
	 */
	@ApiField("staff_id")
	private String staffId;

	/**
	 * 工号
	 */
	@ApiField("staff_no")
	private String staffNo;

	public List<DepartmentJobVO> getDepartmentJobs() {
		return this.departmentJobs;
	}
	public void setDepartmentJobs(List<DepartmentJobVO> departmentJobs) {
		this.departmentJobs = departmentJobs;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStaffId() {
		return this.staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffNo() {
		return this.staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

}
