package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * QA会话信息
 *
 * @author auto create
 * @since 1.0, 2023-12-21 16:52:49
 */
public class QAChatDetail extends AlipayObject {

	private static final long serialVersionUID = 6426952249172688914L;

	/**
	 * 机器人回答详情
	 */
	@ApiField("answer")
	private RobotAnswer answer;

	/**
	 * DOCUMENT:大模型文档问答； KNOWLEDGE：知识点问答； DST：多轮问答； SORRY：致歉语；
	 */
	@ApiField("answer_type")
	private String answerType;

	/**
	 * 本次机器人回答的id
	 */
	@ApiField("chat_uuid")
	private String chatUuid;

	/**
	 * 问题内容
	 */
	@ApiField("query")
	private String query;

	/**
	 * 未评价:0
好评:1
差评:-1
	 */
	@ApiField("vote_type")
	private String voteType;

	public RobotAnswer getAnswer() {
		return this.answer;
	}
	public void setAnswer(RobotAnswer answer) {
		this.answer = answer;
	}

	public String getAnswerType() {
		return this.answerType;
	}
	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}

	public String getChatUuid() {
		return this.chatUuid;
	}
	public void setChatUuid(String chatUuid) {
		this.chatUuid = chatUuid;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getVoteType() {
		return this.voteType;
	}
	public void setVoteType(String voteType) {
		this.voteType = voteType;
	}

}
