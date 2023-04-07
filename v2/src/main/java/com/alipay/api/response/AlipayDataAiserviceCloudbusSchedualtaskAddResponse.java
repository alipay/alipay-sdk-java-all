package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualtask.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:43:36
 */
public class AlipayDataAiserviceCloudbusSchedualtaskAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3142261314797365529L;

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
