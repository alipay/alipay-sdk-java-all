package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能助理机器人会话关闭
 *
 * @author auto create
 * @since 1.0, 2024-07-31 11:02:42
 */
public class AlipayEbppIndustryBotSessionCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4532643758235364229L;

	/**
	 * 机器人id
	 */
	@ApiField("bot_id")
	private String botId;

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
	 * 机器人问答会话id
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

}
