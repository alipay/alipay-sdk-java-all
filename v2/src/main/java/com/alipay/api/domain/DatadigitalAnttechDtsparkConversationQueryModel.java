package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字科技AI智库查询会话消息
 *
 * @author auto create
 * @since 1.0, 2024-12-26 10:20:36
 */
public class DatadigitalAnttechDtsparkConversationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4177622364855721617L;

	/**
	 * AI智库配置的智能会话助手唯一id
	 */
	@ApiField("agent_id")
	private Long agentId;

	/**
	 * 智能体对应secret，用于校验智能体是否正确
	 */
	@ApiField("secret")
	private String secret;

	/**
	 * 会话ID，每次会话会产生唯一ID，根据ID可以获取历史对话记录
	 */
	@ApiField("session_id")
	private String sessionId;

	public Long getAgentId() {
		return this.agentId;
	}
	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public String getSecret() {
		return this.secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
