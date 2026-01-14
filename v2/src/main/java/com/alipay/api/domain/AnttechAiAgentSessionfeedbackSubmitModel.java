package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字科技Agent智能体单次对话回答反馈
 *
 * @author auto create
 * @since 1.0, 2024-11-05 20:43:26
 */
public class AnttechAiAgentSessionfeedbackSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6662823687276959229L;

	/**
	 * 反馈评价参数
	 */
	@ApiField("feedback")
	private String feedback;

	/**
	 * 单次会话评分
	 */
	@ApiField("satisfaction")
	private Long satisfaction;

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

	public Long getSatisfaction() {
		return this.satisfaction;
	}
	public void setSatisfaction(Long satisfaction) {
		this.satisfaction = satisfaction;
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
