package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DepartmentInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.department.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:21:45
 */
public class AlipayCommerceEcDepartmentInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2522575541878937355L;

	/** 
	 * 部门信息
	 */
	@ApiField("department_info")
	private DepartmentInfoDTO departmentInfo;

	public void setDepartmentInfo(DepartmentInfoDTO departmentInfo) {
		this.departmentInfo = departmentInfo;
	}
	public DepartmentInfoDTO getDepartmentInfo( ) {
		return this.departmentInfo;
	}

}
