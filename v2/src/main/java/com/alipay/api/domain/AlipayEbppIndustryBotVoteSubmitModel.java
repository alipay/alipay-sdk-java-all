package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能助理机器人会话点赞点踩接口
 *
 * @author auto create
 * @since 1.0, 2024-07-31 11:02:40
 */
public class AlipayEbppIndustryBotVoteSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7478536392618886864L;

	/**
	 * 机器人id，机构用户在政务智能助理开放平台创建的机器人id，若获取不到，可联系相关人员获取
	 */
	@ApiField("bot_id")
	private String botId;

	/**
	 * 对话id。在对话接口中会返回该参数。每次对话返回不同的对话id。
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 访客ID，由调用方提供，例如：自有app用户id
	 */
	@ApiField("identify_id")
	private String identifyId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机器人会话id。在会话创建接口中会返回该参数。
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户对机器人回答点踩时，选择点踩原因
	 */
	@ApiField("vote_reason")
	private String voteReason;

	/**
	 * 对机器人回答内容的投票。点赞、点踩。
	 */
	@ApiField("vote_type")
	private String voteType;

	public String getBotId() {
		return this.botId;
	}
	public void setBotId(String botId) {
		this.botId = botId;
	}

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

	public String getVoteReason() {
		return this.voteReason;
	}
	public void setVoteReason(String voteReason) {
		this.voteReason = voteReason;
	}

	public String getVoteType() {
		return this.voteType;
	}
	public void setVoteType(String voteType) {
		this.voteType = voteType;
	}

}
