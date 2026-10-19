package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:12:58
 */
public class McpAuthorization extends AlipayObject {

	private static final long serialVersionUID = 8291618468688389335L;

	/**
	 * apiKey 授权
	 */
	@ApiField("api_key_authorization")
	private String apiKeyAuthorization;

	public String getApiKeyAuthorization() {
		return this.apiKeyAuthorization;
	}
	public void setApiKeyAuthorization(String apiKeyAuthorization) {
		this.apiKeyAuthorization = apiKeyAuthorization;
	}

}
