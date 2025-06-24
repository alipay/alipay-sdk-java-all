package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码isv集成授权码信息
 *
 * @author auto create
 * @since 1.0, 2024-08-15 19:43:51
 */
public class OpenAccessCodeDTO extends AlipayObject {

	private static final long serialVersionUID = 8153338829782612363L;

	/**
	 * 授权码 当前字段已废弃(auth_code代替该出参)
	 */
	@ApiField("access_code")
	@Deprecated
	private String accessCode;

	/**
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 过期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	public String getAccessCode() {
		return this.accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

}
