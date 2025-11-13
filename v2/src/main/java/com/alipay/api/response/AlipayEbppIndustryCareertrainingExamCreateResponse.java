package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.exam.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 16:59:24
 */
public class AlipayEbppIndustryCareertrainingExamCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4398316747664177911L;

	/** 
	 * 考试ID
	 */
	@ApiField("exam_id")
	private String examId;

	public void setExamId(String examId) {
		this.examId = examId;
	}
	public String getExamId( ) {
		return this.examId;
	}

}
