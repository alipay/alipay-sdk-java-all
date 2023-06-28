package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV向商户发起应用授权邀约
 *
 * @author auto create
 * @since 1.0, 2022-12-29 10:50:22
 */
public class AlipayOpenAuthAppauthInviteCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2866173631572938721L;

	/**
	 * 指定授权的商户appid
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/**
	 * 授权回调地址，用于返回应用授权码
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 自定义参数，授权后回调时透传回服务商。对应的值必须为 base64 编码。
	 */
	@ApiField("state")
	private String state;

	public String getAuthAppId() {
		return this.authAppId;
	}
	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
