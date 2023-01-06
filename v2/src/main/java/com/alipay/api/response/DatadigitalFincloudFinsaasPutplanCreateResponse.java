package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.putplan.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:52:46
 */
public class DatadigitalFincloudFinsaasPutplanCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8677532347419664326L;

	/** 
	 * 投放计划主键 id
	 */
	@ApiField("put_plan_id")
	private Long putPlanId;

	public void setPutPlanId(Long putPlanId) {
		this.putPlanId = putPlanId;
	}
	public Long getPutPlanId( ) {
		return this.putPlanId;
	}

}
