package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品常见问题
 *
 * @author auto create
 * @since 1.0, 2024-07-11 13:25:28
 */
public class ItemFrequentQA extends AlipayObject {

	private static final long serialVersionUID = 6243162445419467949L;

	/**
	 * 回答
	 */
	@ApiField("answer")
	private String answer;

	/**
	 * 问题
	 */
	@ApiField("question")
	private String question;

	public String getAnswer() {
		return this.answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

}
