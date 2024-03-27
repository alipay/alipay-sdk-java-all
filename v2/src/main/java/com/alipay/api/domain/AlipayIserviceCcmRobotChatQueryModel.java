package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人会话聊天记录查询
 *
 * @author auto create
 * @since 1.0, 2023-12-21 19:28:39
 */
public class AlipayIserviceCcmRobotChatQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2425873993519493635L;

	/**
	 * 聊天窗Code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 访问者ID
	 */
	@ApiField("visitor_id")
	private String visitorId;

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
