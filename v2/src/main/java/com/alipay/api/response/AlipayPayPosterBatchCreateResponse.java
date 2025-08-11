package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.poster.batch.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 17:27:33
 */
public class AlipayPayPosterBatchCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7192636717451584167L;

	/** 
	 * 生成的主键
	 */
	@ApiField("plan_id")
	private Long planId;

	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Long getPlanId( ) {
		return this.planId;
	}

}
