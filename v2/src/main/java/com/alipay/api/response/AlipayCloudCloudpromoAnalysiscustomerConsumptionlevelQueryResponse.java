package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiCustomerAnalysisTradeLevelResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysiscustomer.consumptionlevel.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 14:57:06
 */
public class AlipayCloudCloudpromoAnalysiscustomerConsumptionlevelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4469418534225957557L;

	/** 
	 * 数据结果
	 */
	@ApiField("results")
	private OpenApiCustomerAnalysisTradeLevelResult results;

	public void setResults(OpenApiCustomerAnalysisTradeLevelResult results) {
		this.results = results;
	}
	public OpenApiCustomerAnalysisTradeLevelResult getResults( ) {
		return this.results;
	}

}
