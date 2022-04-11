package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:28:30
 */
public class AlipayMarketingToolFengdieActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6694289286349237657L;

	/** 
	 * H5应用详情
	 */
	@ApiField("activity")
	private FengdieActivity activity;

	public void setActivity(FengdieActivity activity) {
		this.activity = activity;
	}
	public FengdieActivity getActivity( ) {
		return this.activity;
	}

}
