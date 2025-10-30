package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能助理问答记录详情
 *
 * @author auto create
 * @since 1.0, 2024-07-31 11:02:41
 */
public class BotChatLog extends AlipayObject {

	private static final long serialVersionUID = 8571542145747648544L;

	/**
	 * 机器人回答
	 */
	@ApiField("answer")
	private BotAnswer answer;

	/**
	 * 用户提问时间戳
	 */
	@ApiField("ask_time")
	private String askTime;

	/**
	 * 对话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 用户提问
	 */
	@ApiField("query")
	private String query;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 对话评价
	 */
	@ApiField("vote_type")
	private String voteType;

	public BotAnswer getAnswer() {
		return this.answer;
	}
	public void setAnswer(BotAnswer answer) {
		this.answer = answer;
	}

	public String getAskTime() {
		return this.askTime;
	}
	public void setAskTime(String askTime) {
		this.askTime = askTime;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getVoteType() {
		return this.voteType;
	}
	public void setVoteType(String voteType) {
		this.voteType = voteType;
	}

}
