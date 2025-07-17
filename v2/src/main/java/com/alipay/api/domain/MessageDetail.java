package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会话详细描述信息
 *
 * @author auto create
 * @since 1.0, 2024-12-26 10:20:36
 */
public class MessageDetail extends AlipayObject {

	private static final long serialVersionUID = 1791998746886852626L;

	/**
	 * 消息具体内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 反馈状态,0表示未反馈,1表示点赞,2表示踩
	 */
	@ApiField("feedback_status")
	private Long feedbackStatus;

	/**
	 * 消息ID，会话中每条消息的唯一ID
	 */
	@ApiField("message_id")
	private Long messageId;

	/**
	 * 标识该消息所属角色
	 */
	@ApiField("role")
	private String role;

	/**
	 * 会话ID，每次会话会产生唯一ID，根据ID可以获取历史对话记录
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Long getFeedbackStatus() {
		return this.feedbackStatus;
	}
	public void setFeedbackStatus(Long feedbackStatus) {
		this.feedbackStatus = feedbackStatus;
	}

	public Long getMessageId() {
		return this.messageId;
	}
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
