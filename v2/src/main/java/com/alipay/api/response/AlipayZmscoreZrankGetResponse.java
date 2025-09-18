package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayZmScoreZrankResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zmscore.zrank.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:16
 */
public class AlipayZmscoreZrankGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7677672257254283265L;

	/** 
	 * 芝麻分分段
	 */
	@ApiField("zm_score_zrank")
	private AlipayZmScoreZrankResult zmScoreZrank;

	public void setZmScoreZrank(AlipayZmScoreZrankResult zmScoreZrank) {
		this.zmScoreZrank = zmScoreZrank;
	}
	public AlipayZmScoreZrankResult getZmScoreZrank( ) {
		return this.zmScoreZrank;
	}

}
