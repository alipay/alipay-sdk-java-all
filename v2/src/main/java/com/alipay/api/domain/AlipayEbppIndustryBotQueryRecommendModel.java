package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能助理机器人继续问推荐
 *
 * @author auto create
 * @since 1.0, 2025-04-25 16:37:21
 */
public class AlipayEbppIndustryBotQueryRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 4351674543484719319L;

	/**
	 * 在获取不到用户定位时，传递的兜底城市编码
	 */
	@ApiField("actual_city_code")
	private String actualCityCode;

	/**
	 * 机器人id。由业务交付同学在光华平台创建机器人后，提供给机构
	 */
	@ApiField("bot_id")
	private String botId;

	/**
	 * 机器人对话id。在机器人对话接口出参中会返回该值。
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 通过用户定位获取到的城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

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
	 * 用户提问的问题，同对话接口中传递的query值
	 */
	@ApiField("query")
	private String query;

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

	public String getActualCityCode() {
		return this.actualCityCode;
	}
	public void setActualCityCode(String actualCityCode) {
		this.actualCityCode = actualCityCode;
	}

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

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
