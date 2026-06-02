package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DepartmentInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.search.department.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-25 14:37:44
 */
public class AlipayCommerceMedicalSearchDepartmentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2346869247693841953L;

	/** 
	 * 科室列表
	 */
	@ApiField("depart_list")
	private DepartmentInfoVO departList;

	public void setDepartList(DepartmentInfoVO departList) {
		this.departList = departList;
	}
	public DepartmentInfoVO getDepartList( ) {
		return this.departList;
	}

}
