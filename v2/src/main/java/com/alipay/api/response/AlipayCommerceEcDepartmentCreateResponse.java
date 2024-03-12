package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.department.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-19 10:29:07
 */
public class AlipayCommerceEcDepartmentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2818811821436196779L;

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
