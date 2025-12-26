package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能助理机器人会话聊天记录查询
 *
 * @author auto create
 * @since 1.0, 2025-03-26 22:42:52
 */
public class AlipayEbppIndustryBotChatQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3612199345684313867L;

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
	 * 分页查询时当前的页码，不传默认为1。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询大小，即每页查询多少条记录。单位：个。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 聊天窗场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 会话id
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

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
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
