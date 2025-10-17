package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝聊天群内群成员属性
 *
 * @author auto create
 * @since 1.0, 2024-11-07 11:33:31
 */
public class GroupMemberDetail extends AlipayObject {

	private static final long serialVersionUID = 8771419129287889821L;

	/**
	 * 支付宝聊天群内昵称
	 */
	@ApiField("group_nick_name")
	private String groupNickName;

	/**
	 * 邀请者的user_id
	 */
	@ApiField("invite_id")
	private String inviteId;

	/**
	 * 邀请商家开放id
	 */
	@ApiField("invite_open_id")
	private String inviteOpenId;

	/**
	 * 入群渠道
	 */
	@ApiField("join_scene")
	private String joinScene;

	/**
	 * 入群时间
	 */
	@ApiField("join_time")
	private Date joinTime;

	/**
	 * 商家openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getGroupNickName() {
		return this.groupNickName;
	}
	public void setGroupNickName(String groupNickName) {
		this.groupNickName = groupNickName;
	}

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

	public String getJoinScene() {
		return this.joinScene;
	}
	public void setJoinScene(String joinScene) {
		this.joinScene = joinScene;
	}

	public Date getJoinTime() {
		return this.joinTime;
	}
	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
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

}
