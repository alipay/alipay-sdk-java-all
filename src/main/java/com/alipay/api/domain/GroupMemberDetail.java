package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝聊天群内群成员属性
 *
 * @author auto create
 * @since 1.0, 2022-01-24 19:49:19
 */
public class GroupMemberDetail extends AlipayObject {

	private static final long serialVersionUID = 1638987837852296754L;

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
	 * 入群方式。
1 - 由群成员邀请入群（直接邀请入群）
2 - 由群成员邀请入群（通过邀请链接入群）
3 - 通过扫描群二维码入群
	 */
	@ApiField("join_scene")
	private String joinScene;

	/**
	 * 入群时间
	 */
	@ApiField("join_time")
	private Date joinTime;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
