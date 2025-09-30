package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExecutionPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.cyclepayauthplans.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-30 20:22:04
 */
public class AlipayUserAgreementCyclepayauthplansModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6273225441325235895L;

	/** 
	 * 执行扣款计划详情
	 */
	@ApiField("execution_plans")
	private ExecutionPlan executionPlans;

	public void setExecutionPlans(ExecutionPlan executionPlans) {
		this.executionPlans = executionPlans;
	}
	public ExecutionPlan getExecutionPlans( ) {
		return this.executionPlans;
	}

}
