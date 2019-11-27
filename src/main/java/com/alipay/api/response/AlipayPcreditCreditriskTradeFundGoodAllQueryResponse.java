package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.creditrisk.trade.fund.good.all.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditCreditriskTradeFundGoodAllQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7891782191856229583L;

	/** 
	 * sdfsdf
	 */
	@ApiField("sdfsd")
	private String sdfsd;

	public void setSdfsd(String sdfsd) {
		this.sdfsd = sdfsd;
	}
	public String getSdfsd( ) {
		return this.sdfsd;
	}

}
