package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.twc.tradeinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-25 17:02:26
 */
public class AnttechBlockchainTwcTradeinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3881792241353396766L;

	/** 
	 * 是否与订单的信息一致
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
