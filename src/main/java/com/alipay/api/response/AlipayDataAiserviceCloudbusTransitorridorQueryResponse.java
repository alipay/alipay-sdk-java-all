package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusTransitResultItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.transitorridor.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-19 18:42:50
 */
public class AlipayDataAiserviceCloudbusTransitorridorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7474178589129568173L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private CloudbusTransitResultItem result;

	public void setResult(CloudbusTransitResultItem result) {
		this.result = result;
	}
	public CloudbusTransitResultItem getResult( ) {
		return this.result;
	}

}
