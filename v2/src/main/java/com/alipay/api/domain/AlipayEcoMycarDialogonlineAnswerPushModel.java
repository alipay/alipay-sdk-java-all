package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主在线问答技师回复
 *
 * @author auto create
 * @since 1.0, 2020-11-17 10:09:09
 */
public class AlipayEcoMycarDialogonlineAnswerPushModel extends AlipayObject {

	private static final long serialVersionUID = 5314412297883441324L;

	/**
	 * 回复内容
	 */
	@ApiField("answer_content")
	private String answerContent;

	/**
	 * 技师ID
	 */
	@ApiField("answer_id")
	private String answerId;

	/**
	 * 技师头像
	 */
	@ApiField("answer_logo")
	private String answerLogo;

	/**
	 * 技师昵称
	 */
	@ApiField("answer_name")
	private String answerName;

	/**
	 * 回复图片
	 */
	@ApiField("answer_pic")
	private String answerPic;

	/**
	 * 回复时间
	 */
	@ApiField("answer_time")
	private String answerTime;

	/**
	 * 1：问题回复， 2：对话回复
	 */
	@ApiField("answer_type")
	private String answerType;

	/**
	 * 内容类型，1：文本， 2：图片
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 问题ID
	 */
	@ApiField("question_id")
	private String questionId;

	public String getAnswerContent() {
		return this.answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	public String getAnswerId() {
		return this.answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

	public String getAnswerLogo() {
		return this.answerLogo;
	}
	public void setAnswerLogo(String answerLogo) {
		this.answerLogo = answerLogo;
	}

	public String getAnswerName() {
		return this.answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

	public String getAnswerPic() {
		return this.answerPic;
	}
	public void setAnswerPic(String answerPic) {
		this.answerPic = answerPic;
	}

	public String getAnswerTime() {
		return this.answerTime;
	}
	public void setAnswerTime(String answerTime) {
		this.answerTime = answerTime;
	}

	public String getAnswerType() {
		return this.answerType;
	}
	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getQuestionId() {
		return this.questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

}
