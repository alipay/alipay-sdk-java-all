package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.acp.reputation.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-29 13:07:48
 */
public class ZhimaCreditPeAcpReputationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6489722722593838188L;

	/** 
	 * 声誉事件i
	 */
	@ApiField("reputation_id")
	private String reputationId;

	public void setReputationId(String reputationId) {
		this.reputationId = reputationId;
	}
	public String getReputationId( ) {
		return this.reputationId;
	}

}
