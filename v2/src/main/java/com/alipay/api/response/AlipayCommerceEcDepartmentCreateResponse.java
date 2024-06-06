package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.department.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-31 09:37:51
 */
public class AlipayCommerceEcDepartmentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5492439995573159669L;

	/** 
	 * 新创建的部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentId( ) {
		return this.departmentId;
	}

}
