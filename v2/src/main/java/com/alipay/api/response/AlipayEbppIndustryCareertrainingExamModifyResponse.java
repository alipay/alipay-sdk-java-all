package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.exam.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-13 16:27:40
 */
public class AlipayEbppIndustryCareertrainingExamModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5598671398621374831L;

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
