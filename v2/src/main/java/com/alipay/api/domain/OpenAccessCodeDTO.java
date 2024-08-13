package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码isv集成授权码信息
 *
 * @author auto create
 * @since 1.0, 2024-05-31 09:52:03
 */
public class OpenAccessCodeDTO extends AlipayObject {

	private static final long serialVersionUID = 5539828927369255844L;

	/**
	 * 授权码
	 */
	@ApiField("access_code")
	private String accessCode;

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

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

}
