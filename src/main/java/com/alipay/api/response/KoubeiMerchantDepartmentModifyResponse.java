package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 23:47:22
 */
public class KoubeiMerchantDepartmentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2655359674166941973L;

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
