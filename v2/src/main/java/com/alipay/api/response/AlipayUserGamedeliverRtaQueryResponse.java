package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gamedeliver.rta.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-10 16:02:49
 */
public class AlipayUserGamedeliverRtaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2823329957126642983L;

	/** 
	 * true-参竞
false-不参竞
	 */
	@ApiField("bid_decision")
	private Boolean bidDecision;

	public void setBidDecision(Boolean bidDecision) {
		this.bidDecision = bidDecision;
	}
	public Boolean getBidDecision( ) {
		return this.bidDecision;
	}

}
