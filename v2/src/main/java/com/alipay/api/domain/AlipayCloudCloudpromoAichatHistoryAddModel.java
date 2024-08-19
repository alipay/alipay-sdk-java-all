package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加历史记录
 *
 * @author auto create
 * @since 1.0, 2024-08-13 18:01:29
 */
public class AlipayCloudCloudpromoAichatHistoryAddModel extends AlipayObject {

	private static final long serialVersionUID = 1822723397944257344L;

	/**
	 * 答案
	 */
	@ApiField("answer")
	private String answer;

	/**
	 * 客户唯一标识，表示目前正在使用问答服务的用户的唯一标识，该字段由客户提供。
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 用户提问内容
	 */
	@ApiField("question")
	private String question;

	/**
	 * 标识某个bot，该字段由和客户约定产生。
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 会话ID，标识一通包含多轮对话的问答。该字段由客户进行维护。
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 提问时间，unix时间戳，单位：秒
	 */
	@ApiField("time")
	private String time;

	public String getAnswer() {
		return this.answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
