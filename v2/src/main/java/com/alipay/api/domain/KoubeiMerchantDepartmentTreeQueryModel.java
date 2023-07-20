package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组织部门树查询接口
 *
 * @author auto create
 * @since 1.0, 2022-06-17 16:48:09
 */
public class KoubeiMerchantDepartmentTreeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6296983545944758891L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 商户的部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 部门类型，5为非叶子节点部门即商户创建的部门；6为叶子节点部门即门店，门店在业务上被当成是类型为6的部门
	 */
	@ApiField("type")
	private String type;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
