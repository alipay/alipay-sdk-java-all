package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询部门对应门店
 *
 * @author auto create
 * @since 1.0, 2018-03-23 15:00:30
 */
public class KoubeiMerchantDepartmentShopsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6667237625819235455L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 判断是否需要加载下属部门的门店列表，当为true是加载当前及其下属部门关联的门店列表，为false时仅加载当前部门id关联的门店列表
	 */
	@ApiField("need_sub")
	private Boolean needSub;

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

	public Boolean getNeedSub() {
		return this.needSub;
	}
	public void setNeedSub(Boolean needSub) {
		this.needSub = needSub;
	}

}
