package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.solution.save response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 10:16:57
 */
public class AlipayFinancialnetAuthEcsignSolutionSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2278846562461856358L;

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
