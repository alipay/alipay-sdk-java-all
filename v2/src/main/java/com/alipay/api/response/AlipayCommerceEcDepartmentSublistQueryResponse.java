package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.department.sublist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-30 17:55:18
 */
public class AlipayCommerceEcDepartmentSublistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7493372698969774398L;

	/** 
	 * 部门id列表
	 */
	@ApiListField("department_id_list")
	@ApiField("string")
	private List<String> departmentIdList;

	public void setDepartmentIdList(List<String> departmentIdList) {
		this.departmentIdList = departmentIdList;
	}
	public List<String> getDepartmentIdList( ) {
		return this.departmentIdList;
	}

}
