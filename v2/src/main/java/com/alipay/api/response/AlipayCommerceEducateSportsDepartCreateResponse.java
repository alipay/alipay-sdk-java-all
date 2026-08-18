package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.depart.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 17:37:52
 */
public class AlipayCommerceEducateSportsDepartCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2782731847889632852L;

	/** 
	 * 部门编码
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
