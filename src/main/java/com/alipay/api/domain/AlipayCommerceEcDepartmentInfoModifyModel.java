package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业部门信息修改
 *
 * @author auto create
 * @since 1.0, 2022-09-06 15:30:40
 */
public class AlipayCommerceEcDepartmentInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6484342968872324471L;

	/**
	 * 部门编码，不同部门的编码不能相同，为空则代表不修改
	 */
	@ApiField("department_code")
	private String departmentCode;

	/**
	 * 待修改部门的部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 部门名称，为空则代表不修改
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 上级部门id，为空则代表不修改
	 */
	@ApiField("parent_department_id")
	private String parentDepartmentId;

	public String getDepartmentCode() {
		return this.departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

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
