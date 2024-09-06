package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2024-07-23 15:59:04
 */
public class DanmuGameUserInfo extends AlipayObject {

	private static final long serialVersionUID = 2459596617212985764L;

	/**
	 * 用户头像url
	 */
	@ApiField("head_url")
	private String headUrl;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户昵称
	 */
	@ApiField("user_name")
	private String userName;

	public String getHeadUrl() {
		return this.headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
