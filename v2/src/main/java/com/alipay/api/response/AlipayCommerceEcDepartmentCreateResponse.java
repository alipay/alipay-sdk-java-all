package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.department.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 17:31:40
 */
public class AlipayCommerceEcDepartmentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6675859115177372234L;

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
