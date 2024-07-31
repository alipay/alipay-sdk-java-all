package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.querycondition.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:25
 */
public class AnttechBlockchainQueryconditionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6361577721769514987L;

	/** 
	 * 春天来了
	 */
	@ApiField("season")
	private String season;

	public void setSeason(String season) {
		this.season = season;
	}
	public String getSeason( ) {
		return this.season;
	}

}
