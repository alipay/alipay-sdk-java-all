package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花名册部门组织节点
 *
 * @author auto create
 * @since 1.0, 2024-11-04 15:02:45
 */
public class EduDepartmentNode extends AlipayObject {

	private static final long serialVersionUID = 6536481123153532173L;

	/**
	 * 人员所属的部门、学院或班级等组织节点外部唯一标识
	 */
	@ApiField("department_code")
	private String departmentCode;

	/**
	 * 人员所属的部门、学院或班级名称
	 */
	@ApiField("department_name")
	private String departmentName;

	public String getDepartmentCode() {
		return this.departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
