package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗导诊会话记录模型
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:59:02
 */
public class MedicalGuideDialogDTO extends AlipayObject {

	private static final long serialVersionUID = 6446622287489872514L;

	/**
	 * 当前轮次对话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 对话内容
	 */
	@ApiField("content")
	private MedicalGuideContentDTO content;

	/**
	 * 当前轮次具体输入内容
	 */
	@ApiField("question")
	private String question;

	/**
	 * 当前轮次提问类型
	 */
	@ApiField("question_type")
	private String questionType;

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public MedicalGuideContentDTO getContent() {
		return this.content;
	}
	public void setContent(MedicalGuideContentDTO content) {
		this.content = content;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestionType() {
		return this.questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

}
