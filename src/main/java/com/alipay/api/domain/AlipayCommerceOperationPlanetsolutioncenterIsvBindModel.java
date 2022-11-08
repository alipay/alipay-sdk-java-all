package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字化服务商解决方案CODE绑定接口
 *
 * @author auto create
 * @since 1.0, 2022-04-25 18:28:48
 */
public class AlipayCommerceOperationPlanetsolutioncenterIsvBindModel extends AlipayObject {

	private static final long serialVersionUID = 2232263897828267834L;

	/**
	 * 解决方案唯一标识
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
