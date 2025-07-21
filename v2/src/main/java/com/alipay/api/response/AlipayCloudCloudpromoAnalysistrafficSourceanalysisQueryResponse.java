package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisTrafficSourceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysistraffic.sourceanalysis.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 17:37:11
 */
public class AlipayCloudCloudpromoAnalysistrafficSourceanalysisQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8589942772533231222L;

	/** 
	 * 数据结果
	 */
	@ApiField("results")
	private OpenApiOperationalAnalysisTrafficSourceResult results;

	public void setResults(OpenApiOperationalAnalysisTrafficSourceResult results) {
		this.results = results;
	}
	public OpenApiOperationalAnalysisTrafficSourceResult getResults( ) {
		return this.results;
	}

}
