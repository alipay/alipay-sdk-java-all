package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能助理机器人会话创建
 *
 * @author auto create
 * @since 1.0, 2024-07-31 11:02:37
 */
public class AlipayEbppIndustryBotSessionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4434274467677744657L;

	/**
	 * 问答工具机器人id
	 */
	@ApiField("bot_id")
	private String botId;

	/**
	 * 业务请求的来源。
alipay：支付宝端内请求
pc：pc端内请求
app：业务机构自研app请求
	 */
	@ApiField("channel")
	private String channel;

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
	 * 问答工具聊天窗场景。目前只需要传default。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 访问者ip地址
	 */
	@ApiField("visitor_ip")
	private String visitorIp;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVisitorIp() {
		return this.visitorIp;
	}
	public void setVisitorIp(String visitorIp) {
		this.visitorIp = visitorIp;
	}

}
