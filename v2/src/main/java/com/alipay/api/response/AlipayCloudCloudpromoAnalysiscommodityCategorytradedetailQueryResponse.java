package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisCategoryDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysiscommodity.categorytradedetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 14:57:06
 */
public class AlipayCloudCloudpromoAnalysiscommodityCategorytradedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2225441364167757932L;

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
