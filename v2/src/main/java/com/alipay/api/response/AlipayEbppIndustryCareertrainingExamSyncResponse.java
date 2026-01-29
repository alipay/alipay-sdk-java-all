package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.exam.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:22:36
 */
public class AlipayEbppIndustryCareertrainingExamSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3345725425335562524L;

	/** 
	 * 评价ID
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
