package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MetroOdDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.metrood.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:09:13
 */
public class AlipayDataAiserviceCloudbusMetroodQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7548929124479916634L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private MetroOdDetailResult result;

	public void setResult(MetroOdDetailResult result) {
		this.result = result;
	}
	public MetroOdDetailResult getResult( ) {
		return this.result;
	}

}
