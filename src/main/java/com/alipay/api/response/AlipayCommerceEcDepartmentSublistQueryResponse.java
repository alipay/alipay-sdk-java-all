package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.department.sublist.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-14 17:06:50
 */
public class AlipayCommerceEcDepartmentSublistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8654538129646575264L;

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
