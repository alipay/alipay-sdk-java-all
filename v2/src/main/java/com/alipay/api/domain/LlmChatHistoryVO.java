package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 历史会话出参模型
 *
 * @author auto create
 * @since 1.0, 2026-01-15 14:18:57
 */
public class LlmChatHistoryVO extends AlipayObject {

	private static final long serialVersionUID = 1744183844138224722L;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 业务属性信息
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 对话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 内容类型
	 */
	@ApiField("chat_type")
	private String chatType;

	/**
	 * 与前端交互内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户query词
	 */
	@ApiField("query")
	private String query;

	/**
	 * 提问类型
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 模板数据
	 */
	@ApiField("template_data")
	private String templateData;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板类型
	 */
	@ApiField("template_type")
	private String templateType;

	/**
	 * 时间戳
	 */
	@ApiField("time")
	private Long time;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getChatType() {
		return this.chatType;
	}
	public void setChatType(String chatType) {
		this.chatType = chatType;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getTemplateData() {
		return this.templateData;
	}
	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	public Long getTime() {
		return this.time;
	}
	public void setTime(Long time) {
		this.time = time;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
