package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MetroOdDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.metrodetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 18:28:56
 */
public class AlipayDataAiserviceCloudbusMetrodetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8272449382421884468L;

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
