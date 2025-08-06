package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.engineering.infrastructure.anttestops.testcase.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-09 14:01:56
 */
public class AlipayEngineeringInfrastructureAnttestopsTestcaseTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 5683242868945239781L;

	/** 
	 * 用例执行结果primaryid
	 */
	@ApiField("case_execute_result_id")
	private Long caseExecuteResultId;

	public void setCaseExecuteResultId(Long caseExecuteResultId) {
		this.caseExecuteResultId = caseExecuteResultId;
	}
	public Long getCaseExecuteResultId( ) {
		return this.caseExecuteResultId;
	}

}
