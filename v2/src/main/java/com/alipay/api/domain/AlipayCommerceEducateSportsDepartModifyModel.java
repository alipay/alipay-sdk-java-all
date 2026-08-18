package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动打卡修改部门
 *
 * @author auto create
 * @since 1.0, 2026-08-11 17:37:52
 */
public class AlipayCommerceEducateSportsDepartModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5717692311264974235L;

	/**
	 * 部门主键code，用于定位被修改的部门
	 */
	@ApiField("department_code")
	private String departmentCode;

	/**
	 * 部门名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 学校组织code
	 */
	@ApiField("organization_code")
	private String organizationCode;

	public String getDepartmentCode() {
		return this.departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

}
