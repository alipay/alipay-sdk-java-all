package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字科技AI智库对话
 *
 * @author auto create
 * @since 1.0, 2024-12-26 10:20:20
 */
public class DatadigitalAnttechDtsparkChatQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3388188266928427766L;

	/**
	 * AI智库配置的智能会话助手唯一id
	 */
	@ApiField("agent_id")
	private Long agentId;

	/**
	 * 提问内容
	 */
	@ApiField("question")
	private String question;

	/**
	 * 智能体对应secret，用于校验智能体是否正确
	 */
	@ApiField("secret")
	private String secret;

	/**
	 * 标识同一次多轮对话的id，session_id相同表示用户在同一会话中
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 标识调用的场景，可由调用方自行定义：如网页端可用web等等
	 */
	@ApiField("source")
	private String source;

	public Long getAgentId() {
		return this.agentId;
	}
	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
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

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
