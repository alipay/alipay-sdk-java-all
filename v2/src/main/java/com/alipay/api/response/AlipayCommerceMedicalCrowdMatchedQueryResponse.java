package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.crowd.matched.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-28 11:17:44
 */
public class AlipayCommerceMedicalCrowdMatchedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5454252386295251278L;

	/** 
	 * 是否匹配人群包
	 */
	@ApiField("matched_res")
	private Boolean matchedRes;

	public void setMatchedRes(Boolean matchedRes) {
		this.matchedRes = matchedRes;
	}
	public Boolean getMatchedRes( ) {
		return this.matchedRes;
	}

}
