package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-29 14:32:38
 */
public class EduAssessmentScore extends AlipayObject {

	private static final long serialVersionUID = 5866277732844194623L;

	/**
	 * 评分维度
	 */
	@ApiField("name")
	private String name;

	/**
	 * 评分
	 */
	@ApiField("score")
	private String score;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
