package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字科技AI智库会话反馈
 *
 * @author auto create
 * @since 1.0, 2024-12-26 10:20:29
 */
public class DatadigitalAnttechDtsparkFeedbackSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2685843931113767537L;

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
	 * 会话ID，每次会话会产生唯一ID，根据ID可以获取历史对话记录
	 */
	@ApiField("session_id")
	private String sessionId;

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

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
