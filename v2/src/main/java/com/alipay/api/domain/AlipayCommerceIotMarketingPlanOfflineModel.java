package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商海报投放下线接口
 *
 * @author auto create
 * @since 1.0, 2025-10-13 17:59:10
 */
public class AlipayCommerceIotMarketingPlanOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 7583633413357355698L;

	/**
	 * 投放计划id，取海报投放创建接口返回的plan_id
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
