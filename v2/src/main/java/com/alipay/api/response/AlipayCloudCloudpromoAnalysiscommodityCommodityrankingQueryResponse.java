package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisGoodsRankResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysiscommodity.commodityranking.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 15:07:06
 */
public class AlipayCloudCloudpromoAnalysiscommodityCommodityrankingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8849978572983834751L;

	/** 
	 * 数据结果
	 */
	@ApiField("results")
	private OpenApiOperationalAnalysisGoodsRankResult results;

	public void setResults(OpenApiOperationalAnalysisGoodsRankResult results) {
		this.results = results;
	}
	public OpenApiOperationalAnalysisGoodsRankResult getResults( ) {
		return this.results;
	}

}
