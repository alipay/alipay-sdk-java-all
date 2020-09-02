package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.twc.preauthinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-27 16:32:26
 */
public class AnttechBlockchainTwcPreauthinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3113811786884338843L;

	/** 
	 * 是否核验通过
	 */
	@ApiField("match")
	private Boolean match;

	public void setMatch(Boolean match) {
		this.match = match;
	}
	public Boolean getMatch( ) {
		return this.match;
	}

}
