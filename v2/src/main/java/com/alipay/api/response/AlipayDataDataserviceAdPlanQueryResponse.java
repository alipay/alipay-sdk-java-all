package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OuterPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.plan.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:28:27
 */
public class AlipayDataDataserviceAdPlanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7736723581638748268L;

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
