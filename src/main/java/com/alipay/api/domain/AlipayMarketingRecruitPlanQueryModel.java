package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商方案详情查询
 *
 * @author auto create
 * @since 1.0, 2022-02-23 15:22:05
 */
public class AlipayMarketingRecruitPlanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8599145172195493799L;

	/**
	 * 招商方案ID
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
