package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗服务AI场景历史会话查询
 *
 * @author auto create
 * @since 1.0, 2026-01-15 14:22:42
 */
public class AlipayCommerceMedicalServiceaiChathistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3679911556911341196L;

	/**
	 * 智能体ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 对话ID
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 最近历史会话时间
	 */
	@ApiField("latest_time")
	private Long latestTime;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 外部用户的唯一ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public Long getLatestTime() {
		return this.latestTime;
	}
	public void setLatestTime(Long latestTime) {
		this.latestTime = latestTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
