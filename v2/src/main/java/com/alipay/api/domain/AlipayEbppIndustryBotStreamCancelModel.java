package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能助理机器人停止流式回答
 *
 * @author auto create
 * @since 1.0, 2024-10-21 14:59:18
 */
public class AlipayEbppIndustryBotStreamCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5468149831655435943L;

	/**
	 * 问答机器人id
	 */
	@ApiField("bot_id")
	private String botId;

	/**
	 * 业务请求的来源。 alipay：支付宝端内请求 wechat：微信端内请求 baidu：百度端内请求 pc：pc端内请求 app：业务机构自研app请求
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 对话id。
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 访客ID，由调用方提供
	 */
	@ApiField("identify_id")
	private String identifyId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 聊天窗场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 机器人会话id。
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBotId() {
		return this.botId;
	}
	public void setBotId(String botId) {
		this.botId = botId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
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
