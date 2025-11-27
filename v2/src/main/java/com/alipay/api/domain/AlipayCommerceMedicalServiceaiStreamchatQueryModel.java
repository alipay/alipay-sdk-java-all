package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗服务AI场景流式会话
 *
 * @author auto create
 * @since 1.0, 2025-11-20 10:12:41
 */
public class AlipayCommerceMedicalServiceaiStreamchatQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6372277184751227112L;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 业务信息
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 对话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 外部用户ID
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/**
	 * 外部用户ID
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 当out_user_id为2088uid时，需将这个值设置为：ALIPAY_UID；当out_user_id为其他值时，可将这个值设置为：OTHER_UID，当传入out_open_id时，out_user_type对应的值为ALIPAY_OPENID
	 */
	@ApiField("out_user_type")
	private String outUserType;

	/**
	 * 用户问题描述，初始化时无query
	 */
	@ApiField("query")
	private String query;

	/**
	 * 用户提问类型
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 区分当前对话场景意图 待分配后传入固定值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getOutOpenId() {
		return this.outOpenId;
	}
	public void setOutOpenId(String outOpenId) {
		this.outOpenId = outOpenId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOutUserType() {
		return this.outUserType;
	}
	public void setOutUserType(String outUserType) {
		this.outUserType = outUserType;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
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

}
