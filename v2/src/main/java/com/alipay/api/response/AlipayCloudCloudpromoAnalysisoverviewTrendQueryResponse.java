package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysisoverview.trend.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 17:37:11
 */
public class AlipayCloudCloudpromoAnalysisoverviewTrendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4461234243198254295L;

	/** 
	 * 经营概况总览接口返回数据
	 */
	@ApiField("result")
	private OpenApiOperationalAnalysisResult result;

	public void setResult(OpenApiOperationalAnalysisResult result) {
		this.result = result;
	}
	public OpenApiOperationalAnalysisResult getResult( ) {
		return this.result;
	}

}
