package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权码换取支付宝用户多端身份访问令牌
 *
 * @author auto create
 * @since 1.0, 2026-09-21 14:32:54
 */
public class AlipayOpenOauthTokenGrantModel extends AlipayObject {

	private static final long serialVersionUID = 7853264186516361394L;

	/**
	 * 智能体调用场景，此字段必填，并严格匹配与授权码（auth_code）的归属关系
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 授权码，用户授权后得到。
	 */
	@ApiField("auth_code")
	private String authCode;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

}
