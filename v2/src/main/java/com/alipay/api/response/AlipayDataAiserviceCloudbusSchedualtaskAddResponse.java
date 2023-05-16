package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualtask.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:27:24
 */
public class AlipayDataAiserviceCloudbusSchedualtaskAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3241351918855697568L;

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
