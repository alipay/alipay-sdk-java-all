package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 重定向链接和链接对应的验证类型
 *
 * @author auto create
 * @since 1.0, 2026-10-22 15:20:37
 */
public class RedirectUrls extends AlipayObject {

	private static final long serialVersionUID = 2725436697995453924L;

	/**
	 * 重定向的链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 重定向链接的对应的枚举类型，● TEACHER
● STUDENT
	 */
	@ApiField("verify_type")
	private String verifyType;

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getVerifyType() {
		return this.verifyType;
	}
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

}
