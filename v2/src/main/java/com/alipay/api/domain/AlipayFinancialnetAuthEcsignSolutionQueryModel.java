package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约解决方案查询详情服务
 *
 * @author auto create
 * @since 1.0, 2023-05-18 15:31:38
 */
public class AlipayFinancialnetAuthEcsignSolutionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3242471564946784343L;

	/**
	 * 解决方案码，唯一值。
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
