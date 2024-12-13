package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisCategoryRankResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysiscommodity.categoryranking.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 17:37:12
 */
public class AlipayCloudCloudpromoAnalysiscommodityCategoryrankingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5558385968987565332L;

	/** 
	 * 数据结果
	 */
	@ApiField("results")
	private OpenApiOperationalAnalysisCategoryRankResult results;

	public void setResults(OpenApiOperationalAnalysisCategoryRankResult results) {
		this.results = results;
	}
	public OpenApiOperationalAnalysisCategoryRankResult getResults( ) {
		return this.results;
	}

}
