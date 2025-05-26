package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序成员模型
 *
 * @author auto create
 * @since 1.0, 2024-02-02 16:32:17
 */
public class AppMemberInfo extends AlipayObject {

	private static final long serialVersionUID = 5456244224873174918L;

	/**
	 * 邀请时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_invite")
	private String gmtInvite;

	/**
	 * 加入时间，格式为yyyy-MM-dd
	 */
	@ApiField("gmt_join")
	private String gmtJoin;

	/**
	 * 支付宝登录账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 头像地址fileId(完整地址需自行拼接)
	 */
	@ApiField("portrait")
	private String portrait;

	/**
	 * 角色类型
	 */
	@ApiField("role")
	private String role;

	/**
	 * 成员的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getGmtInvite() {
		return this.gmtInvite;
	}
	public void setGmtInvite(String gmtInvite) {
		this.gmtInvite = gmtInvite;
	}

	public String getGmtJoin() {
		return this.gmtJoin;
	}
	public void setGmtJoin(String gmtJoin) {
		this.gmtJoin = gmtJoin;
	}

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
