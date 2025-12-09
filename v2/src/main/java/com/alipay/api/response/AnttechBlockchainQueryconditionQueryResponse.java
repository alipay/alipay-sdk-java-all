package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.querycondition.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 21:37:35
 */
public class AnttechBlockchainQueryconditionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8473468855247817858L;

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
