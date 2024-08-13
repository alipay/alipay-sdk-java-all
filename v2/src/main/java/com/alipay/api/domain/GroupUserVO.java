package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群用户信息openapi模型,用于编辑商家群群组的群主和群管理员信息
 *
 * @author auto create
 * @since 1.0, 2024-05-15 16:49:56
 */
public class GroupUserVO extends AlipayObject {

	private static final long serialVersionUID = 6116371916749224348L;

	/**
	 * 邀请者的user_id，2088开头的16位数字。
	 */
	@ApiField("invite_id")
	private String inviteId;

	/**
	 * 邀请者的open_id，2088开头的16位数字。
	 */
	@ApiField("invite_open_id")
	private String inviteOpenId;

	/**
	 * 入群时间
	 */
	@ApiField("join_time")
	private String joinTime;

	/**
	 * 登录账号
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 用户openid，2088开头的16位数字。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户user_id，2088开头的16位数字。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名称（花名 or  昵称），后台会校验是否是真实姓名。
	 */
	@ApiField("user_name")
	private String userName;

	public String getInviteId() {
		return this.inviteId;
	}
	public void setInviteId(String inviteId) {
		this.inviteId = inviteId;
	}

	public String getInviteOpenId() {
		return this.inviteOpenId;
	}
	public void setInviteOpenId(String inviteOpenId) {
		this.inviteOpenId = inviteOpenId;
	}

	public String getJoinTime() {
		return this.joinTime;
	}
	public void setJoinTime(String joinTime) {
		this.joinTime = joinTime;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
