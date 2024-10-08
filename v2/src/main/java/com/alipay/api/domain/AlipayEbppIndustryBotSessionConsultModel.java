package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能助理机器人对话问答
 *
 * @author auto create
 * @since 1.0, 2024-08-27 21:32:15
 */
public class AlipayEbppIndustryBotSessionConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4815579178941587672L;

	/**
	 * 业务扩展信息
	 */
	@ApiField("biz_info")
	private BotBizInfo bizInfo;

	/**
	 * 问答机器人id。机构在光华平台配置智能体后可以获取到该字段值。
	 */
	@ApiField("bot_id")
	private String botId;

	/**
	 * 业务请求的来源。 alipay：支付宝端内请求 pc：pc端内请求 app：业务机构自研app请求
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
	 * 用户提问的问题
	 */
	@ApiField("query")
	private String query;

	/**
	 * 提问关联的问答id。在上一轮对话接口中会返回chat_id字段，取该字段值即可。
	 */
	@ApiField("ref_chat_id")
	private String refChatId;

	/**
	 * 问答工具聊天窗场景。目前只需要传default。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 会话id。在机器人会话创建接口中会返回session_id。
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 大模型问答时是否以消息流的方式推送。默认为：true
	 */
	@ApiField("stream_output")
	private Boolean streamOutput;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public BotBizInfo getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(BotBizInfo bizInfo) {
		this.bizInfo = bizInfo;
	}

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

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getRefChatId() {
		return this.refChatId;
	}
	public void setRefChatId(String refChatId) {
		this.refChatId = refChatId;
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

	public Boolean getStreamOutput() {
		return this.streamOutput;
	}
	public void setStreamOutput(Boolean streamOutput) {
		this.streamOutput = streamOutput;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
