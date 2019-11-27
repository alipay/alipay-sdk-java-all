package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评论人信息
 *
 * @author auto create
 * @since 1.0, 2016-09-28 20:04:28
 */
public class McommentReplyUserInfo extends AlipayObject {

	private static final long serialVersionUID = 2519599774921894536L;

	/**
	 * 登录id
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 用户头像
	 */
	@ApiField("user_avatar")
	private String userAvatar;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getUserAvatar() {
		return this.userAvatar;
	}
	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
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
