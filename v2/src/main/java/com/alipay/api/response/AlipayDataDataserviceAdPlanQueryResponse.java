package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OuterPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.plan.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:08:21
 */
public class AlipayDataDataserviceAdPlanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2131391576758296322L;

	/** 
	 * 计划详情
	 */
	@ApiField("plan_detail")
	private OuterPlan planDetail;

	public void setPlanDetail(OuterPlan planDetail) {
		this.planDetail = planDetail;
	}
	public OuterPlan getPlanDetail( ) {
		return this.planDetail;
	}

}
