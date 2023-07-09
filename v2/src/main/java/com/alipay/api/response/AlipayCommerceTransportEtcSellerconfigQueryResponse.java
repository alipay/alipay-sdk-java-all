package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.sellerconfig.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:26:50
 */
public class AlipayCommerceTransportEtcSellerconfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2185314672523737737L;

	/** 
	 * 查询得到的发行方静态信息（图片、文字等配置信息）
	 */
	@ApiField("query_results")
	private String queryResults;

	public void setQueryResults(String queryResults) {
		this.queryResults = queryResults;
	}
	public String getQueryResults( ) {
		return this.queryResults;
	}

}
