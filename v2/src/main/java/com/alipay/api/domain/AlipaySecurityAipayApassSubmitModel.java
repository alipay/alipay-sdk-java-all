package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI付_APASS_QWEN注册
 *
 * @author auto create
 * @since 1.0, 2026-10-17 11:42:59
 */
public class AlipaySecurityAipayApassSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6548611642148925345L;

	/**
	 * JWT，payload 的 `extensions` 含 appName / appSign / resourceId / deviceId / clawType
	 */
	@ApiField("agent_auth_token")
	private String agentAuthToken;

	/**
	 * 业务场景，当前仅 `QWEN`（可扩展）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * JWT，用于 EdDSA/RS256 签名验证 
	 */
	@ApiField("security_token")
	private String securityToken;

	public String getAgentAuthToken() {
		return this.agentAuthToken;
	}
	public void setAgentAuthToken(String agentAuthToken) {
		this.agentAuthToken = agentAuthToken;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSecurityToken() {
		return this.securityToken;
	}
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}

}
