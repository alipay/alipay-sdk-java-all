package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisGoodsDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysiscommodity.commoditytradedetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 17:42:10
 */
public class AlipayCloudCloudpromoAnalysiscommodityCommoditytradedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3375468751915974537L;

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
