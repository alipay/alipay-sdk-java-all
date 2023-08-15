package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发布花呗分期商家贴息方案实例
 *
 * @author auto create
 * @since 1.0, 2022-05-16 17:48:50
 */
public class AlipayPcreditHuabeiDiscountSolutionOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 1836688575875449643L;

	/**
	 * solution_id，贴息方案实例id
	 */
	@ApiField("solution_id")
	private String solutionId;

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

}
