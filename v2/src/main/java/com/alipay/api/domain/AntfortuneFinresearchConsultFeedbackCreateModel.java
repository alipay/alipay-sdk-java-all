package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会话内容意见反馈
 *
 * @author auto create
 * @since 1.0, 2024-04-18 15:46:00
 */
public class AntfortuneFinresearchConsultFeedbackCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2568635872426181992L;

	/**
	 * 回答
	 */
	@ApiField("answer")
	private String answer;

	/**
	 * 评论内容
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 咨询ID
	 */
	@ApiField("consult_id")
	private String consultId;

	/**
	 * 本次会话的主体ID
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 反馈类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 原始问题
	 */
	@ApiField("question")
	private String question;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getAnswer() {
		return this.answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getConsultId() {
		return this.consultId;
	}
	public void setConsultId(String consultId) {
		this.consultId = consultId;
	}

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
