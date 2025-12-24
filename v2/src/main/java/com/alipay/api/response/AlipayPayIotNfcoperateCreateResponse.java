package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.iot.nfcoperate.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-25 21:02:26
 */
public class AlipayPayIotNfcoperateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8123569494144528451L;

	/** 
	 * 生成活动主键
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
