package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.plan.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 15:46:23
 */
public class AlipayDataDataserviceAdcampaignPlanCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8849375422344164938L;

	/** 
	 * 计划ID，唯一键
	 */
	@ApiField("plan_id")
	private Long planId;

	/** 
	 * 计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Long getPlanId( ) {
		return this.planId;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanName( ) {
		return this.planName;
	}

}
