package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SolutionOpenVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.solution.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:01:55
 */
public class AlipayFinancialnetAuthEcsignSolutionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2362569685362966686L;

	/** 
	 * 解决方案试图对象
	 */
	@ApiField("solution_vo")
	private SolutionOpenVO solutionVo;

	public void setSolutionVo(SolutionOpenVO solutionVo) {
		this.solutionVo = solutionVo;
	}
	public SolutionOpenVO getSolutionVo( ) {
		return this.solutionVo;
	}

}
