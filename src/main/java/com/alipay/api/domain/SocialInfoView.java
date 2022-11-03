package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 头像、昵称视图
 *
 * @author auto create
 * @since 1.0, 2019-01-26 16:33:09
 */
public class SocialInfoView extends AlipayObject {

	private static final long serialVersionUID = 7122737688721392453L;

	/**
	 * 用户头像链接，如果用户没有设置头像，则返回空
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 用户昵称，如果用户没有设置昵称，则返回空
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
