package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指定的appId和指定的openId解析userId
 *
 * @author auto create
 * @since 1.0, 2024-11-28 19:55:52
 */
public class SpecifyUserInfo extends AlipayObject {

	private static final long serialVersionUID = 2295121249347595675L;

	/**
	 * 指定主体appid
	 */
	@ApiField("specify_app_id")
	private String specifyAppId;

	/**
	 * 用户在指定主体appid对应的openid
	 */
	@ApiField("specify_open_id")
	private String specifyOpenId;

	public String getSpecifyAppId() {
		return this.specifyAppId;
	}
	public void setSpecifyAppId(String specifyAppId) {
		this.specifyAppId = specifyAppId;
	}

	public String getSpecifyOpenId() {
		return this.specifyOpenId;
	}
	public void setSpecifyOpenId(String specifyOpenId) {
		this.specifyOpenId = specifyOpenId;
	}

}
