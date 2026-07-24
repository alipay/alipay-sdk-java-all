package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报告解读查询
 *
 * @author auto create
 * @since 1.0, 2026-06-08 17:57:56
 */
public class AlipayCommerceMedicalHealthfulfillmentReportinterpretationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4585839594713744333L;

	/**
	 * 聊天ID：报告解读批次号
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户ID
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
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

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
