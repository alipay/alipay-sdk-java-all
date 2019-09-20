package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.plan.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-30 21:39:59
 */
public class AlipayDataDataserviceAdPlanCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1663486843674217864L;

	/** 
	 * 计划id
	 */
	@ApiField("plan_id")
	private Long planId;

	/** 
	 * 外部计划编号
	 */
	@ApiField("plan_outer_id")
	private String planOuterId;

	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Long getPlanId( ) {
		return this.planId;
	}

	public void setPlanOuterId(String planOuterId) {
		this.planOuterId = planOuterId;
	}
	public String getPlanOuterId( ) {
		return this.planOuterId;
	}

}
