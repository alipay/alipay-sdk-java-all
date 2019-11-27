package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:10:25
 */
public class MicroUserInfo extends AlipayObject {

	private static final long serialVersionUID = 8278548513898782275L;

	/**
	 * 用户头像
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 用户昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getHeadImg() {
		return this.headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
