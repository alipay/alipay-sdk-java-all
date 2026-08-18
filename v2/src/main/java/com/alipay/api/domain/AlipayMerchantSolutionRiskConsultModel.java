package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连解决方案风险咨询
 *
 * @author auto create
 * @since 1.0, 2026-08-03 15:06:41
 */
public class AlipayMerchantSolutionRiskConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8494711244956884472L;

	/**
	 * 标识唯一的解决方案
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
