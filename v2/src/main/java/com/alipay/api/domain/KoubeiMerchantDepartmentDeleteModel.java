package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除商户部门
 *
 * @author auto create
 * @since 1.0, 2022-06-17 16:47:26
 */
public class KoubeiMerchantDepartmentDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1593278876284877527L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 需要被删除的部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getDeptId() {
		return this.deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

}
