package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 问答header部分
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:57:09
 */
public class ChatHeader extends AlipayObject {

	private static final long serialVersionUID = 5412834476413781637L;

	/**
	 * 业务场景信息
	 */
	@ApiField("biz_trans_data")
	private String bizTransData;

	/**
	 * 用户提问内容
	 */
	@ApiField("question")
	private String question;

	/**
	 * 引用内容
	 */
	@ApiListField("references")
	@ApiField("chat_reference")
	private List<ChatReference> references;

	/**
	 * 关联问
	 */
	@ApiListField("related_questions")
	@ApiField("string")
	private List<String> relatedQuestions;

	/**
	 * 一次问答唯一标识
	 */
	@ApiField("request_id")
	private String requestId;

	public String getBizTransData() {
		return this.bizTransData;
	}
	public void setBizTransData(String bizTransData) {
		this.bizTransData = bizTransData;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public List<ChatReference> getReferences() {
		return this.references;
	}
	public void setReferences(List<ChatReference> references) {
		this.references = references;
	}

	public List<String> getRelatedQuestions() {
		return this.relatedQuestions;
	}
	public void setRelatedQuestions(List<String> relatedQuestions) {
		this.relatedQuestions = relatedQuestions;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
