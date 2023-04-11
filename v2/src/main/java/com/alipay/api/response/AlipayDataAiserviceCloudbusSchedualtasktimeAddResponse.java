package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualtasktime.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 18:27:03
 */
public class AlipayDataAiserviceCloudbusSchedualtasktimeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5279475192672595794L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private CloudbusCommonResult result;

	public void setResult(CloudbusCommonResult result) {
		this.result = result;
	}
	public CloudbusCommonResult getResult( ) {
		return this.result;
	}

}
