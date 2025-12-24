package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * FAQ问答信息
 *
 * @author auto create
 * @since 1.0, 2024-12-26 10:20:19
 */
public class FaqInfo extends AlipayObject {

	private static final long serialVersionUID = 5578538487747664162L;

	/**
	 * FAQ问答中的回答
	 */
	@ApiField("answer")
	private String answer;

	/**
	 * 扩展问法
	 */
	@ApiField("expand")
	private String expand;

	/**
	 * FAQ对话中的提问
	 */
	@ApiField("question")
	private String question;

	public String getAnswer() {
		return this.answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getExpand() {
		return this.expand;
	}
	public void setExpand(String expand) {
		this.expand = expand;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

}
