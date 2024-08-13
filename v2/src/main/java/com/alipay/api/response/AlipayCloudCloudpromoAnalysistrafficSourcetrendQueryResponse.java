package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisTrafficSourceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysistraffic.sourcetrend.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 14:57:07
 */
public class AlipayCloudCloudpromoAnalysistrafficSourcetrendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5534955994359763658L;

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
