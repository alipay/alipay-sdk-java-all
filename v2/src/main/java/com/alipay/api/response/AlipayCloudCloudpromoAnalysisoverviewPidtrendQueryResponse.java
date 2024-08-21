package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysisoverview.pidtrend.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 09:52:08
 */
public class AlipayCloudCloudpromoAnalysisoverviewPidtrendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3212566849429349836L;

	/** 
	 * 经营概况小程序商家趋势接口返回数据
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
