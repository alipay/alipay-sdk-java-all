package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息内容。其中，chat 事件和 message 事件的格式不同。
chat 事件中，data 为 Chat Object。
message、audio 事件中，data 为 Message Object。
 *
 * @author auto create
 * @since 1.0, 2025-08-01 00:22:34
 */
public class ChatResponseData extends AlipayObject {

	private static final long serialVersionUID = 6782691156314993524L;

	/**
	 * 要进行会话聊天的智能体ID。
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 要进行会话聊天的智能体版本。百宝箱智能体的版本号是”v1.0“，这里需要传入”1.0“。
	 */
	@ApiField("agent_version")
	private String agentVersion;

	/**
	 * 要进行会话聊天的智能体ID。
	 */
	@ApiField("bot_id")
	private String botId;

	/**
	 * 要进行会话聊天的智能体版本。
	 */
	@ApiField("bot_version")
	private String botVersion;

	/**
	 * 创建消息时的附加消息，获取消息时也会返回此附加消息。
	 */
	@ApiField("business_data")
	private String businessData;

	/**
	 * 对话 ID，即对话的唯一标识。
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 对话完成时间
	 */
	@ApiField("completed_time")
	private Date completedTime;

	/**
	 * 消息内容，包含文本、图片或文件。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 消息内容类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 会话 ID，即会话的唯一标识。
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 对话创建时间
	 */
	@ApiField("created_time")
	private Date createdTime;

	/**
	 * 记录最后一次错误信息（当status=FAILED时有效）
	 */
	@ApiField("last_error")
	private String lastError;

	/**
	 * Message ID，即消息的唯一标识。
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * 消息角色
	 */
	@ApiField("role")
	private String role;

	/**
	 * 对话的运行状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 消息类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 消息更新时间
	 */
	@ApiField("updated_time")
	private Date updatedTime;

	/**
	 * 会话资源使用情况统计。
	 */
	@ApiField("usage")
	private ChatUsage usage;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentVersion() {
		return this.agentVersion;
	}
	public void setAgentVersion(String agentVersion) {
		this.agentVersion = agentVersion;
	}

	public String getBotId() {
		return this.botId;
	}
	public void setBotId(String botId) {
		this.botId = botId;
	}

	public String getBotVersion() {
		return this.botVersion;
	}
	public void setBotVersion(String botVersion) {
		this.botVersion = botVersion;
	}

	public String getBusinessData() {
		return this.businessData;
	}
	public void setBusinessData(String businessData) {
		this.businessData = businessData;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public Date getCompletedTime() {
		return this.completedTime;
	}
	public void setCompletedTime(Date completedTime) {
		this.completedTime = completedTime;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getConversationId() {
		return this.conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getLastError() {
		return this.lastError;
	}
	public void setLastError(String lastError) {
		this.lastError = lastError;
	}

	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Date getUpdatedTime() {
		return this.updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public ChatUsage getUsage() {
		return this.usage;
	}
	public void setUsage(ChatUsage usage) {
		this.usage = usage;
	}

}
