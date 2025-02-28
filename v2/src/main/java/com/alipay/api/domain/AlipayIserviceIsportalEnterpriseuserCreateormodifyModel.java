package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信登企业用户注册
 *
 * @author auto create
 * @since 1.0, 2024-10-16 11:12:57
 */
public class AlipayIserviceIsportalEnterpriseuserCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 8259512212236675455L;

	/**
	 * 用户账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 创建、修改或删除的类型，传入create、update、delete
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 用户的真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 用户角色
	 */
	@ApiField("role_code")
	private String roleCode;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRoleCode() {
		return this.roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

}
