package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权校验结果
 *
 * @author auto create
 * @since 1.0, 2026-07-09 12:42:50
 */
public class IsvAuthResult extends AlipayObject {

	private static final long serialVersionUID = 2469995497274223395L;

	/**
	 * 授权状态字段。
	 */
	@ApiField("auth_status")
	private Boolean authStatus;

	/**
	 * 令牌有效期，单位s。
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/**
	 * 刷新令牌有效期，单位s。
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	public Boolean getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(Boolean authStatus) {
		this.authStatus = authStatus;
	}

	public String getExpiresIn() {
		return this.expiresIn;
	}
	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getReExpiresIn() {
		return this.reExpiresIn;
	}
	public void setReExpiresIn(String reExpiresIn) {
		this.reExpiresIn = reExpiresIn;
	}

}
