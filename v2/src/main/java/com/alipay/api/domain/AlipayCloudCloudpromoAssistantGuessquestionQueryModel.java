package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销AI助手猜你想问查询
 *
 * @author auto create
 * @since 1.0, 2024-07-15 16:20:32
 */
public class AlipayCloudCloudpromoAssistantGuessquestionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4764833355796887996L;

	/**
	 * 场景类唯一标识符
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 会话唯一标识，用来表是否是同一个会话，用户传递时使用用户的标识，没有传递时系统自动生成会话id进行标识。
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用于标识请求方的来源id，由接口提供方的请求方进行约定
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
