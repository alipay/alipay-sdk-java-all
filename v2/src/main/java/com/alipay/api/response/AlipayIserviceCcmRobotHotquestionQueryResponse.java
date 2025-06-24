package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuestionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.robot.hotquestion.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-15 14:22:07
 */
public class AlipayIserviceCcmRobotHotquestionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4377182286655897627L;

	/** 
	 * 聊天窗配置的热门问题
	 */
	@ApiListField("questions")
	@ApiField("question_info")
	private List<QuestionInfo> questions;

	public void setQuestions(List<QuestionInfo> questions) {
		this.questions = questions;
	}
	public List<QuestionInfo> getQuestions( ) {
		return this.questions;
	}

}
