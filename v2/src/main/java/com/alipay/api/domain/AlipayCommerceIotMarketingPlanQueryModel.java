package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商海报投放计划查询
 *
 * @author auto create
 * @since 1.0, 2025-10-13 18:04:10
 */
public class AlipayCommerceIotMarketingPlanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4489485472914999669L;

	/**
	 * 投放计划id,取创建接口返回的plan_id
	 */
	@ApiField("plan_id")
	private String planId;

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
