package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 选项详情
 *
 * @author auto create
 * @since 1.0, 2026-09-08 17:33:22
 */
public class Options extends AlipayObject {

	private static final long serialVersionUID = 3398959558883233521L;

	/**
	 * 选项内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 题库标准答案标记：true 表示该选项为该题标准答案（题目固有属性，随报告回显）
	 */
	@ApiField("correct")
	private Boolean correct;

	/**
	 * 选项ID
	 */
	@ApiField("option_id")
	private String optionId;

	/**
	 * 选项得分/淘汰规则(分)
	 */
	@ApiField("score")
	private String score;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getCorrect() {
		return this.correct;
	}
	public void setCorrect(Boolean correct) {
		this.correct = correct;
	}

	public String getOptionId() {
		return this.optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
