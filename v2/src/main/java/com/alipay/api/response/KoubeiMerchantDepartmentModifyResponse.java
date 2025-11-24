package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:35
 */
public class KoubeiMerchantDepartmentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1392193246581382479L;

	/** 
	 * 修改商户部门成功时返回的部门id
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
