package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.putplan.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:54:52
 */
public class DatadigitalFincloudFinsaasPutplanCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6828574964647197614L;

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
