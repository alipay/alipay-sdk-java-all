package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI付_APASS_QWEN解绑
 *
 * @author auto create
 * @since 1.0, 2026-10-17 12:22:59
 */
public class AlipaySecurityAipayApassUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 3529722823688657481L;

	/**
	 * JWT，payload 的 `extensions` 含 appName / appSign / resourceId / deviceId / clawType
	 */
	@ApiField("agent_auth_token")
	private String agentAuthToken;

	/**
	 * 业务场景，当前仅 `WYCLOUD`（可扩展）
	 */
	@ApiField("scene")
	private String scene;

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

}
