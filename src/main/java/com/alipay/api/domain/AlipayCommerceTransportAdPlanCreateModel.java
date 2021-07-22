package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行广告计划添加
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:33
 */
public class AlipayCommerceTransportAdPlanCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3588477257296917345L;

	/**
	 * 复杂类型，参见AdPlan定义
	 */
	@ApiField("ad_plan")
	private AdPlan adPlan;

	public AdPlan getAdPlan() {
		return this.adPlan;
	}
	public void setAdPlan(AdPlan adPlan) {
		this.adPlan = adPlan;
	}

}
