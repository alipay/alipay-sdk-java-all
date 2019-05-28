package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拼团用户信息
 *
 * @author auto create
 * @since 1.0, 2018-11-22 16:51:57
 */
public class PintuanUserInfo extends AlipayObject {

	private static final long serialVersionUID = 4318655712179747919L;

	/**
	 * 头像地址
	 */
	@ApiField("avatar_url")
	private String avatarUrl;

	/**
	 * havanaId
	 */
	@ApiField("havana_id")
	private String havanaId;

	/**
	 * 昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	public String getAvatarUrl() {
		return this.avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getHavanaId() {
		return this.havanaId;
	}
	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
