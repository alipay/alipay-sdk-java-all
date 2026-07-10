package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跳转URL对象
 *
 * @author auto create
 * @since 1.0, 2026-06-05 17:08:53
 */
public class RedirectUrlParam extends AlipayObject {

	private static final long serialVersionUID = 8197351315449778195L;

	/**
	 * 端
	 */
	@ApiField("client")
	private String client;

	/**
	 * 跳转链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public String getClient() {
		return this.client;
	}
	public void setClient(String client) {
		this.client = client;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
