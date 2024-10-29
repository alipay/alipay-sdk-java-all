package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.solution.save response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayFinancialnetAuthEcsignSolutionSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1141624697255632896L;

	/** 
	 * 解决方案码，唯一值。
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}
	public String getSolutionCode( ) {
		return this.solutionCode;
	}

}
