package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字科技Agent智能体多轮对话回答反馈
 *
 * @author auto create
 * @since 1.0, 2024-11-12 17:33:36
 */
public class AnttechAiAgentAnswerfeedbackSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7422288436463647487L;

	/**
	 * 反馈评价参数
	 */
	@ApiField("feedback")
	private String feedback;

	/**
	 * 标识同一次对话的id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 场景用户id
	 */
	@ApiField("scene_user_id")
	private String sceneUserId;

	/**
	 * 标识同一次多轮对话的id，sessionId相同表示用户在同一会话中
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getFeedback() {
		return this.feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getSceneUserId() {
		return this.sceneUserId;
	}
	public void setSceneUserId(String sceneUserId) {
		this.sceneUserId = sceneUserId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
