package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.agent.sessionfeedback.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-05 20:47:19
 */
public class AnttechAiAgentSessionfeedbackSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6277999781913662358L;

	/** 
	 * 单次对话反馈结果，执行结果成功和失败
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
