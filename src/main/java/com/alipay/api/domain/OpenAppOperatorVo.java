package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序操作员信息
 *
 * @author auto create
 * @since 1.0, 2022-08-23 19:27:36
 */
public class OpenAppOperatorVo extends AlipayObject {

	private static final long serialVersionUID = 3795982566827889597L;

	/**
	 * 登录账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 用户头像
	 */
	@ApiField("portrait")
	private String portrait;

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

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPortrait() {
		return this.portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
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
