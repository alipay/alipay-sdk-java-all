package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回复内容
 *
 * @author auto create
 * @since 1.0, 2025-05-07 15:29:40
 */
public class ReplyChatContent extends AlipayObject {

	private static final long serialVersionUID = 7646854344885224364L;

	/**
	 * 对话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 消息内容
	 */
	@ApiField("content")
	private OpenChatContent content;

	/**
	 * 消息内容类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 上下文信息
	 */
	@ApiField("context")
	private String context;

	/**
	 * 角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 内容id
	 */
	@ApiField("unit_id")
	private String unitId;

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public OpenChatContent getContent() {
		return this.content;
	}
	public void setContent(OpenChatContent content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUnitId() {
		return this.unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

}
