package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.depart.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 17:37:52
 */
public class AlipayCommerceEducateSportsDepartModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1547282445143578294L;

	/** 
	 * 部门主键code
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
