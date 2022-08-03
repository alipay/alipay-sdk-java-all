package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序操作员信息
 *
 * @author auto create
 * @since 1.0, 2022-06-30 10:35:14
 */
public class OpenAppOperatorVo extends AlipayObject {

	private static final long serialVersionUID = 4666795972549236757L;

	/**
	 * 登录账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 角色
	 */
	@ApiField("role")
	private String role;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户Id
	 */
	@ApiField("user_id")
	private String userId;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
