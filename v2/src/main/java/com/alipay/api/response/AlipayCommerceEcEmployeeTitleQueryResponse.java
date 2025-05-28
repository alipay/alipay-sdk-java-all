package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EmployeeTitleInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.title.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-01 16:02:30
 */
public class AlipayCommerceEcEmployeeTitleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3356519223838666263L;

	/** 
	 * 员工可用抬头信息列表
	 */
	@ApiField("employee_title_list")
	private EmployeeTitleInfoDTO employeeTitleList;

	public void setEmployeeTitleList(EmployeeTitleInfoDTO employeeTitleList) {
		this.employeeTitleList = employeeTitleList;
	}
	public EmployeeTitleInfoDTO getEmployeeTitleList( ) {
		return this.employeeTitleList;
	}

}
