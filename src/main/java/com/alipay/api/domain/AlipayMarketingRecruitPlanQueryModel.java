package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商方案详情查询
 *
 * @author auto create
 * @since 1.0, 2021-09-28 20:00:37
 */
public class AlipayMarketingRecruitPlanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7327264658427477159L;

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
