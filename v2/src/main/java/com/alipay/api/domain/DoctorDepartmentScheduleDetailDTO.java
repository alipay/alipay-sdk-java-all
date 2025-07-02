package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 科室医生排班信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:04:13
 */
public class DoctorDepartmentScheduleDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 3662882729929515871L;

	/**
	 * 科室Id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 科室名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 排班信息
	 */
	@ApiListField("schedule_date_list")
	@ApiField("doctor_register_schedule_date_d_t_o")
	private List<DoctorRegisterScheduleDateDTO> scheduleDateList;

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

	public List<DoctorRegisterScheduleDateDTO> getScheduleDateList() {
		return this.scheduleDateList;
	}
	public void setScheduleDateList(List<DoctorRegisterScheduleDateDTO> scheduleDateList) {
		this.scheduleDateList = scheduleDateList;
	}

}
