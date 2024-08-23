package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysisoverview.applist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 14:57:07
 */
public class AlipayCloudCloudpromoAnalysisoverviewApplistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4311243274899345483L;

	/** 
	 * 经营概况小程序列表接口返回数据结果
	 */
	@ApiField("results")
	private OpenApiOperationalAnalysisResult results;

	public void setResults(OpenApiOperationalAnalysisResult results) {
		this.results = results;
	}
	public OpenApiOperationalAnalysisResult getResults( ) {
		return this.results;
	}

}
