package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisCategoryDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysiscommodity.categorytradedetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 17:42:10
 */
public class AlipayCloudCloudpromoAnalysiscommodityCategorytradedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7254798365864378429L;

	/** 
	 * 数据结果
	 */
	@ApiField("results")
	private OpenApiOperationalAnalysisCategoryDetailResult results;

	public void setResults(OpenApiOperationalAnalysisCategoryDetailResult results) {
		this.results = results;
	}
	public OpenApiOperationalAnalysisCategoryDetailResult getResults( ) {
		return this.results;
	}

}
