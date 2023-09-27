package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MetroOdDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.metrotime.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:23:44
 */
public class AlipayDataAiserviceCloudbusMetrotimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5217683894116676183L;

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
