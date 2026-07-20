package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-26 13:42:49
 */
public class ReportCommentDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 3349737667575479595L;

	/**
	 * 详细描述
	 */
	@ApiField("details")
	private String details;

	/**
	 * 字段名称
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 十分制
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 百分比
	 */
	@ApiField("weight")
	private Long weight;

	public String getDetails() {
		return this.details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
