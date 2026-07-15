package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuestionInfoOpenapiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.homedoctor.followupquestions.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-14 14:14:39
 */
public class AlipayCommerceMedicalHomedoctorFollowupquestionsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5127936687815736967L;

	/** 
	 * null
	 */
	@ApiListField("question_list")
	@ApiField("question_info_openapi_response")
	private List<QuestionInfoOpenapiResponse> questionList;

	public void setQuestionList(List<QuestionInfoOpenapiResponse> questionList) {
		this.questionList = questionList;
	}
	public List<QuestionInfoOpenapiResponse> getQuestionList( ) {
		return this.questionList;
	}

}
