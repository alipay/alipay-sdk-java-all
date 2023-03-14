package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业部门创建
 *
 * @author auto create
 * @since 1.0, 2022-11-18 23:04:21
 */
public class AlipayCommerceEcDepartmentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7434472752816442272L;

	/**
	 * 部门编码，不同部门的编码不可重复，如果为空则生成默认部门编码
	 */
	@ApiField("department_code")
	private String departmentCode;

	/**
	 * 部门名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 上级部门id，如果为空则默认设置上级部门为根部门
	 */
	@ApiField("parent_department_id")
	private String parentDepartmentId;

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

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getParentDepartmentId() {
		return this.parentDepartmentId;
	}
	public void setParentDepartmentId(String parentDepartmentId) {
		this.parentDepartmentId = parentDepartmentId;
	}

}
