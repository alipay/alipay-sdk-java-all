package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 群用户信息openapi模型,用于编辑商家群群组的群主和群管理员信息
 *
 * @author auto create
 * @since 1.0, 2024-09-30 21:27:16
 */
public class GroupUserVO extends AlipayObject {

	private static final long serialVersionUID = 3614546396262261686L;

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
	 * 入群方式。BY_TOKEN - 通过吱口令入群；BY_INV - 通过被邀请或者被选择入群；BY_COD - 通过扫码入群；BY_FTF- 通过面对面入群；BY_ADD - 外部添加来源；BY_CHAT_ROOM - 聊天室；BY_OPENAPI - 开放平台；BY_SHARE_INV - 通过分享的邀请链接进群；BY_BIZ_INVOKE - 通过业务系统调用进群；BY_SELF_ENTER -通过自主进群；DIS - 讨论组进群；SOCIAL - 社区业务调用进群；BY_UNKNOW -未知来源。其余的属于商户自定义的入群方式！！！
	 */
	@ApiField("join_scene")
	private String joinScene;

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
	 * 用户推广入群的渠道列表，可有多个渠道code，按列表顺序为：第一渠道、第二渠道依次存储
	 */
	@ApiListField("promote_channel_keys")
	@ApiField("string")
	private List<String> promoteChannelKeys;

	/**
	 * 邀请者uid对应的unionId
	 */
	@ApiField("union_id_from_invite_id")
	private String unionIdFromInviteId;

	/**
	 * 用户uid对应的unionId
	 */
	@ApiField("union_id_from_user_id")
	private String unionIdFromUserId;

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

	public String getJoinScene() {
		return this.joinScene;
	}
	public void setJoinScene(String joinScene) {
		this.joinScene = joinScene;
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

	public List<String> getPromoteChannelKeys() {
		return this.promoteChannelKeys;
	}
	public void setPromoteChannelKeys(List<String> promoteChannelKeys) {
		this.promoteChannelKeys = promoteChannelKeys;
	}

	public String getUnionIdFromInviteId() {
		return this.unionIdFromInviteId;
	}
	public void setUnionIdFromInviteId(String unionIdFromInviteId) {
		this.unionIdFromInviteId = unionIdFromInviteId;
	}

	public String getUnionIdFromUserId() {
		return this.unionIdFromUserId;
	}
	public void setUnionIdFromUserId(String unionIdFromUserId) {
		this.unionIdFromUserId = unionIdFromUserId;
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
