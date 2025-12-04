package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能体助理核身结果确认
 *
 * @author auto create
 * @since 1.0, 2025-08-08 18:15:42
 */
public class AlipayEbppIndustryBotVerifyCheckModel extends AlipayObject {

	private static final long serialVersionUID = 4179375626538229931L;

	/**
	 * 问答机器人id。机构在光华平台配置智能体后可以获取到该字段值。
	 */
	@ApiField("bot_id")
	private String botId;

	/**
	 * 会话id。在机器人会话对话接口中会返回chat_id。
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 问答工具场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 会话id。在机器人会话创建接口中会返回session_id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 核身id由行业智能体调用机构的mcp接口时传递过去，机构获取到核身id后再请求支付宝校验用户核身结果
	 */
	@ApiField("verify_id")
	private String verifyId;

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

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
