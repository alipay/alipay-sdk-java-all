package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.agent.answerfeedback.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-12 17:37:19
 */
public class AnttechAiAgentAnswerfeedbackSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5875836341525464839L;

	/** 
	 * 单次对话反馈结果
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
