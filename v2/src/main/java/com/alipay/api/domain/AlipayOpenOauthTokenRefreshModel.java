package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷新令牌换取支付宝用户多端身份新访问令牌
 *
 * @author auto create
 * @since 1.0, 2026-09-21 14:27:35
 */
public class AlipayOpenOauthTokenRefreshModel extends AlipayObject {

	private static final long serialVersionUID = 8339393195171625466L;

	/**
	 * 智能体调用场景，此字段必填，并严格匹配与刷新令牌（refresh_token）的归属关系
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 刷新令牌，用于换取新的访问令牌
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

}
