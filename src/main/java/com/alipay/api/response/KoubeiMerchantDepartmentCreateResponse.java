package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-26 12:00:07
 */
public class KoubeiMerchantDepartmentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5728215257942762239L;

	/** 
	 * 员工管理场景商户创建部门成功时返回的部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptId( ) {
		return this.deptId;
	}

}
