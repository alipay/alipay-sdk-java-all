package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询职业培训考试详情信息
 *
 * @author auto create
 * @since 1.0, 2025-08-18 14:27:36
 */
public class AlipayEbppIndustryCareertrainingExamQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7861649768171685912L;

	/**
	 * 评价ID
	 */
	@ApiField("exam_id")
	private String examId;

	/**
	 * 外部评价ID
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
