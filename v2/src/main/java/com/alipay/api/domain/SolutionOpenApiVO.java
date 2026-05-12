package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-19 15:37:43
 */
public class SolutionOpenApiVO extends AlipayObject {

	private static final long serialVersionUID = 1196796568313217943L;

	/**
	 * 方案code
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 方案名称
	 */
	@ApiField("solution_name")
	private String solutionName;

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

	public String getSolutionName() {
		return this.solutionName;
	}
	public void setSolutionName(String solutionName) {
		this.solutionName = solutionName;
	}

}
