package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商删除考试信息
 *
 * @author auto create
 * @since 1.0, 2025-10-13 16:12:39
 */
public class AlipayEbppIndustryCareertrainingExamDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1269138336672396412L;

	/**
	 * 评价id，与out_exam_id至少传一个
	 */
	@ApiField("exam_id")
	private String examId;

	/**
	 * 外部评价id，与exam_id至少传一个
	 */
	@ApiField("out_exam_id")
	private String outExamId;

	public String getExamId() {
		return this.examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String getOutExamId() {
		return this.outExamId;
	}
	public void setOutExamId(String outExamId) {
		this.outExamId = outExamId;
	}

}
