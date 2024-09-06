package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisGoodsDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysiscommodity.commoditytradedetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 14:57:06
 */
public class AlipayCloudCloudpromoAnalysiscommodityCommoditytradedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1386692618276867662L;

	/** 
	 * 数据结果
	 */
	@ApiField("results")
	private OpenApiOperationalAnalysisGoodsDetailResult results;

	public void setResults(OpenApiOperationalAnalysisGoodsDetailResult results) {
		this.results = results;
	}
	public OpenApiOperationalAnalysisGoodsDetailResult getResults( ) {
		return this.results;
	}

}
