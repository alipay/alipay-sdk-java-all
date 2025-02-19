package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人对话问答
 *
 * @author auto create
 * @since 1.0, 2023-12-11 10:26:10
 */
public class AlipayIserviceCcmRobotSessionConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4464884934736344171L;

	/**
	 * 会话额外信息保存,json格式 app_id：小程序appid信息
	 */
	@ApiField("biz_info")
	private BizInfo bizInfo;

	/**
	 * 文档列表
	 */
	@ApiField("document_ids")
	private String documentIds;

	/**
	 * 知识点id
	 */
	@ApiField("knowledge_id")
	private String knowledgeId;

	/**
	 * 问题内容
	 */
	@ApiField("query")
	private String query;

	/**
	 * 机器人code
	 */
	@ApiField("robot_code")
	private String robotCode;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 访客ID，由调用方提供，比如：微信用户id等
	 */
	@ApiField("visitor_id")
	private String visitorId;

	public BizInfo getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(BizInfo bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getDocumentIds() {
		return this.documentIds;
	}
	public void setDocumentIds(String documentIds) {
		this.documentIds = documentIds;
	}

	public String getKnowledgeId() {
		return this.knowledgeId;
	}
	public void setKnowledgeId(String knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getRobotCode() {
		return this.robotCode;
	}
	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
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

	public String getVisitorId() {
		return this.visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

}
