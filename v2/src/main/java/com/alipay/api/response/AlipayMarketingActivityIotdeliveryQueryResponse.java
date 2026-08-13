package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IoTDeliveryPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.iotdelivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-27 14:00:37
 */
public class AlipayMarketingActivityIotdeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2683754582165529451L;

	/** 
	 * 投放计划内容。当查不到对应投放计划内容时不返回
	 */
	@ApiField("plan_detail")
	private IoTDeliveryPlan planDetail;

	public void setPlanDetail(IoTDeliveryPlan planDetail) {
		this.planDetail = planDetail;
	}
	public IoTDeliveryPlan getPlanDetail( ) {
		return this.planDetail;
	}

}
