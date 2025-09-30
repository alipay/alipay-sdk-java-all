package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支小宝回复
 *
 * @author auto create
 * @since 1.0, 2023-10-07 20:54:46
 */
public class AlipayFinanceFinassistantcoreBotchatQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3786829835712134366L;

	/**
	 * 会话中每一轮的标识
	 */
	@ApiField("chat")
	private String chat;

	/**
	 * 用户问询的问题
	 */
	@ApiField("question")
	private String question;

	/**
	 * 会话唯一标识
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用户类型标识
	 */
	@ApiField("user_type")
	private String userType;

	public String getChat() {
		return this.chat;
	}
	public void setChat(String chat) {
		this.chat = chat;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
