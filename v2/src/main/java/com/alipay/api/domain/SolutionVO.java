package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-10 10:20:43
 */
public class SolutionVO extends AlipayObject {

	private static final long serialVersionUID = 4566329466719236558L;

	/**
	 * 解决方案实例
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 解决方案名称
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
