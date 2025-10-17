package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能应用对话服务
 *
 * @author auto create
 * @since 1.0, 2025-05-12 14:12:27
 */
public class AlipayOpenAiAgentChatModel extends AlipayObject {

	private static final long serialVersionUID = 8623419221746326795L;

	/**
	 * 对话消息体，包含提问内容，附件列表，上下文参数等
	 */
	@ApiField("chat_payload")
	private ChatPayload chatPayload;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 会话发起者id
	 */
	@ApiField("initiator_id")
	private String initiatorId;

	/**
	 * 会话发起者id
	 */
	@ApiField("initiator_open_id")
	private String initiatorOpenId;

	/**
	 * 会话发起者类型
	 */
	@ApiField("initiator_type")
	private String initiatorType;

	/**
	 * 会话ID，用来串联同一次会话的多轮对话。如果调用方不传入则由平台生成。会在请求结果中返回。 默认情况下session 超过6个小时自动关闭
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 智能应用特性设置
	 */
	@ApiField("specifications")
	private ChatSpecifications specifications;

	public ChatPayload getChatPayload() {
		return this.chatPayload;
	}
	public void setChatPayload(ChatPayload chatPayload) {
		this.chatPayload = chatPayload;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getInitiatorId() {
		return this.initiatorId;
	}
	public void setInitiatorId(String initiatorId) {
		this.initiatorId = initiatorId;
	}

	public String getInitiatorOpenId() {
		return this.initiatorOpenId;
	}
	public void setInitiatorOpenId(String initiatorOpenId) {
		this.initiatorOpenId = initiatorOpenId;
	}

	public String getInitiatorType() {
		return this.initiatorType;
	}
	public void setInitiatorType(String initiatorType) {
		this.initiatorType = initiatorType;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public ChatSpecifications getSpecifications() {
		return this.specifications;
	}
	public void setSpecifications(ChatSpecifications specifications) {
		this.specifications = specifications;
	}

}
