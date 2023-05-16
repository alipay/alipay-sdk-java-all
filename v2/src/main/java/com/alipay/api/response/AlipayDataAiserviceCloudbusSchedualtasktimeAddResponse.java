package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualtasktime.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 16:34:34
 */
public class AlipayDataAiserviceCloudbusSchedualtasktimeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2833142292225628613L;

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
