package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FixProblemDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.fix.taskproblem.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:03:18
 */
public class AlipayCommerceFixTaskproblemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6382543296378822989L;

	/** 
	 * 查询到的问题信息列表
	 */
	@ApiListField("problem_list")
	@ApiField("fix_problem_d_t_o")
	private List<FixProblemDTO> problemList;

	public void setProblemList(List<FixProblemDTO> problemList) {
		this.problemList = problemList;
	}
	public List<FixProblemDTO> getProblemList( ) {
		return this.problemList;
	}

}
