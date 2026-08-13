package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动打卡删除部门
 *
 * @author auto create
 * @since 1.0, 2026-08-11 17:42:48
 */
public class AlipayCommerceEducateSportsDepartDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8451929686868293671L;

	/**
	 * 部门主键code，用于定位被删除的部门
	 */
	@ApiField("department_code")
	private String departmentCode;

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

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

}
