package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云AI助手服务配置查询
 *
 * @author auto create
 * @since 1.0, 2024-10-23 21:10:17
 */
public class AlipayCloudCloudpromoAssistantServiceconfQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5676514578961341966L;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 会话唯一标识，用来表是否是同一个会话，用户传递时使用用户的标识，没有传递时系统自动生成会话id进行标识
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
