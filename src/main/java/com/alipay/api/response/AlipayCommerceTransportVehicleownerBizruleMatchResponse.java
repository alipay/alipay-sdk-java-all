package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.bizrule.match response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-03 22:48:27
 */
public class AlipayCommerceTransportVehicleownerBizruleMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 1229161312672982565L;

	/** 
	 * 匹配详情
	 */
	@ApiField("match_result")
	private String matchResult;

	public void setMatchResult(String matchResult) {
		this.matchResult = matchResult;
	}
	public String getMatchResult( ) {
		return this.matchResult;
	}

}
