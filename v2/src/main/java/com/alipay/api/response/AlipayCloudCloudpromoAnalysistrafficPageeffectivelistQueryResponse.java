package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisTrafficPageResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysistraffic.pageeffectivelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 17:37:12
 */
public class AlipayCloudCloudpromoAnalysistrafficPageeffectivelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7373994115745558823L;

	/** 
	 * 数据结果
	 */
	@ApiField("results")
	private OpenApiOperationalAnalysisTrafficPageResult results;

	public void setResults(OpenApiOperationalAnalysisTrafficPageResult results) {
		this.results = results;
	}
	public OpenApiOperationalAnalysisTrafficPageResult getResults( ) {
		return this.results;
	}

}
