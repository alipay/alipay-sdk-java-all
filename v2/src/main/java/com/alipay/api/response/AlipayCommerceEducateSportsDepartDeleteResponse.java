package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.depart.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 17:42:48
 */
public class AlipayCommerceEducateSportsDepartDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2328222184471644332L;

	/** 
	 * 部门主键code，用于定位被删除的部门
	 */
	@ApiField("department_code")
	private String departmentCode;

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentCode( ) {
		return this.departmentCode;
	}

}
