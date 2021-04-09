package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手艺人子评分项
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:34:49
 */
public class CraftsmanSubAssessment extends AlipayObject {

	private static final long serialVersionUID = 2112211932673275372L;

	/**
	 * 子评分
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 子评分项名
	 */
	@ApiField("title")
	private String title;

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
