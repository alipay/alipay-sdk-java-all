package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.agentframework.warrenq.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 10:36:57
 */
public class AntfortuneFinresearchAgentframeworkWarrenqGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2262468369455599959L;

	/** 
	 * 最终答案
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 执行的状态
	 */
	@ApiField("state")
	private String state;

	/** 
	 * 执行的中间过程
	 */
	@ApiField("steps")
	private String steps;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}
	public String getSteps( ) {
		return this.steps;
	}

}
