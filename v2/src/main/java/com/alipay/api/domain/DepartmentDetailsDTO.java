package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 部门信息
 *
 * @author auto create
 * @since 1.0, 2023-03-21 19:12:01
 */
public class DepartmentDetailsDTO extends AlipayObject {

	private static final long serialVersionUID = 8659978916887141865L;

	/**
	 * departmentId-否-部门唯一标识-无枚举-被调方结果返回-无特殊说明
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * departmentName-否-部门名称，前端展示-无枚举-被调方结果返回-无特殊说明
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * parentId-否-上级部门id-无枚举-被调方结果返回-无特殊说明
	 */
	@ApiField("parent_id")
	private String parentId;

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

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
