package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 科室VO
 *
 * @author auto create
 * @since 1.0, 2024-12-09 15:01:57
 */
public class DepartmentVO extends AlipayObject {

	private static final long serialVersionUID = 4484244693473999892L;

	/**
	 * 能挂号
	 */
	@ApiField("can_reg")
	private Boolean canReg;

	/**
	 * 科室id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 一级科室
	 */
	@ApiField("dept_level")
	private String deptLevel;

	/**
	 * 科室名称
	 */
	@ApiField("dept_name")
	private String deptName;

	/**
	 * 父科室id
	 */
	@ApiField("parent_dept_id")
	private String parentDeptId;

	public Boolean getCanReg() {
		return this.canReg;
	}
	public void setCanReg(Boolean canReg) {
		this.canReg = canReg;
	}

	public String getDeptId() {
		return this.deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptLevel() {
		return this.deptLevel;
	}
	public void setDeptLevel(String deptLevel) {
		this.deptLevel = deptLevel;
	}

	public String getDeptName() {
		return this.deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getParentDeptId() {
		return this.parentDeptId;
	}
	public void setParentDeptId(String parentDeptId) {
		this.parentDeptId = parentDeptId;
	}

}
