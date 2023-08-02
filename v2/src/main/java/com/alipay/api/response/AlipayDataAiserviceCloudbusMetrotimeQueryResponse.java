package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MetroOdDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.metrotime.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:24:16
 */
public class AlipayDataAiserviceCloudbusMetrotimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4687651368121766386L;

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
