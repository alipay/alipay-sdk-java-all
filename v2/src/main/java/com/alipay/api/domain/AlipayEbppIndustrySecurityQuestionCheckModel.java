package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业AI提供的对话提问安全检测
 *
 * @author auto create
 * @since 1.0, 2025-06-09 13:46:48
 */
public class AlipayEbppIndustrySecurityQuestionCheckModel extends AlipayObject {

	private static final long serialVersionUID = 8424341124931476956L;

	/**
	 * 机器人对话id。在机器人对话接口出参中会返回该值。
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 访客ID，由调用方提供，比如：自有app用户id、微信用户id等
	 */
	@ApiField("identify_id")
	private String identifyId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机器人问答中用户提的问题
	 */
	@ApiField("question")
	private String question;

	/**
	 * 提问格式
	 */
	@ApiField("question_format")
	private String questionFormat;

	/**
	 * 机器人问答会话id。在机器人对话接口中会返回该值。
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getIdentifyId() {
		return this.identifyId;
	}
	public void setIdentifyId(String identifyId) {
		this.identifyId = identifyId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestionFormat() {
		return this.questionFormat;
	}
	public void setQuestionFormat(String questionFormat) {
		this.questionFormat = questionFormat;
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
