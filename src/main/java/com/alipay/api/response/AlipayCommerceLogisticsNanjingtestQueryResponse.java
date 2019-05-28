package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.nanjingtest.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-17 19:50:01
 */
public class AlipayCommerceLogisticsNanjingtestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8319295684652564874L;

	/** 
	 * 出参的描述
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
