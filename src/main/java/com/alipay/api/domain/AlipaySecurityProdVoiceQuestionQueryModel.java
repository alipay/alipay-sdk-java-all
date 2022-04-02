package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反欺诈智能交互问答接口
 *
 * @author auto create
 * @since 1.0, 2020-09-02 17:12:22
 */
public class AlipaySecurityProdVoiceQuestionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7384385892581778233L;

	/**
	 * 本轮回答问题,除start阶段外每一轮需要返回用户的回答
	 */
	@ApiField("cur_answer")
	private String curAnswer;

	/**
	 * 此轮答复类型
	 */
	@ApiField("cur_answer_type")
	private String curAnswerType;

	/**
	 * 全局唯一标识，触发此回呼的事件，可以是uuid
	 */
	@ApiField("event_id")
	private String eventId;

	/**
	 * 发起阶段还是推进阶段
	 */
	@ApiField("phase")
	private String phase;

	/**
	 * 场景code,start阶段需要传，服务端以此选取模型启动参数集
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getCurAnswer() {
		return this.curAnswer;
	}
	public void setCurAnswer(String curAnswer) {
		this.curAnswer = curAnswer;
	}

	public String getCurAnswerType() {
		return this.curAnswerType;
	}
	public void setCurAnswerType(String curAnswerType) {
		this.curAnswerType = curAnswerType;
	}

	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getPhase() {
		return this.phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
