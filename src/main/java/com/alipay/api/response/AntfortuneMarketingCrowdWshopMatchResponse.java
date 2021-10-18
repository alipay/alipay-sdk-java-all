package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.crowd.wshop.match response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:56
 */
public class AntfortuneMarketingCrowdWshopMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3623226924583214391L;

	/** 
	 * 用户是否匹配人群，枚举值：true/false
	 */
	@ApiField("match_result")
	private Boolean matchResult;

	public void setMatchResult(Boolean matchResult) {
		this.matchResult = matchResult;
	}
	public Boolean getMatchResult( ) {
		return this.matchResult;
	}

}
