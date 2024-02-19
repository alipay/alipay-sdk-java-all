package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商户门店
 *
 * @author auto create
 * @since 1.0, 2022-06-17 16:45:19
 */
public class KoubeiMerchantShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2837853522974876773L;

	/**
	 * 用户从口碑商家中心页面跳转到ISV页面时url中带有的authCode值,用来ISV获取用户身份。
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 商户的部门id，如果有值，返回当前商户下的所有未分配过部门的门店，加上当前部门id及其下分支部门的门店一起返回。如果为空，则仅返回当前商户下的所有未分配过部门的门店。
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
