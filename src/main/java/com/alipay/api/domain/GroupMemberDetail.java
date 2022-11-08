package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝聊天群内群成员属性
 *
 * @author auto create
 * @since 1.0, 2022-10-31 19:32:38
 */
public class GroupMemberDetail extends AlipayObject {

	private static final long serialVersionUID = 6861775425968645946L;

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
	 * 入群方式。
BY_TOKEN - 通过吱口令入群
BY_INV - 通过被邀请或者被选择入群
BY_COD - 通过面对面入群
BY_FTF- 通过面对面入群
BY_ADD - 外部添加来源
BY_OPENAPI - 开放平台
BY_SELF_ENTER -通过自主进群
BY_BIZ_INVOKE - 通过业务系统调用进群
BY_SHARE_INV - 通过分享的邀请链接进群
BY_UNKNOW -未知来源
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
