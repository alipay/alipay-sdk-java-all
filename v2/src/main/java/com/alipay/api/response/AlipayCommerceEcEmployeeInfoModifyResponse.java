package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-28 09:57:24
 */
public class AlipayCommerceEcEmployeeInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8153413865964395649L;

	/** 
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeId( ) {
		return this.employeeId;
	}

}
