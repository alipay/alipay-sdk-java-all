package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销对话
 *
 * @author auto create
 * @since 1.0, 2026-01-19 12:02:42
 */
public class AlipayIservicePromotioncoreChatCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4132384341678164183L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 历史对话记录
	 */
	@ApiField("history")
	private String history;

	/**
	 * 消息id，用于幂等
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * 消息内容
	 */
	@ApiField("message_info")
	private String messageInfo;

	/**
	 * 返回类型
	 */
	@ApiField("return_type")
	private String returnType;

	/**
	 * 场景

	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getHistory() {
		return this.history;
	}
	public void setHistory(String history) {
		this.history = history;
	}

	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageInfo() {
		return this.messageInfo;
	}
	public void setMessageInfo(String messageInfo) {
		this.messageInfo = messageInfo;
	}

	public String getReturnType() {
		return this.returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
