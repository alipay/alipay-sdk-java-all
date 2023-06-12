package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定向信息
 *
 * @author auto create
 * @since 1.0, 2023-03-26 14:15:43
 */
public class RecruitServingTarget extends AlipayObject {

	private static final long serialVersionUID = 4636172164428735763L;

	/**
	 * 定向城市信息。
	 */
	@ApiField("city")
	private RecruitServingTargetCity city;

	public RecruitServingTargetCity getCity() {
		return this.city;
	}
	public void setCity(RecruitServingTargetCity city) {
		this.city = city;
	}

}
