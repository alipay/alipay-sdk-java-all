package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisTrafficPageResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysistraffic.pageeffectivelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 09:52:08
 */
public class AlipayCloudCloudpromoAnalysistrafficPageeffectivelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8558133372323397491L;

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
