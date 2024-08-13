package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisGoodsResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysiscommodity.commodityoverview.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 14:57:07
 */
public class AlipayCloudCloudpromoAnalysiscommodityCommodityoverviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3711666789342431862L;

	/** 
	 * 数据结果
	 */
	@ApiField("results")
	private OpenApiOperationalAnalysisGoodsResult results;

	public void setResults(OpenApiOperationalAnalysisGoodsResult results) {
		this.results = results;
	}
	public OpenApiOperationalAnalysisGoodsResult getResults( ) {
		return this.results;
	}

}
