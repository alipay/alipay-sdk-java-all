package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisTrafficSourceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysistraffic.sourceanalysis.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 14:57:07
 */
public class AlipayCloudCloudpromoAnalysistrafficSourceanalysisQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4375961196235249775L;

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
