package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.agent.answerfeedback.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-12 14:17:39
 */
public class AnttechAiAgentAnswerfeedbackSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6449663575146843997L;

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
