package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作废支付宝用户多端身份访问令牌
 *
 * @author auto create
 * @since 1.0, 2026-09-21 14:27:34
 */
public class AlipayOpenOauthTokenRevokeModel extends AlipayObject {

	private static final long serialVersionUID = 8194549122249979974L;

	/**
	 * 访问令牌。通过该访问令牌调用支付宝开放平台
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 智能体调用场景，此字段必填，并严格匹配与访问令牌（access_token）的归属关系
	 */
	@ApiField("agent_id")
	private String agentId;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

}
